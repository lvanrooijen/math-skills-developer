package org.lvr.mathskillsdeveloper.lesson;

import java.util.Random;
import org.lvr.mathskillsdeveloper.lesson.util.Lesson;
import org.lvr.mathskillsdeveloper.mathproblem.ArithmeticOperation;
import org.lvr.mathskillsdeveloper.mathproblem.BasicMathProblem;
import org.lvr.mathskillsdeveloper.mathproblem.MathProblem;

public class Lesson3_BasicMultiplicationTables implements Lesson {
  @Override
  public String getTitle() {
    return "Basic Multiplication Tables";
  }

  @Override
  public String getExplanation() {
    return "There is no special trick here, if you want to be proficient at mental math you need to know your basic math tables by heart. "
        + "Just practice them!";
  }

  @Override
  public MathProblem getQuestion() {
    int a = new Random().nextInt(1, 10);
    int b = new Random().nextInt(1, 10);
    return new BasicMathProblem(a, b, ArithmeticOperation.MULTIPLY);
  }

  @Override
  public int getLevel() {
    return 3;
  }
}
