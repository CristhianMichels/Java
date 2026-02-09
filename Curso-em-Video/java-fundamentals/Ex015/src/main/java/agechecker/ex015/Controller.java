package agechecker.ex015;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.time.LocalDate;

public class Controller {
    @FXML
    private Label lblAge;
    @FXML
    private Label lblSituation;
    @FXML
    private Button btnCalc;
    @FXML
    private TextField txtYear;

    @FXML
    protected void onClick(ActionEvent event) {

        int yearBirth = Integer.parseInt(txtYear.getText());
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - yearBirth;
        lblAge.setText(Integer.toString(age));
        String sit = (age >= 18)?"Adult":"Underage.";
        lblSituation.setText(sit);
    }
}
