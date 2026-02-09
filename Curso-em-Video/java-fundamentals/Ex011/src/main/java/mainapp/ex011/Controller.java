package mainapp.ex011;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label lblDiv;
    @FXML
    private Label lblRes;
    @FXML
    private Button btnClick;
    @FXML
    private TextField txtNum;
    @FXML
    private TextField txtDen;

    @FXML
    protected void onClick(ActionEvent event) {
        int numerador = Integer.parseInt(txtNum.getText());
        int denominador = Integer.parseInt(txtDen.getText());

        float divisao = numerador / denominador;
        float res = (float) Math.sqrt(numerador);

        lblDiv.setText(Float.toString(divisao));
        lblRes.setText(Float.toString(res));
    }
}
