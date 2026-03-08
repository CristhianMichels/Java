package folders.calculator.controller;

import folders.calculator.model.Calculator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label lblTudo;
    @FXML
    private Label lblCalc;

    private final Calculator calculator = new Calculator();


    protected void clean(){
        lblCalc.setText("");
        lblTudo.setText("");
        calculator.reset();
    }

    @FXML
    protected void onClean(ActionEvent event){
        clean();
    }

    @FXML
    protected void onNumber(ActionEvent event){
        if (calculator.isCalculado()){
            clean();
        }

        Button btn = (Button) event.getSource();
        calculator.addDigitos(btn.getText());
        lblTudo.setText(calculator.getDisplay());
    }

    @FXML
    protected void onOperacao(ActionEvent event){
        Button btn = (Button) event.getSource();
        String oper = btn.getText();
        calculator.setOperacao(oper);
        lblCalc.setText(lblTudo.getText()+ " " + oper);
    }

    @FXML
    protected void onIgual(ActionEvent event){
        lblCalc.setText(lblCalc.getText()+ " " + lblTudo.getText() + " =");
        double resultado = calculator.calcular();
        lblTudo.setText(String.valueOf(resultado));

    }
}
