package code.ex008;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField txtN1;
    @FXML
    private TextField txtN2;
    @FXML
    private Label lblResult;
    @FXML
    private Button btnEquals;


    @FXML
    protected void onClick(ActionEvent event) {
        double n1 = Double.parseDouble(txtN1.getText());
        double n2 = Double.parseDouble(txtN2.getText());

        String result = Double.toString(n1 + n2);
        lblResult.setText(result);
    }
}
