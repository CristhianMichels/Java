import javax.swing.JOptionPane;

public class Repeat {
    public static void main(String[] args) {

        long n, s=0;
        int c = 0, cEven = 0, cOdd = 0, above = 0;
        do {
            n = Long.parseLong(JOptionPane.showInputDialog(null,
                    "<html>Enter a number: <br><em>(Value 0 stops)</em></html>"));
            c++;
            s+=n;

            if (n > 100){
                above++;
            }

            if (n % 2 == 0){
                cEven++;
            } else {
                cOdd++;
            }

        } while (n != 0);
        long m = s / c;
        JOptionPane.showMessageDialog(null,
                "<html>Result <br><hr>"+
                "<br>Total of Values: " + c +
                "<br>Total of Even:   " + cEven +
                "<br>Total of Odd:    " + cOdd +
                "<br>Above 100:       " + above +
                "<br>Total sum:       " + s +
                "<br>Average of values: " + m, "Numbers", JOptionPane.INFORMATION_MESSAGE);

    }
}
