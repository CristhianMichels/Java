package numberguesser.ex16;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.nio.Buffer;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label lblTxt;
    @FXML
    private Button btnClick;
    @FXML
    private Spinner<Integer> spinnGuess;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        SpinnerValueFactory<Integer> valueFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1,5,1);

        spinnGuess.setValueFactory(valueFactory);
    }

    @FXML
    protected void onClick(ActionEvent event) {
        int number = (int) (Math.random()*5) + 1;
        int value = spinnGuess.getValue();
        String result = (number == value)?"Damn! You guessed it!":"WRONG! I was thinking of " + number;
        lblTxt.setStyle("-fx-font-weight: bold");
        lblTxt.setText(result);

    }
}
