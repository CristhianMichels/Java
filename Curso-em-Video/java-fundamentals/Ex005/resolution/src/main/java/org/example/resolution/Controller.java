package org.example.resolution;

import java.awt.Dimension;
import java.awt.Toolkit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label lblMessage;
    private Button btnClick;

    @FXML
    protected void onClick(ActionEvent event) {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

        int width = screen.width;
        int height = screen.height;

        lblMessage.setText(width + " X " + height);
        lblMessage.setStyle("-fx-padding: 0 19");

    }
}
