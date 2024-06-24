import java.util.Scanner;

public class Prog_9_11 {
    public static void main(String[]args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Enter a,b,c,d,e,f : ");
        double a = scanIn.nextDouble();
        double b = scanIn.nextDouble();
        double c = scanIn.nextDouble();
        double d = scanIn.nextDouble();
        double e = scanIn.nextDouble();
        double f = scanIn.nextDouble();

        LinearEquation monDay = new LinearEquation(a,b,c,d,e,f);

        if (monDay.isSolvable()) {
            System.out.println("x = "+monDay.getX());
            System.out.println("y = "+monDay.getY());

        } else System.out.println("The equation has no solution.");
}
}
//    1 2 3 4 5 6     400 3 0 12 199 76
//
//    0 0 0 0 0 0

