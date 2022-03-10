//create a mortgage calculator program that takes user input and returns the monthly mortgage
//than upgrade the calculator for data validation on user input
//advance the calculator such that it prints all the balances for the number of payments you have made
//refactor it to an OOP design
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        final int MONTHS_IN_A_YEAR = 12;
        final int PERCENT = 100;

        Scanner typNow = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = typNow.nextInt();

        System.out.print("Annual Interest Rate: ");
        double air = typNow.nextDouble();

        System.out.print("Period(Years): ");
       int period = typNow.nextInt();

        double monthlyInterestRate = air/PERCENT/MONTHS_IN_A_YEAR;
        int  numberOfPayments = period*12;

        double mortgage = principal * (monthlyInterestRate * Math.pow(1+monthlyInterestRate,numberOfPayments ))/
                (Math.pow(1+monthlyInterestRate, numberOfPayments) - 1);
        System.out.print("Mortgage: " + mortgage) ;

    }
}