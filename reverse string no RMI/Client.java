// Client.java

import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            StringReverse stringReverseService = (StringReverse) Naming.lookup("rmi://localhost/stringreverse");

            System.out.print("Enter a string to reverse: ");
            String str = scanner.nextLine();

            String reversedString = stringReverseService.reverseString(str);

            System.out.println("Reversed string: " + reversedString);

            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

