// Client.java

import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            Palindrome palindromeService = (Palindrome) Naming.lookup("rmi://localhost/palindrome");

            System.out.print("Enter a number to check if it's a palindrome: ");
            int number = scanner.nextInt();

            boolean isPalindrome = palindromeService.isPalindrome(number);

            if (isPalindrome) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

