package org.lvr.mathskillsdeveloper.controllers;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.util.Duration;
import org.lvr.mathskillsdeveloper.lesson.util.Lesson;
import org.lvr.mathskillsdeveloper.lesson.util.LessonList;
import org.lvr.mathskillsdeveloper.mathproblem.MathProblem;

public class LearningModeController {
  int level = 0;
  Lesson currentLesson;

  private MathProblem mathProblem;

  @FXML private Label titleBar;

  @FXML private Label mathProblemLabel;

  @FXML private Label lessonExplanation;

  @FXML private TextField mathProblemAnswer;

  @FXML private Text feedbackLabel;

  @FXML
  public void initialize() {
    currentLesson = LessonList.lessons.get(level);
    titleBar.setText(currentLesson.getTitle());
    lessonExplanation.setText(currentLesson.getExplanation());
    generateNewQuestion();
  }

  public void generateNewQuestion() {
    mathProblem = currentLesson.getQuestion();
    mathProblemLabel.setText(mathProblem.getQuestion());
    mathProblemAnswer.setText("");
  }

  @FXML
  public void checkAnswer() {
    try {
      int userAnswer = Integer.parseInt(mathProblemAnswer.getText());
      if (mathProblem.verifyAnswer(userAnswer)) {
        generateNewQuestion();
      } else {
        provideFeedback("Wrong answer!");
      }
    } catch (NumberFormatException exception) {
      provideFeedback("Enter a valid number");
    }
  }

  public void provideFeedback(String message) {
    feedbackLabel.setText(message);
    PauseTransition pause = new PauseTransition(Duration.seconds(2));
    pause.setOnFinished(event -> feedbackLabel.setText(""));
    pause.play();
  }

  @FXML
  public void skipQuestion() {
    generateNewQuestion();
  }

  @FXML
  public void nextQuestion() {
    mathProblem = currentLesson.getQuestion();
  }

  @FXML
  public void nextLevel() {
    level++;
    if (level >= LessonList.lessons.size()) {
      System.out.println("All lessons completed");
    } else {
      currentLesson = LessonList.lessons.get(level);
      updateScreen();
    }
  }

  @FXML
  public void quit() {
    // go to home
    System.out.println("We Quitting!");
  }

  public void updateScreen() {
    titleBar.setText(currentLesson.getTitle());
    lessonExplanation.setText(currentLesson.getExplanation());
    generateNewQuestion();
  }
}
