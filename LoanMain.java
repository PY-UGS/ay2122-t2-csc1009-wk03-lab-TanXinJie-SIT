import java.util.Scanner;

public class LoanMain {
    public static void main(String[] args)
    {
        Loan newLoan = new Loan();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        newLoan.setAnnualInterestRate(input.nextDouble());
        System.out.print("Enter number of years as an integer: ");
        newLoan.setNumberOfYears(input.nextInt());
        System.out.print("Enter loan amount, for example, 120000.95: ");
        newLoan.setLoanAmount(input.nextDouble());
        System.out.println("The loan was created on " + newLoan.getLoanDate());
        System.out.println("The monthly payment is " + String.format("%.2f", newLoan.getMonthlyPayment()));
        System.out.println("The total payment is " + String.format("%.2f", newLoan.getTotalPayment()));
    }
}
