/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

import util.PLp1Error;
import visitor.Visitor;

/**
 *
 * @author carr
 */
public class LetDeclNode extends ASTNode {
    
    public LetDeclNode() {
    }

    public ASTNode getVar() {
        return getChild(0);
    }

    public ASTNode getValueExpr() {
        return getChild(1);
    }

    @Override
    public Object accept(Visitor<Object> visitor) throws PLp1Error {
        return visitor.visit(this);
    }
    
    
    
}
