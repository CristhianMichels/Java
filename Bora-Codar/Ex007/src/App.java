import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        boolean feliz;

        System.out.println("Você está feliz?");
        feliz = scanner.nextBoolean();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();


        System.out.println("Idade digitada: " + idade + " anos");
        System.out.println("Feliz: " + feliz);
    }
}
