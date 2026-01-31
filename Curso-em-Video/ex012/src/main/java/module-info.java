module org.example.ex012 {
    requires javafx.controls;
    requires javafx.fxml;


    opens calculator to javafx.fxml;
    exports calculator;
}