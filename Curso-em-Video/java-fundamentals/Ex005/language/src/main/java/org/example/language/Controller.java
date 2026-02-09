package org.example.language;

import java.util.Locale;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label lblMessage;
    private Button btnButton;

    @FXML
    protected void onClick(ActionEvent event) {
        Locale system = Locale.getDefault();

        String languageName = system.getDisplayLanguage();

        lblMessage.setText(languageName);

        lblMessage.setStyle("-fx-padding: 0 20");
    }
}
