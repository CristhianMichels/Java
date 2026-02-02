import java.util.Scanner;

public class ArithmetiMean {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float n1 = scanner.nextFloat();
        float n2 = scanner.nextFloat();
        float m = (n1 + n2) / 2;
        System.out.println(m);
        if (m > 9){
            System.out.println("Congrats!");
        }
    }
}
