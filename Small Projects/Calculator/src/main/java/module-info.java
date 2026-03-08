module org.example.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    exports folders.calculator.app;
    exports folders.calculator.model;
    exports folders.calculator.service;

    opens folders.calculator.controller to javafx.fxml;
    opens folders.calculator.app to javafx.fxml;
}