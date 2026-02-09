module org.example.ex011 {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainapp.ex011 to javafx.fxml;
    exports mainapp.ex011;
}