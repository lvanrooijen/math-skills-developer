package org.lvr.mathskillsdeveloper.lesson.util;

public interface BasicMathMethods {
  default int concatNumbers(int a, int b) {
    return Integer.parseInt(a + "" + b);
  }

  default int getDifferenceFromTen(int a) {
    return 10 - a;
  }
}
