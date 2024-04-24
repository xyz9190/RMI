import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Obtain the RMI service
            GcdLcm gcdLcmService = (GcdLcm) Naming.lookup("rmi://localhost/gcdlcm");

            // Prompt user to enter two numbers
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            // Calculate GCD and LCM using the RMI service
            int gcdResult = gcdLcmService.calculateGcd(a, b);
            int lcmResult = gcdLcmService.calculateLcm(a, b);

            // Display the results
            System.out.println("GCD of " + a + " and " + b + " is: " + gcdResult);
            System.out.println("LCM of " + a + " and " + b + " is: " + lcmResult);

            scanner.close(); // Close the scanner
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
