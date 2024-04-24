import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Obtain the RMI service
            Factorial factorialService = (Factorial) Naming.lookup("rmi://localhost/factorial");

            // Prompt user to enter a number for factorial computation
            System.out.print("Enter a number to calculate factorial: ");
            int number = scanner.nextInt();

            // Calculate factorial using the RMI service
            long factorialResult = factorialService.calculateFactorial(number);

            // Display the result
            System.out.println("Factorial of " + number + " is: " + factorialResult);

            scanner.close(); // Close the scanner
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
