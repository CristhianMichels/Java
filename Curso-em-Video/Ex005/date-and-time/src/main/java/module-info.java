module org.example.dateandtime {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.dateandtime to javafx.fxml;
    exports org.example.dateandtime;
}