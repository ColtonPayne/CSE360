package cse360assignment02;

/**
 * This program is a simple calculator which adds and subtracts, storing the
 * required information in the tostring method.
 *
 * @author Colton Payne
 * @version 2.0
 * @since 2020-10-02
 */

public class AddingMachine {

	private int total;
	private String history = "0";

	
	public AddingMachine() {
		total = 0; // not needed - included for clarity
	}

	
	/**
	 * This method returns the value of total
	 * 
	 * @param Nothing.
	 * @return An integer returning the total value of the adding machine.
	 */
	
	public int getTotal() {
		return total;
	}

	/**
	 * This method adds a value to the total and returns the history
	 * 
	 * @param Takes in an integer
	 * @return Nothing.
	 */
	public void add(int value) {

		String val = String.valueOf(value);
		history = history.concat(" + ");
		history = history.concat(val);
		total += value;
	}

	/**
	 * This method subtracts a value to the total and returns the history
	 * 
	 * @param Takes in an integer
	 * @return Nothing.
	 */
	public void subtract(int value) {
		String val = String.valueOf(value);
		history = history.concat(" - ");
		history = history.concat(val);
		total -= value;
	}

	/**
	 * This returns the whole transaction history
	 * 
	 * @param Nothing.
	 * @return A string of transaction data.
	 */
	public String toString() {
		return history;
	}

	/**
	 * This resets the value of total to 0 and clears the transaction history.
	 * 
	 * @param Nothing.
	 * @return Nothing.
	 */
	public void clear() {
		total = 0;
		history = "0";
	}

}
