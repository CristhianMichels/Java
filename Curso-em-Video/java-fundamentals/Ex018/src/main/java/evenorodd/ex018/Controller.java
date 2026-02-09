package evenorodd.ex018;

import javafx.event.ActionEvent;
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
    private Label lblMsg;
    @FXML
    private Spinner<Integer> spinnN;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        SpinnerValueFactory<Integer> valueFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(-100, 100, 0);
        spinnN.setValueFactory(valueFactory);

    }

    @FXML
    protected void onClick(MouseEvent event) {
        int number = spinnN.getValue();
        if (number % 2 == 0) {
            lblMsg.setText(Integer.toString(number) + " is Even");
        } else {
            lblMsg.setText(Integer.toString(number) + " is Odd");
        }
    }
}
