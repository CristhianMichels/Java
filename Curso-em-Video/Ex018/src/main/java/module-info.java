module org.example.ex018 {
    requires javafx.controls;
    requires javafx.fxml;


    opens evenorodd.ex018 to javafx.fxml;
    exports evenorodd.ex018;
}