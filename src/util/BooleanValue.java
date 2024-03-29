/**
 * 
 */
package util;

/**
 * @author carr
 *
 */
public class BooleanValue extends Value {

	/**
	 * 
	 */
	public BooleanValue() {
	}
        
        public Value addValue(Object val) {
            this.val = val;
            return this;
        }
	
	public boolean getBoolean() {
		return ((Boolean)val).booleanValue();
	}

	public String toString() {
		return val.toString();
	}

    @Override
    public boolean equal(Object val) {
        return (val instanceof BooleanValue &&
                ((BooleanValue)val).getBoolean() == getBoolean());
    }
}
