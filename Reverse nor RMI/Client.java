// Client.java

import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Obtain the RMI service
            Reverse reverseService = (Reverse) Naming.lookup("rmi://localhost/reverse");

            // Prompt user to enter a number for reverse computation
            System.out.print("Enter a number to calculate reverse: ");
            int number = scanner.nextInt();

            // Calculate reverse using the RMI service
            int reverseResult = reverseService.calculateReverse(number);

            // Display the result
            System.out.println("Reverse of " + number + " is: " + reverseResult);

            scanner.close(); // Close the scanner
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

