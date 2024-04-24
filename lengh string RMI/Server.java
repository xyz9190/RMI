// Server.java

import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try {
            //Reverse reverseObj = new ReverseImpl();
            //Naming.rebind("rmi://localhost/reverse", reverseObj);

            StringLength stringLengthObj = new StringLengthImpl();
            Naming.rebind("rmi://localhost/stringlength", stringLengthObj);

            System.out.println("Server Started");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

