import java.util.Scanner;

public class Prog_2_23 {
    public static void main (String[]args){
        Scanner ISO27001 = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double drivingDistance = ISO27001.nextDouble();

        Scanner ISO27002 = new Scanner(System.in);
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = ISO27001.nextDouble();

        Scanner ISO27003 = new Scanner(System.in);
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = ISO27001.nextDouble();

        double gallonThisTrip, costOfDriving ;
        gallonThisTrip = drivingDistance / milesPerGallon ;
        costOfDriving = gallonThisTrip * pricePerGallon ;

        System.out.printf("The cost of driving is $%.2f",costOfDriving);
        //System.out.printf("The cost of driving is $%.2f", costOfDriving);
    }
}
