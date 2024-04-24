// Client.java

import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            SubstringSearch substringSearchService = (SubstringSearch) Naming.lookup("rmi://localhost/substringsearch");

            System.out.print("Enter the main string: ");
            String mainString = scanner.nextLine();

            System.out.print("Enter the substring to search: ");
            String subString = scanner.nextLine();

            boolean containsSubstring = substringSearchService.containsSubstring(mainString, subString);

            if (containsSubstring) {
                System.out.println("Substring found in the main string.");
            } else {
                System.out.println("Substring not found in the main string.");
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

