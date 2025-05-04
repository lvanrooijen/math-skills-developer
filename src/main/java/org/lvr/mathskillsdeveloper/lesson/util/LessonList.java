package org.lvr.mathskillsdeveloper.lesson.util;

import java.util.Arrays;
import java.util.List;
import org.lvr.mathskillsdeveloper.lesson.Lesson0_MultiplyByEleven;
import org.lvr.mathskillsdeveloper.lesson.Lesson1_SquaringTwoDigitEndingInFive;
import org.lvr.mathskillsdeveloper.lesson.Lesson2_multiplyTwoDigitsWithSameFirstDigit;
import org.lvr.mathskillsdeveloper.lesson.Lesson3_BasicMultiplicationTables;

public class LessonList {
  public static List<Lesson> lessons =
      Arrays.asList(
          new Lesson0_MultiplyByEleven(),
          new Lesson1_SquaringTwoDigitEndingInFive(),
          new Lesson2_multiplyTwoDigitsWithSameFirstDigit(),
          new Lesson3_BasicMultiplicationTables());
}
