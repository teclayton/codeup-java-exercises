import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(addition(10, 5));
//        System.out.println(subtraction(10, 5));
//        System.out.println(multiply(10, 5));
//        System.out.println(division(10, 5));
//        System.out.println(modulus(11, 5));
    processFactorial();

    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }


    public static void processFactorial() {
        boolean willContinue;
        do {
            System.out.println("Enter a number between 1 and 10");
            Scanner sc = new Scanner(System.in);
            int userInt = getInteger(1, 10);
            System.out.println("The factorial is: " + factorial(userInt));
            System.out.println("Do you wish to enter another number to calculate?");
            willContinue = sc.next().equals("y");
        } while (willContinue);
        System.out.println("Have a nice day!");
    }


    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i += 1) {
            fact *= i;
        }
        return fact;
    }


    public static int getInteger(int min, int max) {
        int output;
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.printf("Invalid input. Enter a valid integer between %d and %d: ", min, max);
            sc.next();
        }
        output = sc.nextInt();
        if (output < min || output > max) {
            System.out.printf("Invalid range. Enter a valid integer between %d and %d: ", min, max);
            return getInteger(min, max);
        }
        return output;


    }
}
