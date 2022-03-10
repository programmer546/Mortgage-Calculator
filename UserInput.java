//create a mortgage calculator program that takes user input and returns the monthly mortgage
//than upgrade the calculator for data validation on user input
//advance the calculator such that it prints all the balances for the number of payments you have made
//refactor it to an OOP design
public class UserInput {
    public static double readNumber(String prompt, double min, double max){

        System.out.print(prompt);
        Double value = Main.typNow.nextDouble();
        while (value < min || value > max){
            System.out.print(prompt);
            value = Main.typNow.nextDouble();
            if (value < min || value > max)
                System.out.println("The value has to be between " + min + " and " + max);

        }
        return value;
    }
}
//part of Mortgage Calculator project
