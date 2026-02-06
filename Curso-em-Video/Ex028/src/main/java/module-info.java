module org.example.ex028 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens exercise.ex028 to javafx.fxml;
    exports exercise.ex028;
}