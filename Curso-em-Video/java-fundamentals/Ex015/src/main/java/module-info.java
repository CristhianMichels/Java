module org.example.ex015 {
    requires javafx.controls;
    requires javafx.fxml;


    opens agechecker.ex015 to javafx.fxml;
    exports agechecker.ex015;
}