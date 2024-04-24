// Server.java

import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try {
            //Reverse reverseObj = new ReverseImpl();
            //Naming.rebind("rmi://localhost/reverse", reverseObj);

            SubstringSearch substringSearchObj = new SubstringSearchImpl();
            Naming.rebind("rmi://localhost/substringsearch", substringSearchObj);

            System.out.println("Server Started");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

