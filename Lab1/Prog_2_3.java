import java.util.Scanner;

public class Prog_2_3 {
    public static void main(String[] args) {
        System.out.print("Enter a value for feet: ");
        Scanner object = new Scanner(System.in);

        double feetfeet = object.nextDouble();

        double meters = feetfeet * 0.305;

        System.out.println(feetfeet + " feet is " + meters +" meters");
    }
}
