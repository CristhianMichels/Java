module org.example.ex023 {
    requires javafx.controls;
    requires javafx.fxml;


    opens loop.ex023 to javafx.fxml;
    exports loop.ex023;
}