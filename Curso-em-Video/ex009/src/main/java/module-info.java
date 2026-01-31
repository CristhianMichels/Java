module org.example.ex009 {
    requires javafx.controls;
    requires javafx.fxml;


    opens agecalculator.ex009 to javafx.fxml;
    exports agecalculator.ex009;
}