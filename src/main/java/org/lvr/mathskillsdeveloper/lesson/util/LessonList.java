package org.lvr.mathskillsdeveloper.lesson.util;

import java.util.Arrays;
import java.util.List;
import org.lvr.mathskillsdeveloper.lesson.*;

public class LessonList {
  public static List<Lesson> lessons =
      Arrays.asList(
          new Lesson0_MultiplyByEleven(),
          new Lesson1_SquaringTwoDigitEndingInFive(),
          new Lesson2_multiplyTwoDigitsWithSameFirstDigit(),
          new Lesson3_BasicMultiplicationTables(),
          new Lesson4_two_digit_addition());
}
