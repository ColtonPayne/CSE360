package cse360assignment02;

public class AddingMachine {
	
	  private int total;
	  private String history = "0";
	  
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }
	  
	  public int getTotal () {
	    return total;
	  }
	  
	  public void add (int value) {
		  String val = String.valueOf(value);
		  history = history.concat(" + ");
		  history = history.concat(val);
		  total += value;
	  }

	  public void subtract (int value) {
		  String val = String.valueOf(value);
		  history = history.concat(" - ");
		  history = history.concat(val);
		  total -= value;
	  }

	  public String toString () {
	    return history;
	  }

	  public void clear() {
	  }
	  
	

}
