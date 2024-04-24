// Client.java

import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            LeapYear leapYearService = (LeapYear) Naming.lookup("rmi://localhost/leapyear");

            System.out.print("Enter a year to check if it's a leap year: ");
            int year = scanner.nextInt();

            boolean isLeapYear = leapYearService.isLeapYear(year);

            if (isLeapYear) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

