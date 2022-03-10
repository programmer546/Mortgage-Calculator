//create a mortgage calculator program that takes user input and returns the monthly mortgage
//than upgrade the calculator for data validation on user input
//advance the calculator such that it prints all the balances for the number of payments you have made
//refactor it to an OOP design

import java.util.Scanner;

public class Main {
    static Scanner typNow = new Scanner(System.in);
    public static void main(String[] args) {


        int principal = (int) UserInput.readNumber("Principal: ", 0,1000000);
         double air = UserInput.readNumber("Annual Interest Rate: ", 0,30);
        int period = (int) UserInput.readNumber("Period: ", 0,30);
        double monthlyInterestRate = air / MortgageCalculator.PERCENT / MortgageCalculator.MONTHS_IN_A_YEAR;
        int  numberOfPayments = period *12;
        var calculator = new MortgageCalculator(principal, air, period);
        new MortgageReport(calculator).printMortgage();
        new MortgageReport(calculator).printPaymentSchedule();
    }
}