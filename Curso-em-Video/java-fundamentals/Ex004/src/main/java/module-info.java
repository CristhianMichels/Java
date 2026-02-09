module org.example.ex004 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.ex004 to javafx.fxml;
    exports org.example.ex004;
}