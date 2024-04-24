// Client.java

import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            StringConversion stringConversionService = (StringConversion) Naming.lookup("rmi://localhost/stringConversion");

            System.out.print("Enter a string to convert to upper case: ");
            String inputString = scanner.nextLine();

            String upperCaseString = stringConversionService.toUpperCase(inputString);
            System.out.println("Upper case: " + upperCaseString);

            System.out.print("Enter a string to convert to lower case: ");
            inputString = scanner.nextLine();

            String lowerCaseString = stringConversionService.toLowerCase(inputString);
            System.out.println("Lower case: " + lowerCaseString);

            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

