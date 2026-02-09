module org.example.ex030 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens listarray.ex030 to javafx.fxml;
    exports listarray.ex030;
}