import java.util.Scanner;
public class  LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the start and end years
        System.out.print("Please enter START and END years: ");
        int startYear = scanner.nextInt();
        int endYear = scanner.nextInt();
        // Initialize the count of leap years
        int leapYearCount = 0;
        // StringBuilder to store the leap years
        StringBuilder leapYears = new StringBuilder();
        // Iterate over each year in the range
        for (int year = startYear; year <= endYear; year++) {
            if (isLeapYear(year)) {
                // Increment the leap year count
                leapYearCount++;
                // Append the leap year to the list
                leapYears.append(year).append(" ");
                // Print the leap year in a formatted way
                if (leapYearCount % 5 == 0) {
                    leapYears.append("\n");
                }
            }
        }
        // Output the results
        System.out.printf("From %d to %d, there are %d leap years in these years:\n", startYear, endYear, leapYearCount);
        System.out.println(leapYears.toString().trim());
        System.out.println("Total = " + leapYearCount);
    }
    // Function to determine if a year is a leap year
    public static boolean isLeapYear(int year) {
        // A leap year is divisible by 4, but if it's a century year, it must also be divisible by 400
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
}