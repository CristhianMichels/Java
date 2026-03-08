package folders.calculator.service;

public class Operations {
    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        if (b == 0){
            System.out.println("Erro: divisão por zero");
            return 0;
        } else{
            return a / b;
        }

    }

}

