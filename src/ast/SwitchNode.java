/**
 * 
 */
package ast;

import visitor.Visitor;
import util.PLp1Error;

/**
 * This class represents a switch expression
 * @author carr
 *
 */
public class SwitchNode extends ASTNode {

	public SwitchNode() {
	}

	/**
	 * @return the clauses
	 */
	public SwitchCaseListNode getCases() {
		return (SwitchCaseListNode)getChild(0);
	}
        
        public ASTNode getDefaultCase() {
            return getChild(1);
        }


	/* (non-Javadoc)
	 * @see ast.ASTNode#accept(visitor.Visitor)
	 */
	@Override
	public Object accept(Visitor<Object> visitor) throws PLp1Error {
		return visitor.visit(this);
	}

}
