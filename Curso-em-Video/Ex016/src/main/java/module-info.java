module org.example.ex016 {
    requires javafx.controls;
    requires javafx.fxml;


    opens numberguesser.ex16 to javafx.fxml;
    exports numberguesser.ex16;
}