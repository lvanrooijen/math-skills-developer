package org.lvr.mathskillsdeveloper.lesson;

import java.util.Random;
import org.lvr.mathskillsdeveloper.lesson.util.BasicMathMethods;
import org.lvr.mathskillsdeveloper.lesson.util.Lesson;
import org.lvr.mathskillsdeveloper.mathproblem.ArithmeticOperation;
import org.lvr.mathskillsdeveloper.mathproblem.BasicMathProblem;
import org.lvr.mathskillsdeveloper.mathproblem.MathProblem;

public class Lesson0_MultiplyByEleven implements Lesson, BasicMathMethods {
  String title = "Level 1, multiplying two-digit numbers by 11.";
  String explanation =
      "Multiplying two-digit numbers by 11 is surprisingly easy. \n"
          + "Here's the trick: take the two digits of the number, add them together, and insert the result between the original digits.\n\n"
          + "For example:\n"
          + "32 × 11 → 3 + 2 = 5 → Place the 5 between 3 and 2 → Result: 352\n\n"
          + "This method works for any two-digit number where the sum of the digits is less than 10.\n"
          + "But what if the sum is 10 or more? In that case, carry over the tens digit.\n\n"
          + "For example:\n"
          + "85 × 11 → 8 + 5 = 13 → Add 1 to the 8 (carry over), and place 3 in the middle → Result: 935";

  @Override
  public String getTitle() {
    return title;
  }

  @Override
  public String getExplanation() {
    return explanation;
  }

  @Override
  public MathProblem getQuestion() {
    int a = new Random().nextInt(11, 100);
    return new BasicMathProblem(a, 11, ArithmeticOperation.MULTIPLY);
  }

  @Override
  public int getLevel() {
    return 0;
  }
}
