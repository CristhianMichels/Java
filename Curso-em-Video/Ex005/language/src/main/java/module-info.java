module org.example.language {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.language to javafx.fxml;
    exports org.example.language;
}