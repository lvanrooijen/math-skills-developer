package org.lvr.mathskillsdeveloper.lesson;

import java.util.Random;
import org.lvr.mathskillsdeveloper.lesson.util.BasicMathMethods;
import org.lvr.mathskillsdeveloper.lesson.util.Lesson;
import org.lvr.mathskillsdeveloper.mathproblem.ArithmeticOperation;
import org.lvr.mathskillsdeveloper.mathproblem.BasicMathProblem;
import org.lvr.mathskillsdeveloper.mathproblem.MathProblem;

public class Lesson2_multiplyTwoDigitsWithSameFirstDigit implements Lesson, BasicMathMethods {
  @Override
  public String getTitle() {
    return "Multiplying 2-digit numbers with same first digit";
  }

  @Override
  public String getExplanation() {
    return "Trick for Multiplying Two-Digit Numbers with the Same First Digit and Second Digits Adding to 10:\n"
        + "\n"
        + "When multiplying two two-digit numbers that:\n"
        + "\n"
        + "Have the same tens digit, and\n"
        + "\n"
        + "Their units digits add up to 10,\n"
        + "\n"
        + "you can use this shortcut:\n"
        + "\n"
        + "Multiply the tens digit by one more than itself.\n"
        + "\n"
        + "Multiply the units digits together.\n"
        + "\n"
        + "Concatenate the results of steps 1 and 2.\n"
        + "\n"
        + "Example:\n"
        + "85 × 85\n"
        + "\n"
        + "The tens digit is 8 → 8 × (8 + 1) = 8 × 9 = 72\n"
        + "\n"
        + "The units digits are 5 and 5 → 5 × 5 = 25\n"
        + "\n"
        + "Final answer: 7225\n"
        + "\n";
  }

  @Override
  public MathProblem getQuestion() {
    int firstDigit = new Random().nextInt(1, 9);
    int secondDigit = new Random().nextInt(1, 9);
    int a = concatNumbers(firstDigit, secondDigit);
    int b = concatNumbers(firstDigit, getDifferenceFromTen(secondDigit));
    return new BasicMathProblem(a, b, ArithmeticOperation.MULTIPLY);
  }

  @Override
  public int getLevel() {
    return 2;
  }
}
