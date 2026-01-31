package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class Controller {
    @FXML
    private Label lbl1;
    @FXML
    private Label lbl2;
    @FXML
    private Label lbl3;
    @FXML
    private Label lbl4;
    @FXML
    private Label lbl5;
    @FXML
    private Spinner<Integer> spinnerNum;
    @FXML
    private Button btnCalc;

    @FXML
    public void initialize(){
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(-100, 100, 0);

        spinnerNum.setValueFactory(valueFactory);
    }


    @FXML
    protected void onClick(ActionEvent event) {
        int value = spinnerNum.getValue();

        lbl1.setText(String.valueOf(value % 2));
        lbl2.setText(String.valueOf(Math.pow(value, 3)));
        lbl3.setText(String.format("%.2f", Math.sqrt(value)));
        lbl4.setText(String.format("%.2f", Math.cbrt(value)));
        lbl5.setText(String.valueOf(Math.abs(value)));

    }
}
