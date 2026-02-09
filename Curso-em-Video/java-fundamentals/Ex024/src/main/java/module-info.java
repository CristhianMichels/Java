module org.example.ex024 {
    requires javafx.controls;
    requires javafx.fxml;


    opens fatorial.ex024 to javafx.fxml;
    exports fatorial.ex024;
}