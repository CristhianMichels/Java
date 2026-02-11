import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Garrafa g1 = new Garrafa();
        g1.marca = "Apple";
        g1.material = "Plástico";
        g1.capacidade = 500;
        g1.cheia = false;
        g1.tampada = true;


        boolean parar = false;
        while (!parar){
            System.out.println("GARRAFA:");
            g1.status();
            System.out.println();
            System.out.println("Escolha uma ação: ");
            System.out.println("1 - Tomar");
            System.out.println("2 - Encher");
            System.out.println("3 - Esvaziar");
            System.out.println("4 - Tampar");
            System.out.println("5 - Destampar");
            System.out.println("0 - Sair");
            System.out.println();
            System.out.print("Digite aqui: ");
            String acao = scanner.nextLine();
            if (acao.equals("1")){
                g1.tomar();
            } else if (acao.equals("2")) {
                g1.encher();
            } else if (acao.equals("3")) {
                g1.esvaziar();
            } else if (acao.equals("4")){
                g1.tampar();
            } else if (acao.equals("5")) {
                g1.destampar();
            } else if (acao.equals("0")){
                parar = true;
            } else {
                System.out.println("Digite um número válido!");
            }
        }
        scanner.close();
    }
}
