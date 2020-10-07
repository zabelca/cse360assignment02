package cse360assignment02;

public class AddingMachine {
  private int total;
  private String output;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    output = "0";
    
  }
  
  public int getTotal () {
    return 0;
  }
  
  public void add (int value) {
    total = total + value;
    output += " + " + value;
  }

  public void subtract (int value) {
    total = total - value;
    output += " - " + value;
  }

  public String toString () {
    return "0";
  }

  public void clear() {
  }
}