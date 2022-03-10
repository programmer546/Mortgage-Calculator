//create a mortgage calculator program that takes user input and returns the monthly mortgage
//than upgrade the calculator for data validation on user input
//advance the calculator such that it prints all the balances for the number of payments you have made
//refactor it to an OOP design
public class MortgageCalculator {
    public final static int MONTHS_IN_A_YEAR = 12;
    public final static int PERCENT = 100;

    private int principal;
    private double annualInterest;
    private int period;
    private double monthlyInterestRate;
    private int numberOfPayments;

    public MortgageCalculator(int principal, double annualInterest, int period) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.period = period;
    }

    public  double calculateBalance(double monthlyInterestRate, int numberOfPayments) {
        double balance = 0;
        for (int month = 0; month <= numberOfPayments; month++) {
             balance = principal * (Math.pow(1 + monthlyInterestRate, numberOfPayments) -
                    Math.pow(1 + monthlyInterestRate, month)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
            System.out.println(balance);

        }
        return balance;
    }

    public  double calculateMortgage() {
        int  numberOfPayments = period *12;

        double mortgage = principal * (monthlyInterestRate * Math.pow(1+monthlyInterestRate,numberOfPayments ))/
                (Math.pow(1+monthlyInterestRate, numberOfPayments) - 1);
        System.out.print("Monthly Payments: " + mortgage) ;
        return mortgage;
    }

    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    public int getNumberOfPayments() {
        return numberOfPayments;
    }
}