package cse360assignment02;

public class AddingMachine {
  private int total;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    
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
    return "";
  }

  public void clear() {
  }
}