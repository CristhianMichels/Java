import java.util.Arrays;

public class ArrayFill {
    public static void main(String[] args) {
        int v[] = new int[20];
        Arrays.fill(v, 0);
        for (int value: v){
            System.out.print(value + " ");
        }
    }
}
