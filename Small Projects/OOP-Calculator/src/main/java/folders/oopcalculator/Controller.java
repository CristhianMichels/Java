package folders.oopcalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label lblTudo;
    @FXML
    private Label lblCalc;

    Calc calc = new Calc();


    private String oper = "";
    private String operadores = "";
    private String num1 = "";
    private String num2 = "";
    private boolean novoDigito = true;
    private boolean operadorDigitado = false;
    private boolean calculado = false;

    void clean(){
        lblCalc.setText("");
        lblTudo.setText("");
        novoDigito = true;
        operadorDigitado = false;
    }

    @FXML
    protected void onClean(ActionEvent event){
        clean();
    }

    @FXML
    protected void onNumber(ActionEvent event){
        Button btn = (Button) event.getSource();
        String digito = btn.getText();

        if (calculado){
            clean();
            calculado = false;
        }

        if (novoDigito){
            lblTudo.setText(digito);
            novoDigito = false;

        } else {
            lblTudo.setText(lblTudo.getText() + digito);
        }
        if (!operadorDigitado){
            num1 = lblTudo.getText();
            System.out.println(num1);
        } else {
            num2 = lblTudo.getText();
            System.out.println(num2);

        }

    }

    @FXML
    protected void onOperacao(ActionEvent event){
        Button btn = (Button) event.getSource();
        oper = btn.getText();
        operadores = oper;
        lblCalc.setText(lblTudo.getText() + " " + oper);
        novoDigito = true;
        operadorDigitado = true;
        calculado = false;
        System.out.println(num1);
    }

    @FXML
    protected void onIgual(ActionEvent event){

        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);
        double resultado = 0;

        if (operadores.equals("+")){

            lblCalc.setText(num1 + " + " + num2 + " =");
            resultado = Calc.soma(n1,n2);

        } else if (operadores.equals("-")) {
            lblCalc.setText(num1 + " - " + num2 + " =");
            resultado = Calc.subtracao(n1,n2);
        } else if (operadores.equals("x")) {
            lblCalc.setText(num1 + " x " + num2 + " =");
            resultado = Calc.multiplicacao(n1,n2);
        } else if (operadores.equals(":")) {
            lblCalc.setText(num1 + " : " + num2 + " =");
            resultado = Calc.divisao(n1,n2);
        }
        lblTudo.setText(String.valueOf(resultado));

        calculado = true;
        num1 = String.valueOf(resultado);
        num2 = "";
        operadorDigitado = false;
        novoDigito = true;


    }

}
