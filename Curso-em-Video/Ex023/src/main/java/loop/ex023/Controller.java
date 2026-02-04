package loop.ex023;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label lblCounter;
    @FXML
    private Button btnCount;

    @FXML
    protected void onClick(ActionEvent event) {
        int cc = 0;
        String count = "";
        while (cc<=10){
            count += cc + " ";
            cc++;
        }
        lblCounter.setText(count);

    }
}
