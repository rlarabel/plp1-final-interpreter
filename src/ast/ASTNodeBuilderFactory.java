/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

/**
 *
 * @author steve
 */
public class ASTNodeBuilderFactory {

    public static enum ASTNodeType {

        ADD, AND, ARGUMENTLIST, ASSIGN, BODY, BOOLEAN, CALL, CREATE,
        DIVIDE, EQUAL, FLOAT, FUNCTIONDEF, GREATEREQUAL, GREATER, IF,
        INTEGER, LAMBDA, LESSEQUAL, LESS, LETDECLLIST, LETDECL,
        LET, LIST, MULTIPLY, NOTEQUAL, NOT, NULL,
        OR, PARAMETERLIST, PAREN, PROGRAM, STRING, SUB, SWITCHCASELIST,
        SWITCHCASE, SWITCH, VARDEF, VARREF
    };
    
    public ASTNodeBuilder makeASTNodeBuilder(ASTNodeType nodeType) {
        return new ASTNodeBuilder(nodeType);
    }
}
