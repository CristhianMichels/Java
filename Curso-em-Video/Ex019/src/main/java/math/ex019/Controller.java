package math.ex019;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label lblDis;
    @FXML
    private Label lblReal;
    @FXML
    private Label lblA;
    @FXML
    private Label lblB;
    @FXML
    private Label lblC;
    @FXML
    private Button btnCalc;
    @FXML
    private Spinner<Integer> spinnA;
    @FXML
    private Spinner<Integer> spinnB;
    @FXML
    private Spinner<Integer> spinnC;
    @FXML
    private Pane pan;


    @Override
    public void initialize(URL url, ResourceBundle rb) {

        SpinnerValueFactory<Integer> factoryA = new SpinnerValueFactory.IntegerSpinnerValueFactory(-100, 100, 0);
        SpinnerValueFactory<Integer> factoryB = new SpinnerValueFactory.IntegerSpinnerValueFactory(-100, 100, 0);
        SpinnerValueFactory<Integer> factoryC = new SpinnerValueFactory.IntegerSpinnerValueFactory(-100, 100, 0);

        spinnA.setValueFactory(factoryA);
        spinnB.setValueFactory(factoryB);
        spinnC.setValueFactory(factoryC);

        pan.setVisible(false);
    }

    @FXML
    protected void onClickA(MouseEvent event) {
        lblA.setText(spinnA.getValue().toString());
    }
    @FXML
    protected void onClickB(MouseEvent event) {
        lblB.setText(spinnB.getValue().toString());
    }
    @FXML
    protected void onClickC(MouseEvent event) {
        lblC.setText(spinnC.getValue().toString());
    }

    @FXML
    protected void onBtnClick(ActionEvent event){
        int a = spinnA.getValue();
        int b = spinnB.getValue();
        int c = spinnC.getValue();

        double d = Math.pow(b,2) -4 * a * c;
        pan.setVisible(true);
        lblDis.setText(Double.toString(d));

       if (d < 0){
            lblReal.setText("No real roots (Complex roots)");
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2*a);
            double x2 = (-b - Math.sqrt(d)) / (2*a);

            lblReal.setText(String.format("x1 = %.2f    x2 = %.2f", x1, x2));
        }

    }
}
