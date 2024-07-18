import java.util.Scanner;

public class MaxOf3 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter three integers: ");
        int userInput1 = in.nextInt();
        int userInput2 = in.nextInt();
        int userInput3 = in.nextInt();
        System.out.println("Max: "+Math.max(Math.max(userInput1, userInput2), userInput3)    );
    }
}
