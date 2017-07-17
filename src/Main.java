import java.util.Scanner;

/**
 * Created by roberttaylor on 7/17/17.
 */
public class Main{
public static void main(String[]args){
    System.out.println("Please enter a number");
    String num1 = getNum();
    System.out.println("Please enter another number");
    String num2 = getNum();
    double operand1 = Double.parseDouble(num1);
    double operand2 = Double.parseDouble(num2);
    showResults(operand1,operand2);

        }

        public static String getNum() {
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            return userInput;

        }
        public static void showResults(double operand1, double operand2) {
            double sum = operand1 + operand2;
            double difference = operand1 - operand2;
            double division = operand1 / operand2;

            double multiplication = operand1 * operand2;
            double remainder = operand1 % operand2;
            System.out.println("The sum is " + sum);
            System.out.println("The difference is " + difference);
            System.out.println("The result is " + division);
            System.out.println("The result is " + multiplication);
            System.out.println("The remainder is " + remainder);


        }
}

