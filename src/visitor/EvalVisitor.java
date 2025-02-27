/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import ast.ASTNode;
import ast.AddNode;
import ast.AndNode;
import ast.ArgumentListNode;
import ast.AssignNode;
import ast.BodyNode;
import ast.BooleanNode;
import ast.CallNode;
import ast.DivideNode;
import ast.EqualNode;
import ast.FloatNode;
import ast.FunctionDefinitionNode;
import ast.GreaterEqualNode;
import ast.GreaterNode;
import ast.IfNode;
import ast.IntegerNode;
import ast.LambdaNode;
import ast.LessEqualNode;
import ast.LessNode;
import ast.LetDeclListNode;
import ast.LetDeclNode;
import ast.LetNode;
import ast.ListNode;
import ast.MultiplyNode;
import ast.NotEqualNode;
import ast.NotNode;
import ast.NullNode;
import ast.OrNode;
import ast.ParameterListNode;
import ast.ParenNode;
import ast.ProgramNode;
import ast.StringNode;
import ast.SubNode;
import ast.SwitchCaseListNode;
import ast.SwitchCaseNode;
import ast.SwitchNode;
import ast.VarDefNode;
import ast.VarRefNode;
import java.util.ArrayList;
import java.util.List;
import util.BooleanValue;
import util.BuiltinFunction;
import util.ClosureValue;
import util.Environment;
import util.FloatValue;
import util.Function;
import util.IntValue;
import util.ListValue;
import util.PLp1Error;
import util.StringValue;
import util.Value;
import util.ValueFactory;
import util.ValueFactory.ValueType;

/**
 *
 * @author carr
 */
public class EvalVisitor implements Visitor<Object> {

    private Environment env;
    private ValueFactory valueFactory;

    public EvalVisitor(Environment env) {
        this.env = env;
        valueFactory = new ValueFactory();
    }

    @Override
    public Value visit(ArgumentListNode n) throws PLp1Error {
        ArrayList<Value> list = new ArrayList<Value>();

        for (ASTNode node : n.getArguments()) {
            Value v = (Value) node.accept(this);
            list.add(v);
        }

        return valueFactory.makeValue(ValueType.LIST).addValue(list);
    }

    @Override
    public Value visit(AssignNode n) throws PLp1Error {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Value visit(BodyNode n) throws PLp1Error {
        Value v = valueFactory.makeValue(ValueType.VOID);
        
        for (ASTNode node : n.getBody()) 
            v = (Value)node.accept(this);
        
        return v;
    }

    @Override
    public Value visit(BooleanNode n) throws PLp1Error {
        return valueFactory.makeValue(ValueType.BOOL).addValue(n.getVal());
    }

    @Override
    public Value visit(CallNode n) throws PLp1Error {
        Value v = (Value) n.getArgs().accept(this);
        @SuppressWarnings("unchecked")
        List<Value> argvals = (List<Value>) ((ListValue) v).get();
        Value func = (Value) n.getFunc().accept(this);
        try {
            if(func instanceof BuiltinFunction)
                return ((BuiltinFunction) func).invoke(env, argvals);
            else if(func instanceof ClosureValue){
                ClosureValue closure = (ClosureValue) func; 
                List<String> vars = new ArrayList<String>(); 
                if(closure.getParameters().size() == argvals.size()) {
                    for(Value val: closure.getParameters()) 
                            vars.add(val.toString());
                } else {
                    throw new PLp1Error("Function call expected " + closure.getParameters().size() + " values but got " + argvals.size() + " values");
                }
                this.env = new Environment(vars, argvals, closure.getEnv());
                Value returnVal = (Value) closure.getBody().accept(this);
                this.env = closure.getEnv();
                return returnVal;
            } else
                return func;
        } catch (ClassCastException e) {
            SourceVisitor sv = new SourceVisitor();
            throw new PLp1Error("Invalid function call: " + n.accept(sv));
        }
    }

    @Override
    public Value visit(SwitchCaseNode n) throws PLp1Error {
        try {
            BooleanValue tv = (BooleanValue) n.getTestExpr().accept(this);
            if (tv.getBoolean()) {
                return (Value)n.getResultExpr().accept(this);
            }
        } catch (ClassCastException e) {
            throw new PLp1Error("Switch case test must return boolean "
                    + n.accept(new SourceVisitor()));
        }
 
        return null;
    }

    @Override
    public Value visit(SwitchNode n) throws PLp1Error {
        Value v = (Value) n.getCases().accept(this);
        if (v == null)
            v = (Value)n.getDefaultCase().accept(this);
        
        return v;
    }

    @Override
    public Value visit(FunctionDefinitionNode n) throws PLp1Error {
        ListValue params = (ListValue) n.getParams().accept(this);
        List<Value> vals = new ArrayList<Value>();
        int stopVal = params.length();
        for(int i = 0; i < stopVal; ++i){
            vals.add(params.first());
            params = params.rest();
        }
        
        ClosureValue closure = new ClosureValue(vals, n.getBody(), env);
        closure.setLabel(n.getName());
        env.put(n.getName(), closure);
        return closure;
    }

    @Override
    public Value visit(FloatNode n) throws PLp1Error {
        return valueFactory.makeValue(ValueType.FLOAT).addValue(n.getVal());
    }

    @Override
    public Value visit(LambdaNode n) throws PLp1Error {
        ListValue params = (ListValue) n.getParams().accept(this);
        List<Value> vals = new ArrayList<Value>();
        int stopVal = params.length();
        for(int i = 0; i < stopVal; ++i){
            vals.add(params.first());
            params = params.rest();
        }
        
        ClosureValue closure = new ClosureValue(vals, n.getBody(), env);
        closure.setLabel(n.getBody().toString());
        return closure;    
    }

    @Override
    public Value visit(IfNode n) throws PLp1Error {
         try {
            Value bv = (Value) n.getTestExpr().accept(this);
            if (((Boolean) bv.get()).booleanValue()) {
                return (Value) n.getThenExpr().accept(this);
            } else {
                return (Value) n.getElseExpr().accept(this);
            }
        } catch (ClassCastException e) {
            SourceVisitor sv = new SourceVisitor();
            throw new PLp1Error("Invalid boolean value in if test expression: " + n.getTestExpr().accept(sv));
        }
    }

    @Override
    public Value visit(IntegerNode n) throws PLp1Error {
        return valueFactory.makeValue(ValueType.INT).addValue(n.getVal());
    }

    @Override
    public Value visit(ListNode n) throws PLp1Error {
        ListValue l = (ListValue) valueFactory.makeValue(ValueType.LIST);

        for (ASTNode node : n.getList()) {
            l.append((Value) node.accept(this));
        }

        return l;

    }

    @Override
    public Value visit(StringNode n) throws PLp1Error {
        return valueFactory.makeValue(ValueType.STRING).addValue(n.getString());
    }

    @Override
    public Value visit(VarRefNode n) throws PLp1Error {
        return env.get(n.getId());
    }

    @Override
    public Value visit(LetNode n) throws PLp1Error {
        Environment oldenv = env;
        ListValue varList = (ListValue) n.getLetVarDecls().accept(this);
        List<String> vars = new ArrayList<String>();
        List<Value> vals = new ArrayList<Value>();
        int stopVal = varList.length();
        for(int i = 0; i < stopVal; ++i){
            vals.add(((ListValue) ((ListValue) varList.first()).rest()).first());
            vars.add (((ListValue) varList.first()).first().toString());
            varList = varList.rest();
        }

        for(int i  = 0; i < vars.size(); ++i ) {
            this.env.put(vars.get(i), vals.get(i));
        }

        Value returnVal = (Value) n.getBody().accept(this);
        this.env = oldenv;
        return returnVal;
    }

    @Override
    public Value visit(AddNode n) throws PLp1Error {
        Value lop = (Value) n.getLeftOperand().accept(this);
        Value rop = (Value) n.getRightOperand().accept(this);

        if (lop instanceof IntValue && rop instanceof IntValue) {
            return valueFactory.makeValue(ValueType.INT).addValue(((IntValue) lop).getInt() + ((IntValue) rop).getInt());
        } else if (lop instanceof FloatValue && rop instanceof IntValue) {
            return valueFactory.makeValue(ValueType.FLOAT).addValue(((FloatValue) lop).getFloat() + ((IntValue) rop).getInt());
        } else if (lop instanceof IntValue && rop instanceof FloatValue) {
            return valueFactory.makeValue(ValueType.FLOAT).addValue(((IntValue) lop).getInt() + ((FloatValue) rop).getFloat());
        } else if (lop instanceof FloatValue && rop instanceof FloatValue) {
            return valueFactory.makeValue(ValueType.FLOAT).addValue(((FloatValue) lop).getFloat() + ((FloatValue) rop).getFloat());
        } else {
            throw new PLp1Error("Incompatible types: " + lop + " + " + rop);
        }
    }

    @Override
    public Value visit(SubNode n) throws PLp1Error {
        Value lop = (Value) n.getLeftOperand().accept(this);
        Value rop = (Value) n.getRightOperand().accept(this);

        if (lop instanceof IntValue && rop instanceof IntValue) {
            return valueFactory.makeValue(ValueType.INT).addValue(((IntValue) lop).getInt() - ((IntValue) rop).getInt());
        } else if (lop instanceof FloatValue && rop instanceof IntValue) {
            return valueFactory.makeValue(ValueType.FLOAT).addValue(((FloatValue) lop).getFloat() - ((IntValue) rop).getInt());
        } else if (lop instanceof IntValue && rop instanceof FloatValue) {
            return valueFactory.makeValue(ValueType.FLOAT).addValue(((IntValue) lop).getInt() - ((FloatValue) rop).getFloat());
        } else if (lop instanceof FloatValue && rop instanceof FloatValue) {
            return valueFactory.makeValue(ValueType.FLOAT).addValue(((FloatValue) lop).getFloat() - ((FloatValue) rop).getFloat());
        } else {
            throw new PLp1Error("Incompatible types: " + lop + " - " + rop);
        }
    }

    @Override
    public Value visit(MultiplyNode n) throws PLp1Error {
        Value lop = (Value) n.getLeftOperand().accept(this);
        Value rop = (Value) n.getRightOperand().accept(this);

        if (lop instanceof IntValue && rop instanceof IntValue) {
            return valueFactory.makeValue(ValueType.INT).addValue(((IntValue) lop).getInt() * ((IntValue) rop).getInt());
        } else if (lop instanceof FloatValue && rop instanceof IntValue) {
            return valueFactory.makeValue(ValueType.FLOAT).addValue(((FloatValue) lop).getFloat() * ((IntValue) rop).getInt());
        } else if (lop instanceof IntValue && rop instanceof FloatValue) {
            return valueFactory.makeValue(ValueType.FLOAT).addValue(((IntValue) lop).getInt() * ((FloatValue) rop).getFloat());
        } else if (lop instanceof FloatValue && rop instanceof FloatValue) {
            return valueFactory.makeValue(ValueType.FLOAT).addValue(((FloatValue) lop).getFloat() * ((FloatValue) rop).getFloat());
        } else {
            throw new PLp1Error("Incompatible types: " + lop + " * " + rop);
        }
    }

    @Override
    public Value visit(DivideNode n) throws PLp1Error {
        Value lop = (Value) n.getLeftOperand().accept(this);
        Value rop = (Value) n.getRightOperand().accept(this);

        if (lop instanceof IntValue && rop instanceof IntValue) {
            return valueFactory.makeValue(ValueType.INT).addValue(((IntValue) lop).getInt() / ((IntValue) rop).getInt());
        } else if (lop instanceof FloatValue && rop instanceof IntValue) {
            return valueFactory.makeValue(ValueType.FLOAT).addValue(((FloatValue) lop).getFloat() / ((IntValue) rop).getInt());
        } else if (lop instanceof IntValue && rop instanceof FloatValue) {
            return valueFactory.makeValue(ValueType.FLOAT).addValue(((IntValue) lop).getInt() / ((FloatValue) rop).getFloat());
        } else if (lop instanceof FloatValue && rop instanceof FloatValue) {
            return valueFactory.makeValue(ValueType.FLOAT).addValue(((FloatValue) lop).getFloat() / ((FloatValue) rop).getFloat());
        } else {
            throw new PLp1Error("Incompatible types: " + lop + " / " + rop);
        }
    }

    @Override
    public Value visit(NotNode n) throws PLp1Error {
         Value lop = (Value) n.getOperand().accept(this);

        if (lop instanceof BooleanValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(!((BooleanValue) lop).getBoolean());
        } else {
            throw new PLp1Error("Incompatible type: !" + lop);
        }
    }

    @Override
    public Value visit(OrNode n) throws PLp1Error {
        Value lop = (Value) n.getLeftOperand().accept(this);
        Value rop = (Value) n.getRightOperand().accept(this);

        if (lop instanceof BooleanValue && rop instanceof BooleanValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((BooleanValue) lop).getBoolean() || ((BooleanValue) rop).getBoolean());
        } else {
            throw new PLp1Error("Incompatible types: " + lop + " || " + rop);
        }
    }

    @Override
    public Value visit(AndNode n) throws PLp1Error {
        Value lop = (Value) n.getLeftOperand().accept(this);
        Value rop = (Value) n.getRightOperand().accept(this);

        if (lop instanceof BooleanValue && rop instanceof BooleanValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((BooleanValue) lop).getBoolean() && ((BooleanValue) rop).getBoolean());
        } else {
            throw new PLp1Error("Incompatible types: " + lop + " && " + rop);
        }
    }

    @Override
    public Value visit(EqualNode n) throws PLp1Error {
        Value lop = (Value) n.getLeftOperand().accept(this);
        Value rop = (Value) n.getRightOperand().accept(this);

        if (lop instanceof IntValue && rop instanceof IntValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((IntValue) lop).getInt() == ((IntValue) rop).getInt());
        } else if (lop instanceof FloatValue && rop instanceof IntValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((FloatValue) lop).getFloat() == ((IntValue) rop).getInt());
        } else if (lop instanceof IntValue && rop instanceof FloatValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((IntValue) lop).getInt() == ((FloatValue) rop).getFloat());
        } else if (lop instanceof FloatValue && rop instanceof FloatValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((FloatValue) lop).getFloat() == ((FloatValue) rop).getFloat());
        } else {
            throw new PLp1Error("Incompatible types: " + lop + " == " + rop);
        }
    }

    @Override
    public Value visit(NotEqualNode n) throws PLp1Error {
        Value lop = (Value) n.getLeftOperand().accept(this);
        Value rop = (Value) n.getRightOperand().accept(this);

        if (lop instanceof IntValue && rop instanceof IntValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((IntValue) lop).getInt() != ((IntValue) rop).getInt());
        } else if (lop instanceof FloatValue && rop instanceof IntValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((FloatValue) lop).getFloat() != ((IntValue) rop).getInt());
        } else if (lop instanceof IntValue && rop instanceof FloatValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((IntValue) lop).getInt() != ((FloatValue) rop).getFloat());
        } else if (lop instanceof FloatValue && rop instanceof FloatValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((FloatValue) lop).getFloat() != ((FloatValue) rop).getFloat());
        } else {
            throw new PLp1Error("Incompatible types: " + lop + " != " + rop);
        }
    }

    @Override
    public Value visit(LessNode n) throws PLp1Error {
        Value lop = (Value) n.getLeftOperand().accept(this);
        Value rop = (Value) n.getRightOperand().accept(this);

        if (lop instanceof IntValue && rop instanceof IntValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((IntValue) lop).getInt() < ((IntValue) rop).getInt());
        } else if (lop instanceof FloatValue && rop instanceof IntValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((FloatValue) lop).getFloat() < ((IntValue) rop).getInt());
        } else if (lop instanceof IntValue && rop instanceof FloatValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((IntValue) lop).getInt() < ((FloatValue) rop).getFloat());
        } else if (lop instanceof FloatValue && rop instanceof FloatValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((FloatValue) lop).getFloat() < ((FloatValue) rop).getFloat());
        } else {
            throw new PLp1Error("Incompatible types: " + lop + " < " + rop);
        }
    }

    @Override
    public Value visit(LessEqualNode n) throws PLp1Error {
        Value lop = (Value) n.getLeftOperand().accept(this);
        Value rop = (Value) n.getRightOperand().accept(this);

        if (lop instanceof IntValue && rop instanceof IntValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((IntValue) lop).getInt() <= ((IntValue) rop).getInt());
        } else if (lop instanceof FloatValue && rop instanceof IntValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((FloatValue) lop).getFloat() <= ((IntValue) rop).getInt());
        } else if (lop instanceof IntValue && rop instanceof FloatValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((IntValue) lop).getInt() <= ((FloatValue) rop).getFloat());
        } else if (lop instanceof FloatValue && rop instanceof FloatValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((FloatValue) lop).getFloat() <= ((FloatValue) rop).getFloat());
        } else {
            throw new PLp1Error("Incompatible types: " + lop + " <= " + rop);
        }
    }

    @Override
    public Value visit(GreaterNode n) throws PLp1Error {
        Value lop = (Value) n.getLeftOperand().accept(this);
        Value rop = (Value) n.getRightOperand().accept(this);

        if (lop instanceof IntValue && rop instanceof IntValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((IntValue) lop).getInt() > ((IntValue) rop).getInt());
        } else if (lop instanceof FloatValue && rop instanceof IntValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((FloatValue) lop).getFloat() > ((IntValue) rop).getInt());
        } else if (lop instanceof IntValue && rop instanceof FloatValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((IntValue) lop).getInt() > ((FloatValue) rop).getFloat());
        } else if (lop instanceof FloatValue && rop instanceof FloatValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((FloatValue) lop).getFloat() > ((FloatValue) rop).getFloat());
        } else {
            throw new PLp1Error("Incompatible types: " + lop + " > " + rop);
        }
    }

    @Override
    public Value visit(GreaterEqualNode n) throws PLp1Error {
        Value lop = (Value) n.getLeftOperand().accept(this);
        Value rop = (Value) n.getRightOperand().accept(this);

        if (lop instanceof IntValue && rop instanceof IntValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((IntValue) lop).getInt() >= ((IntValue) rop).getInt());
        } else if (lop instanceof FloatValue && rop instanceof IntValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((FloatValue) lop).getFloat() >= ((IntValue) rop).getInt());
        } else if (lop instanceof IntValue && rop instanceof FloatValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((IntValue) lop).getInt() >= ((FloatValue) rop).getFloat());
        } else if (lop instanceof FloatValue && rop instanceof FloatValue) {
            return valueFactory.makeValue(ValueType.BOOL).addValue(((FloatValue) lop).getFloat() >= ((FloatValue) rop).getFloat());
        } else {
            throw new PLp1Error("Incompatible types: " + lop + " >= " + rop);
        }
    }

    @Override
    public Value visit(ParenNode n) throws PLp1Error {
        return (Value)n.getExpr().accept(this);
    }

    @Override
    public Value visit(ParameterListNode n) throws PLp1Error {
        ArrayList<Value> list = new ArrayList<Value>();

        for (ASTNode node : n.getIdList()) {
            Value v = (Value) node.accept(this);
            list.add(v);
        }

        return valueFactory.makeValue(ValueType.LIST).addValue(list);
    }

    @Override
    public Value visit(LetDeclNode n) throws PLp1Error {
        ListValue returnVal = new ListValue();
        returnVal.append((Value) n.getVar().accept(this));
        returnVal.append((Value) n.getValueExpr().accept(this));
        return returnVal;
    }

    @Override
    public Value visit(LetDeclListNode n) throws PLp1Error {
        ListValue returnVal = new ListValue();
        for(ASTNode node: n.getDecls()) {
            returnVal.append((Value) node.accept(this));
        }
        return returnVal;
    }

    @Override
    public Value visit(SwitchCaseListNode n) throws PLp1Error {
        for (ASTNode node : n.getSwitchCases()) {
            Value val = (Value) node.accept(this);
            if (val != null) {
                return val;
            }
        }
        return null;
    }

    @Override
    public Value visit(NullNode n) throws PLp1Error {
        return valueFactory.makeValue(ValueType.LIST);
    }

    @Override
    public Value visit(ProgramNode n) throws PLp1Error {
        Value v = valueFactory.makeValue(ValueType.VOID);
        for (ASTNode node: n.getProgram())
            v = (Value)node.accept(this);
        
        return v;
    }

    @Override
    public Value visit(VarDefNode n) throws PLp1Error {
        return (new StringValue()).addValue(n.getLabel());
    }
}
