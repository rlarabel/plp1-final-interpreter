/**
 * 
 */
package util;

/**
 * @author carr
 *
 */
public class StringValue extends Value {

	/**
	 * 
	 */
	public StringValue() {
	}
	
	@Override
	public String toString() {
		return val.toString();
	}

    @Override
    public Value addValue(Object val) {
        this.val = val;
        return this;
    }

    @Override
    public boolean equal(Object val) {
        return (val instanceof StringValue &&
                val.toString().equals(toString()));
    }

	
}
