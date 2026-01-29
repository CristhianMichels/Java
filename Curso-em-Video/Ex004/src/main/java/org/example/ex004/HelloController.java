package org.example.ex004;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;

public class HelloController {
    @FXML
    private Label lblMessage;
    private Button btnClick;

    @FXML
    private void onClick(ActionEvent event){
        lblMessage.setText("Hello, World!");
    }
}
