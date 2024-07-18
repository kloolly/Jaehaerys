import java.util.Map;
import java.util.Scanner;

public class Prog_2_15 {
    public static void main (String[]args){
        Scanner macbookpro = new Scanner(System.in);
        System.out.print("Enter x1 and y1:");
        double x1 = macbookpro.nextDouble();
        double y1 = macbookpro.nextDouble();

        System.out.print("Enter x2 and y2:");
        double x2 = macbookpro.nextDouble();
        double y2 = macbookpro.nextDouble();

        double distance, godzilla;
        godzilla = Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
        distance = Math.pow(godzilla,0.5);

        System.out.print("The distance between the two points is "+distance);
    }
}
