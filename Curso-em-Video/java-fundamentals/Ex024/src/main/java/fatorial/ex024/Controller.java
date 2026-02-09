package fatorial.ex024;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label lblResult;
    @FXML
    private Label lblFat;
    @FXML
    private Spinner<Integer> spinnN;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        SpinnerValueFactory<Integer> valueFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0,12,0);

        spinnN.setValueFactory(valueFactory);
    }


    @FXML
    protected void onClick(MouseEvent event) {
        int value = spinnN.getValue();
        int result = 1;
        String fat = "";

        while (value >=1){
            result *= value;
            fat += Integer.toString(value);
            if (value !=1){
                fat +=" x ";
            }
            value--;
        }
        lblResult.setText(Integer.toString(result));
        lblFat.setText(fat);
    }
}
