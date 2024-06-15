import java.util.Scanner;

public class Prog_2_5 {

    public static void main(String[] arg) {
        System.out.print("Enter the subtotal and a gratuity rate:");

        Scanner sc = new Scanner(System.in);

        double subtotal = sc.nextDouble();
        double gratuity = sc.nextDouble();

        double gratuityRate = gratuity * 0.1;
        double total = subtotal + gratuityRate;

        //System.out.println(gratuityRate);
        System.out.print("The gratuity is $"+ gratuityRate +" and total is $"+ total);
    }
}