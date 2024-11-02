import java.util.*;

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
                    lastResult =  num1 + num2;
                    System.out.printf("Result: %.2f\n", lastResult);
                    break;
                case 2:
                    lastResult =  num1 - num2;
                    System.out.printf("Result: %.2f\n", lastResult);
                    break;
                case 3:
                    lastResult = num1 * num2;
                    System.out.printf("Result: %.2f\n", lastResult);
                    break;
                case 4:
                    if (num2 != 0) {
                        lastResult =  num1 / num2;
                        System.out.printf("Result: %.2f\n", lastResult);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    lastResult =   num1 % num2;
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
                    lastResult =  (num1 + num2) / 2;
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


    public static void printAllResults() {
        if (resultsHistory.isEmpty()) {
            System.out.println("No Record in history.");
        } else {
            for (int i = 0; i < resultsHistory.size(); i++) {
                System.out.printf("Result %d: %.2f\n", (i + 1), resultsHistory.get(i));
            }
        }
    }



        public static void displayMenu() {
            String[] operations = {
                    "1 - Addition",
                    "2 - Subtraction",
                    "3 - Multiplication",
                    "4 - Division",
                    "5 - Modulus",
                    "6 - Minimum",
                    "7 - Maximum",
                    "8 - Average",
                    "9 - Show last result",
                    "10 - Show all results",
                    "0 - Exit"
            };

            System.out.println();
            System.out.println("Choose an operation:");

            for (String operation : operations) {
                System.out.println(operation);
    }
    }

}
