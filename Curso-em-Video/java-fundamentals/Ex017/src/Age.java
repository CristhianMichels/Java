import java.util.Scanner;
import java.time.LocalDate;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Birth Year: ");
        int yearBirth = scanner.nextInt();
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - yearBirth;
        if (age >= 18){
            System.out.println("You are " + age + " old, and you are a adult.");
        } else{
            System.out.println("You are " + age + " old, and you are a Underage.");
        }
    }
}
