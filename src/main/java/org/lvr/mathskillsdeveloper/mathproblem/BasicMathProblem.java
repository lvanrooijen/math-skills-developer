package org.lvr.mathskillsdeveloper.mathproblem;

public class BasicMathProblem extends MathProblem {
  int a;
  int b;

  public BasicMathProblem(int a, int b, ArithmeticOperation operation) {
    this.a = a;
    this.b = b;
    this.operation = operation;
  }

  public String getQuestion() {
    return a + " " + operation.getSymbol() + " " + b;
  }

  public boolean verifyAnswer(int givenAnswer) {
    return getSolution() == givenAnswer;
  }

  public int getSolution() {
    return solve();
  }

  public int solve() {
    return switch (operation) {
      case ADD -> a + b;
      case SUBTRACT -> a - b;
      case MULTIPLY -> a * b;
      case DIVIDE -> a / b;
      case SQUARE ->
          throw new NotSupportedOperationException(
              "Use SquaredNumberProblemClass for Square Math Problems");
    };
  }
}
