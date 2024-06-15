import java.util.Scanner;

public class Prog_2_1 {
    public static void main(String[] args) {
        System.out.print("Enter a degree in Celsuis: ");
        Scanner object = new Scanner(System.in);

        int Celsius = object.nextInt();

        double farenheit = (((9.0 * Celsius)) / 5.0 ) +32;

        System.out.println(Celsius + " Celsius is " + farenheit + " Farenheit");
    }
}
