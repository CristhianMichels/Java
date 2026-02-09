module org.example.ex021 {
    requires javafx.controls;
    requires javafx.fxml;


    opens triangle.ex021 to javafx.fxml;
    exports triangle.ex021;
}