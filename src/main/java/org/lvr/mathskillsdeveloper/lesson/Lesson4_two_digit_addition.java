package org.lvr.mathskillsdeveloper.lesson;

import java.util.Random;
import org.lvr.mathskillsdeveloper.lesson.util.Lesson;
import org.lvr.mathskillsdeveloper.mathproblem.ArithmeticOperation;
import org.lvr.mathskillsdeveloper.mathproblem.BasicMathProblem;
import org.lvr.mathskillsdeveloper.mathproblem.MathProblem;

public class Lesson4_two_digit_addition implements Lesson {
  @Override
  public String getTitle() {
    return "Two-digit addition";
  }

  @Override
  public String getExplanation() {
    return "When adding two two-digit numbers,\n"
        + "break the problem down into smaller steps:\n"
        + "Add the tens digits first.\n"
        + "Then add the units digits.\n"
        + "\n"
        + "Example:\n"
        + "28 + 33\n"
        + "Add the tens digits: 28 + 30 = 58\n"
        + "Add the units digits: 58 + 3 = 61\n";
  }

  @Override
  public MathProblem getQuestion() {
    int a = new Random().nextInt(10, 99);
    int b;
    do {
      b = new Random().nextInt(1, (99 - a));
    } while (b < 10);
    return new BasicMathProblem(a, b, ArithmeticOperation.ADD);
  }

  @Override
  public int getLevel() {
    return 0;
  }
}
