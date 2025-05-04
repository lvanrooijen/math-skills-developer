package org.lvr.mathskillsdeveloper.mathproblem;

public class SquaredNumberProblem extends MathProblem {
  int a;

  public SquaredNumberProblem(int a, ArithmeticOperation operation) {
    this.a = a;
    this.operation = operation;
  }

  @Override
  public String getQuestion() {
    return a + "²";
  }

  @Override
  public boolean verifyAnswer(int answer) {
    return answer == getSolution();
  }

  @Override
  public int getSolution() {
    return a * a;
  }
}
