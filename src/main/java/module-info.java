module org.lvr.mathskillsdeveloper {
  requires javafx.controls;
  requires javafx.fxml;
  requires org.controlsfx.controls;
  requires net.synedra.validatorfx;
  requires org.kordamp.ikonli.javafx;
  requires org.kordamp.bootstrapfx.core;
  requires java.desktop;
  requires jdk.unsupported.desktop;

  opens org.lvr.mathskillsdeveloper to
      javafx.fxml;

  exports org.lvr.mathskillsdeveloper;
  exports org.lvr.mathskillsdeveloper.controllers;

  opens org.lvr.mathskillsdeveloper.controllers to
      javafx.fxml;
}
