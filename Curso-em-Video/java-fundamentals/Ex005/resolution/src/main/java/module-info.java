module org.example.resolution {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.resolution to javafx.fxml;
    exports org.example.resolution;
}