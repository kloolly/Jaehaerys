import java.util.Scanner;

public class Prog_2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");

        int minuteInput = sc.nextInt();

        int minuteInYear = 60 * 24 * 365;
        int Year = minuteInput / minuteInYear; // 1000000000/525600
        int day = (minuteInput / 60 / 24 ) % 365;          //  (1000000000 / 60 /24) % 365

        //System.out.println(day);
        System.out.println(minuteInput+ " minutes is approximately " + Year +" Years and "+day+" days");
    }
}
