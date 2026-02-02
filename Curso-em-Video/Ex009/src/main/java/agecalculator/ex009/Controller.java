package agecalculator.ex009;

import java.net.URI;
import java.net.URL;
import java.time.Year;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class Controller implements Initializable {
    @FXML
    private Label lblNumber;
    @FXML
    private Label lblAtual;
    @FXML
    private Button btnCalc;
    @FXML
    private Spinner<Integer> spinYear;

    int currentYear = Year.now().getValue();


    @Override
    public void initialize(URL url, ResourceBundle rb){
        lblAtual.setText(Integer.toString(currentYear));
        SpinnerValueFactory<Integer> valueFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1900, currentYear, 2000);

        spinYear.setValueFactory(valueFactory);
    }

    @FXML
    protected void onClick(ActionEvent event)  {

        int yearOfBirth = spinYear.getValue();
        int result = currentYear - yearOfBirth;
        lblNumber.setText(Integer.toString(result));
    }
}
