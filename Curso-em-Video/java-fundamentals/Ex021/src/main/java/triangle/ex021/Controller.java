package triangle.ex021;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class Controller {
    @FXML
    private Label lblA;
    @FXML
    private Label lblB;
    @FXML
    private Label lblC;
    @FXML
    private Slider sliA;
    @FXML
    private Slider sliB;
    @FXML
    private Slider sliC;
    @FXML
    private Button btnVerify;
    @FXML
    private Pane pan;
    @FXML
    private Label lblForm;
    @FXML
    private Label lblType;

    public void initialize() {

        pan.setVisible(false);

        sliA.valueProperty().addListener((observable, oldValue, newValue) -> {
            lblA.setText(String.valueOf(newValue.intValue()));
            lblA.setStyle("-fx-text-fill: #1d2e3b");
        });

        sliB.valueProperty().addListener((observable, oldValue, newValue) -> {
            lblB.setText(String.valueOf(newValue.intValue()));
            lblB.setStyle("-fx-text-fill: #1d2e3b");
        });

        sliC.valueProperty().addListener((observable, oldValue, newValue) -> {
            lblC.setText(String.valueOf(newValue.intValue()));
            lblC.setStyle("-fx-text-fill: #1d2e3b");
        });
    }


    @FXML
    protected void onClick() {
        pan.setVisible(true);
        int a = (int) sliA.getValue();
        int b = (int) sliB.getValue();
        int c = (int) sliC.getValue();

        if (a<b+c && b<c+a && c<b+a){
            lblForm.setText("Formam um triângulo");
            if (a == b && b == c){
                lblType.setText("Equilátero!");
            } else if (a !=b && b !=c && a !=c) {
                lblType.setText("Escaleno!");
            } else {
                lblType.setText("Isóceles!");
            }
        } else {
            lblForm.setText("Não formam um triângulo!");
            lblType.setText("----");
        }

    }
}
