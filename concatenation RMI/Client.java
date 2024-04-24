// Client.java

import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            Concatenate concatenateService = (Concatenate) Naming.lookup("rmi://localhost/concatenate");

            System.out.print("Enter the first string: ");
            String str1 = scanner.nextLine();

            System.out.print("Enter the second string: ");
            String str2 = scanner.nextLine();

            String concatenatedString = concatenateService.concatenateStrings(str1, str2);

            System.out.println("Concatenated string: " + concatenatedString);

            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

