/**
 * 
 */
package util;

import java.util.List;

import ast.ASTNode;

/**
 * @author carr
 *
 */
public class ClosureValue extends Value {

	private List<Value> parameters;
    private ASTNode body; // Node represents the function body (e.g., an AST)
    private Environment env;

    public ClosureValue(List<Value> parameters, ASTNode body, Environment env) {
        this.parameters = parameters;
        this.body = body;
        this.env = env;
    }

    public List<Value> getParameters() {
        return parameters;
    }

    public ASTNode getBody() {
        return body;
    }

    public Environment getEnv() {
        return env;
    }

    @Override
    public Value addValue(Object val) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addValue'");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }

}
