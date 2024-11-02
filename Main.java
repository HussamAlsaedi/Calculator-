import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Double> resultsHistory = new ArrayList<>();
    private static double lastResult = 0;

    public static void main(String[] args) {
        System.out.println("Calculator in Java\n");
        Scanner sc = new Scanner(System.in);
        boolean continueCalculator = true;

        while (continueCalculator) {
            System.out.println("\nEnter First number: ");
            double num1 = sc.nextDouble();

            System.out.println("Enter Second number: ");
            double num2 = sc.nextDouble();

            displayMenu();
            int op = sc.nextInt();

            if (op == 0 ) {
                continueCalculator = false;
                break;
            }

            switch (op) {
                case 1:
                    lastResult = add(num1, num2);
                    System.out.printf("Result: %.2f\n", lastResult);
                    break;
                case 2:
                    lastResult = subtract(num1, num2);
                    System.out.printf("Result: %.2f\n", lastResult);
                    break;
                case 3:
                    lastResult = multiply(num1, num2);
                    System.out.printf("Result: %.2f\n", lastResult);
                    break;
                case 4:
                    if (num2 != 0) {
                        lastResult = divide(num1, num2);
                        System.out.printf("Result: %.2f\n", lastResult);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    lastResult = modulus(num1, num2);
                    System.out.printf("Result: %.2f\n", lastResult);
                    break;
                case 6:
                    if (num1 < num2 ) {
                        lastResult = num1;
                        System.out.printf("Minimum: %.2f\n", lastResult);
                        break;
                    }else
                    {
                        lastResult = num2;
                        System.out.printf("Minimum: %.2f\n", lastResult);
                        break;
                    }

                case 7:
                    if (num1 > num2 ) {
                        lastResult = num1;
                        System.out.printf("Maximum: %.2f\n", lastResult);
                        break;
                    }else {
                        lastResult = num2;
                        System.out.printf("Maximum: %.2f\n", lastResult);
                        break;
                    }
                case 8:
                    lastResult = average(num1, num2);
                    System.out.printf("Average: %.2f\n", lastResult);
                    break;
                case 9:
                    System.out.printf("Last result: %.2f\n", lastResult);
                    break;
                case 10:
                    System.out.println("All results in history:");
                    printAllResults();
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid operation.");
            }

            if (op >= 1 && op <= 8) {
                resultsHistory.add(lastResult); // Store the result in history
            }
        }
        sc.close();
    }


    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double modulus(double a, double b) {
        return a % b;
    }

    public static double average(double a, double b) {
        return (a + b) / 2;
    }

    public static void printAllResults() {
        if (resultsHistory.isEmpty()) {
            System.out.println("No results in history.");
        } else {
            for (int i = 0; i < resultsHistory.size(); i++) {
                System.out.printf("Result %d: %.2f\n", (i + 1), resultsHistory.get(i));
            }
        }
    }


    public static void displayMenu() {
        System.out.println();
        System.out.println("Choose an operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("5 - Modulus");
        System.out.println("6 - Minimum");
        System.out.println("7 - Maximum");
        System.out.println("8 - Average");
        System.out.println("9 - Show last result");
        System.out.println("10 - Show all results");
        System.out.println("0 - Exit");
        System.out.print("Enter operation number: ");
    }
}
