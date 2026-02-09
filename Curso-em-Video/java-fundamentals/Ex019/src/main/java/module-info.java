module org.example.ex019 {
    requires javafx.controls;
    requires javafx.fxml;


    opens math.ex019 to javafx.fxml;
    exports math.ex019;
}