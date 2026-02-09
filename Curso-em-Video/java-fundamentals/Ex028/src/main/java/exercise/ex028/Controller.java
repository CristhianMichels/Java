package exercise.ex028;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;

import javax.swing.*;

public class Controller  {
    @FXML
    private Label lblStart;
    @FXML
    private Label lblEnd;
    @FXML
    private Label lblStep;
    @FXML
    private Label lblMsg;
    @FXML
    private Button btnCount;
    @FXML
    private Slider slideStart;
    @FXML
    private Slider slideEnd;
    @FXML
    private Slider slideStep;
    @FXML
    private ListView<Integer> listResult;

    @FXML
    protected void onMouse1(MouseEvent event){
        int valor = (int) Math.round(slideStart.getValue());
        lblStart.setText(Integer.toString(valor));

    }
    @FXML
    protected void onMouse2(MouseEvent event){
        int valor = (int) Math.round(slideEnd.getValue());
        lblEnd.setText(Integer.toString(valor));

    }
    @FXML
    protected void onMouse3(MouseEvent event){
        int valor = (int) Math.round(slideStep.getValue());
        lblStep.setText(Integer.toString(valor));

    }

    @FXML
    protected void onClick(ActionEvent event) {
        int sr = (int) slideStart.getValue();
        int st = (int) slideStep.getValue();
        int en = (int) slideEnd.getValue();

        ObservableList<Integer> itens = FXCollections.observableArrayList();


        if (st > 0) {
            if(sr < en){
                for (int c = sr; c <= en; c += st) {
                    itens.add(c);
                }
            } else {
                for (int c = sr; c >= en; c -= st) {
                    itens.add(c);
                }
            }
            lblMsg.setText("");
        } else {
            lblMsg.setText("The step size needs to be greater than 0.");
        }


        listResult.setItems(itens);
    }
}
