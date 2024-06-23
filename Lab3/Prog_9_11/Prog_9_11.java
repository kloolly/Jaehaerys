import java.util.Scanner;

public class Prog_9_11 {
    public static void main(String[]args) {
        System.out.print("Please Enter a, b, c, d, e, f:");
        Scanner scanIn = new Scanner(System.in);

        double a = scanIn.nextDouble(); //1
        double b = scanIn.nextDouble(); //2
        double c = scanIn.nextDouble(); //3
        double d = scanIn.nextDouble();
        double e = scanIn.nextDouble();
        double f = scanIn.nextDouble();
//                                               1  2  3
        LinearEquation test = new LinearEquation(a, b, c, d, e, f);
        if(LinearEquation.isSolvable()) {
            System.out.println("haha");
        } else {
            System.out.println("The equation has no solution.");
        }


    }
}

//      1 2 3 4 5 6
//      0 0 0 0 0 0