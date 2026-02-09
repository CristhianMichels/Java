package org.example.dateandtime;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import java.util.Date;

public class Controller {
    @FXML
    private Label lblHora;
    private Button btnClick;

    @FXML
    private void onClick(ActionEvent event){
        Date relogio = new Date();
        lblHora.setText(relogio.toString());
    }
}
