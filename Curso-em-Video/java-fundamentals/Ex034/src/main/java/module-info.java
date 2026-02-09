module org.example.ex034 {
    requires javafx.controls;
    requires javafx.fxml;


    opens factorial.ex034 to javafx.fxml;
    exports factorial.ex034;
}