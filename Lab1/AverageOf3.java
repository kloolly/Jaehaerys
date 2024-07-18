import java.util.Scanner;

public class AverageOf3 {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        System.out.print("Please enter three integers: ");
        int userInput1 = java.nextInt();
        int userInput2 = java.nextInt();
        int userInput3 = java.nextInt();
        System.out.println("Average: " + (userInput1 + userInput2 + userInput3) / 3.0);
    }
}
