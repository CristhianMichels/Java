module org.example.oopcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens folders.oopcalculator to javafx.fxml;
    exports folders.oopcalculator;
}