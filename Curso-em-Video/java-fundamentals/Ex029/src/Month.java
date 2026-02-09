import java.time.LocalDate;


public class Month {
    public static void main(String[] args) {

        String month[] = {"Jan","Feb","Mar","Apr","May","Jun",
                "Jul","Aug","Sept","Oct","Nov","Dec"};
        int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        int leapYear = LocalDate.now().getYear();

        if ((leapYear % 4 == 0 && leapYear % 100 != 0) || (leapYear % 400 == 0)){
            days[1] = 29;
        }

        for (int c = 0; c < month.length; c++){
            System.out.println(month[c] + " has " + days[c] + " days.");
        }
    }
}
