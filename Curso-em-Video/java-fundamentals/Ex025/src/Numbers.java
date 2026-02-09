import java.util.Locale;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n, s = 0;
        String resp = null;
        do {
            System.out.print("Enter a Number: ");
            n = scanner.nextInt();
            s +=n;
            System.out.print("Do you want to continue? [Y/N] ");
            resp = scanner.next().toUpperCase(Locale.ROOT);
        } while (resp.equals("Y"));
        System.out.println("The sum of the values is: "+ s);
    }
}
