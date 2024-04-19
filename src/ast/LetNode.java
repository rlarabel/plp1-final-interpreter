/**
 * 
 */
package ast;

import java.util.LinkedList;
import java.util.List;
import visitor.Visitor;
import util.PLp1Error;

/**
 * This class represents a with expression in L485
 * 
 * @author carr
 *
 */
public class LetNode extends ASTNode {
 
        List<String> vars;
        List<ASTNode> defs;
        
	public LetNode() {
	}

        public ASTNode getLetVarDecls() {
            return getChild(0);
        }

	/**
	 * @return the body of the let expression
	 */
	public ASTNode getBody() {
		return getChild(1);
	}

	/* (non-Javadoc)
	 * @see ast.ASTNode#accept(patterns.Visitor)
	 */
	@Override
	public Object accept(Visitor<Object> visitor) throws PLp1Error {
		return visitor.visit(this);
	}

}
