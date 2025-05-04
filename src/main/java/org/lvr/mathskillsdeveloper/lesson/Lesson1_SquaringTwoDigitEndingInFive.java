package org.lvr.mathskillsdeveloper.lesson;

import java.util.Random;
import org.lvr.mathskillsdeveloper.lesson.util.*;
import org.lvr.mathskillsdeveloper.mathproblem.ArithmeticOperation;
import org.lvr.mathskillsdeveloper.mathproblem.MathProblem;
import org.lvr.mathskillsdeveloper.mathproblem.SquaredNumberProblem;

public class Lesson1_SquaringTwoDigitEndingInFive implements Lesson, BasicMathMethods {

  @Override
  public String getTitle() {
    return "Squaring digits that end in 5";
  }

  @Override
  public String getExplanation() {
    return "Squaring a 2-digit number ending in 5 is easy using a shortcut.\n"
        + "\n"
        + "Take any two-digit number that ends in 5, for example: 35.\n"
        + "\n"
        + "Ignore the 5 and take the digit(s) in front, in this case: 3.\n"
        + "\n"
        + "Multiply that number by the number that comes after it: 3 × 4 = 12.\n"
        + "\n"
        + "Then attach 25 to the end of the result: 12 → 1225.\n"
        + "So, 35² = 1225.\n"
        + "\n"
        + "Let’s try another example: 25\n"
        + "\n"
        + "Ignore the 5 → the digit in front is 2.\n"
        + "\n"
        + "Multiply it by the next number: 2 × 3 = 6.\n"
        + "\n"
        + "Attach 25 → 625.\n"
        + "So, 25² = 625.";
  }

  @Override
  public MathProblem getQuestion() {
    int randomNumber = new Random().nextInt(1, 9);
    int finalNumber = concatNumbers(randomNumber, 5);
    return new SquaredNumberProblem(finalNumber, ArithmeticOperation.SQUARE);
  }

  @Override
  public int getLevel() {
    return 1;
  }
}
