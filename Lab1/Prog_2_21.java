import java.util.Scanner;

public class Prog_2_21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble() / 100;

        System.out.print("Enter number of years: ");
        double years = input.nextDouble();

        double futureInvestmentValue = investmentAmount *
                Math.pow((1 + (annualInterestRate / 12)), (years * 12));
        System.out.print(annualInterestRate);

        System.out.print(" Accumulated value is $" + futureInvestmentValue);
    }
}