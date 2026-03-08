package folders.calculator.model;

import folders.calculator.service.Operations;

public class Calculator{
    private String digito1 = "";
    private String digito2 = "";
    private String operacao = "";

    private boolean novoDigito = true;
    private boolean operadorDigitado;
    private boolean calculado;


    public boolean isCalculado() {
        return calculado;
    }


    public void addDigitos(String digito){
        if (this.novoDigito){
            if (!operadorDigitado){
                this.digito1 = digito;
            } else {
                this.digito2 = digito;
            }
            this.novoDigito = false;

        } else {
            if (!this.operadorDigitado){
                this.digito1 += digito;
            } else {
                this.digito2 += digito;
            }
        }

    }
    public void setOperacao(String oper){
        this.operacao = oper;
        this.novoDigito = true;
        this.operadorDigitado = true;
        this.calculado = false;
    }

    public void reset(){
        this.digito1 = "";
        this.digito2 = "";
        this.operacao = "";
        this.novoDigito = true;
        this.operadorDigitado = false;
        this.calculado = false;
    }

    public double calcular(){
        double n1 = Double.parseDouble(this.digito1);
        double n2 = Double.parseDouble(this.digito2);
        double resultado = 0;


        switch (operacao){
            case "+":
                resultado = Operations.soma(n1,n2);
                break;
            case "-":
                resultado = Operations.subtracao(n1,n2);
                break;
            case "x":
                resultado = Operations.multiplicacao(n1,n2);
                break;
            case ":":
                resultado = Operations.divisao(n1,n2);
                break;
            default:
                throw new IllegalStateException("Operação inválida: " + operacao);
        }
        this.digito1 = String.valueOf(resultado);
        this.digito2 = "";
        this.operadorDigitado = false;
        this.novoDigito = true;
        this.calculado = true;
        return resultado;
    }

    public String getDisplay(){
        if (!this.operadorDigitado){
            return this.digito1;
        } else {
            return this.digito2;
        }
    }

}
