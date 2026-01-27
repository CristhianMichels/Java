import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Digite sua idade: ");
      int idade = scanner.nextInt();
      scanner.nextLine();

      System.out.println("Digite seu Nome");
      String nome = scanner.nextLine();

      System.out.println("Sua idade é: " + idade);
      System.out.println("Seu nome é: " + nome);

      scanner.close();
    }
}
