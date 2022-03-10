//create a mortgage calculator program that takes user input and returns the monthly mortgage
//than upgrade the calculator for data validation on user input
//advance the calculator such that it prints all the balances for the number of payments you have made
//refactor it to an OOP design
public class MortgageReport {

    private  MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void printPaymentSchedule() {
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("-----------------");
        calculator.calculateBalance(calculator.getMonthlyInterestRate(), calculator.getNumberOfPayments());
    }


    public void printMortgage() {
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("----------");
        double mortgage = calculator.calculateMortgage();
        System.out.println();
    }
}