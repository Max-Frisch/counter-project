
/**
 * Represents a counter, with methods
 * @author Max
 */
public class Counter {
	
	//instance variables
	
	/**
	 * Stores internal count.
	 */
	int count;
	
	//methods
	
	/**
	 * Increments internal count variable.
	 * @return new incremented value of count
	 */
	public int increment() {
		this.count++;
		
		return this.count;
	}
	
	/**
	 * Decrements internal count variable.
	 * @return new decremented value of count
	 */
	public int decrement() {
		this.count--;
		
		return this.count;
	}
	
	/**
	 * Returns the current value of count
	 * @return the count
	 */
	public int getCount() {
		return this.count;
	}

}
