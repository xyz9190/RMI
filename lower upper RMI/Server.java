// Server.java

import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try {
            //Reverse reverseObj = new ReverseImpl();
            //Naming.rebind("rmi://localhost/reverse", reverseObj);

            StringConversion stringConversionObj = new StringConversionImpl();
            Naming.rebind("rmi://localhost/stringConversion", stringConversionObj);

            System.out.println("Server Started");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

