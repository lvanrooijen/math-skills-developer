module org.lvr.mathskillsdeveloper {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens org.lvr.mathskillsdeveloper to javafx.fxml;
    exports org.lvr.mathskillsdeveloper;
}