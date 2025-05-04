package org.lvr.mathskillsdeveloper.controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomepageController {
  private Stage stage;
  private Scene scene;
  private Parent root;
  private final String css = this.getClass().getResource("/application.css").toExternalForm();

  public void switchToHomepageScene(ActionEvent event) throws IOException {
    root = FXMLLoader.load(getClass().getResource("Homepage.fxml"));
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    scene.getStylesheets().add(css);
    stage.setScene(scene);
    stage.show();
  }

  public void switchToLearningModeScene(ActionEvent event) throws IOException {
    root = FXMLLoader.load(getClass().getResource("/LearningMode.fxml"));
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    scene.getStylesheets().add(css);
    stage.setScene(scene);
    stage.show();
  }

  public void switchToPracticeModeScene(ActionEvent event) throws IOException {
    root = FXMLLoader.load(getClass().getResource("/PracticeMode.fxml"));
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    scene.getStylesheets().add(css);
    stage.setScene(scene);
    stage.show();
  }

  public void switchToChallengeModeScene(ActionEvent event) throws IOException {
    root = FXMLLoader.load(getClass().getResource("/src/main/views/ChallengeMode.fxml"));
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    scene.getStylesheets().add(css);
    stage.setScene(scene);
    stage.show();
  }
}
