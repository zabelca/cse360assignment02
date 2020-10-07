package cse360assignment02;

public class AddingMachine {
  private int total;
  private String output;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    output = "0";
  }
  
  public int getTotal () { // returns the value of total
    return total;
  }
  
  public void add (int value) { // adds value from total
    total = total + value;
    output += " + " + value;
  }

  public void subtract (int value) { // subtracts value from total
    total = total - value;
    output += " - " + value;
  }

  public String toString () { // returns the entire equation including the operations
    return output;
  }

  public void clear() { // clears the vlues stored in those variables
    total = 0;
    output = "0";
  }
}