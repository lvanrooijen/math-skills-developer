package org.lvr.mathskillsdeveloper.lesson.util;

import org.lvr.mathskillsdeveloper.mathproblem.MathProblem;

public interface Lesson {
  String getTitle();

  String getExplanation();

  MathProblem getQuestion();

  int getLevel();
}
