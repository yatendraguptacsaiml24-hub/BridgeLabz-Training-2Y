// level 2/Calculator.java

public class Calculator {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as arguments!");
            return;
        }
        double number1 = Double.parseDouble(args[0]);
        double number2 = Double.parseDouble(args[1]);
      
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = (number2 != 0) ? (number1 / number2) : Double.NaN;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
    }
}
