import java.util.Scanner;

public class storeInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of elements
        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        // Create an array to store the numbers สร้างอาเรชื่อ number แบบตัวแปร int
//        โดย keyword new
        int[] numbers = new int[numElements];

        // Prompt the user to enter the numbers
        System.out.println("Enter " + numElements + " numbers:");
        for (int i = 0; i < numElements; i++) {
            numbers[i] = scanner.nextInt();  // Read each number and store in the array
        }

        // Close the scanner
        scanner.close();

        // Output the numbers to verify they were stored correctly
        System.out.println("You entered:");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}