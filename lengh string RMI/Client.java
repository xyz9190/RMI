// Client.java

import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            StringLength stringLengthService = (StringLength) Naming.lookup("rmi://localhost/stringlength");

            System.out.print("Enter a string to get its length: ");
            String str = scanner.nextLine();

            int length = stringLengthService.getLength(str);

            System.out.println("Length of the string is: " + length);

            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

