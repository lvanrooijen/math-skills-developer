package org.lvr.mathskillsdeveloper.mathproblem;

public enum ArithmeticOperation {
  MULTIPLY("*"),
  ADD("+"),
  SUBTRACT("-"),
  DIVIDE("/"),
  SQUARE("^2");

  private final String symbol;

  ArithmeticOperation(String symbol) {
    this.symbol = symbol;
  }

  public String getSymbol() {
    return symbol;
  }
}
