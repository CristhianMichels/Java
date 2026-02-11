package folders.oopcalculator;

public class Calc {
    static double soma(double a, double b) {
        return a + b;
    }

    static double subtracao(double a, double b) {
        return a - b;
    }

    static double multiplicacao(double a, double b) {
        return a * b;
    }

    static double divisao(double a, double b) {
        if (b == 0){
            System.out.println("Erro: divisão por zero");
            return 0;
        } else{
            return a / b;
        }

    }

}

