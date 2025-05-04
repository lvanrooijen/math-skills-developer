package org.lvr.mathskillsdeveloper.mathproblem;

public abstract class MathProblem {
  ArithmeticOperation operation;

  public abstract String getQuestion();

  public abstract boolean verifyAnswer(int answer);

  public abstract int getSolution();
}
