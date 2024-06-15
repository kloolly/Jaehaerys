import java.util.Scanner;

public class Prog_2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter v0, v1 and t: ");  // 5.5 50.9 4.5

        float v0 = sc.nextFloat();
        float v1 = sc.nextFloat();
        float t = sc.nextFloat();

        float finalAnswer = ((v1 -v0) / t) ;
        String str4digit = String.format("%.4f", finalAnswer);
        System.out.print("The average acceleration is " + str4digit);
    }
}
