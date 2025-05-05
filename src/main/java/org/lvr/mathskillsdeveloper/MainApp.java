package org.lvr.mathskillsdeveloper;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainApp extends Application {

  public static void main(String... args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) throws Exception {
    try {
      Parent root = FXMLLoader.load(getClass().getResource("/Homepage.fxml"));
      Scene scene = new Scene(root);
      String css = this.getClass().getResource("/application.css").toExternalForm();
      scene.getStylesheets().add(css);

      stage.setTitle("Math Skills Developer");

      Image icon = new Image("cat.jpg");
      stage.getIcons().add(icon);

      stage.setResizable(false);

      stage.setScene(scene);
      stage.show();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
