import java.util.Scanner;

public class Cases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many legs?: ");
        int legs = scanner.nextInt();
        String type;
        System.out.print("This is a ");
        switch (legs){
            case 1:
                type ="Sacy";
                break;
            case 2:
                type ="Biped";
                break;
            case 3:
                type = "trivet";
                break;
            case 4:
                type = "Quadruped";
                break;
            case 6:
                type = "Spider";
                break;
            default:
                type = "ET";
                break;
        }
        System.out.println(type);
    }
}
