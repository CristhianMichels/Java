module org.example.ex008 {
    requires javafx.controls;
    requires javafx.fxml;


    opens code.ex008 to javafx.fxml;
    exports code.ex008;
}