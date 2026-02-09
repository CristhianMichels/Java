import java.time.LocalDate;
import java.util.Scanner;

public class AgeVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano de seu nascimento: ");
        int birthYear = scanner.nextInt();
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - birthYear;

        if (age < 16){
            System.out.println("Não pode votar!");
        } else if ((age >= 16 && age < 18) || (age > 70)){
                System.out.println("Votação Opcional!");
        } else {
                System.out.println("Votação Obrigatória!");
            }
        }
    }

