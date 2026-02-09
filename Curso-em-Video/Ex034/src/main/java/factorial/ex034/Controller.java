package factorial.ex034;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label txtFormula;
    @FXML
    private Label txtResultado;
    @FXML
    private Spinner<Integer> txtNum;
    @FXML
    private Button btnClick;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        SpinnerValueFactory<Integer> ValueFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0);
        txtNum.setValueFactory(ValueFactory);
    }

    @FXML
    protected void onClick() {
        int n = txtNum.getValue();
        Factorial f = new Factorial();
        f.setValor(n);
        txtFormula.setText(f.getFormula());
        txtResultado.setText(Integer.toString(f.getFatorial()));
    }

}
