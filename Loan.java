import java.util.Date;

public class Loan {
    private double annualInterestRate = 2.5;
    private int numberOfYears = 1;
    private double loanAmount = 1000f;
    private Date loanDate = new Date();
    
    public Loan() {
    
    }
    
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount, Date loanDate) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = loanDate;
    }
    
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate / 100;
    }
    
    public int getNumberOfYears() {
        return numberOfYears;
    }
    
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
    
    public double getLoanAmount() {
        return loanAmount;
    }
    
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    
    public Date getLoanDate() {
        return loanDate;
    }
    
    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }
    
    public double getMonthlyPayment()
    {
        double monInt = annualInterestRate / 12;
        double exp = numberOfYears * 12;
        double temPow = 1 - (1 / Math.pow(1 + monInt, exp));
        double tempUp = loanAmount * monInt;
        double result = tempUp / temPow;
        return result;
    }
    
    public double getTotalPayment()
    {
        return getMonthlyPayment() * numberOfYears * 12;
    }
}
