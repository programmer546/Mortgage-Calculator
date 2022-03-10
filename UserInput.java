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