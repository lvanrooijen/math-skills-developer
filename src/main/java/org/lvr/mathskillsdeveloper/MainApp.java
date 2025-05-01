package org.lvr.mathskillsdeveloper;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainApp extends Application {

  public static void main(String... args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) throws Exception {
    // Stage customStage = new Stage();
    Group root = new Group();
    Scene scene = new Scene(root, Color.BLACK);

    stage.setTitle("Math Skills Developer");

    Image icon = new Image("cat.jpg");
    stage.getIcons().add(icon);

    stage.setWidth(420);
    stage.setHeight(420);
    stage.setResizable(false);

    stage.setFullScreen(true);

    stage.setScene(scene);
    stage.show();
  }
}
