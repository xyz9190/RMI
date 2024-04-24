// Server.java

import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try {
            //Reverse reverseObj = new ReverseImpl();
            //Naming.rebind("rmi://localhost/reverse", reverseObj);

            Concatenate concatenateObj = new ConcatenateImpl();
            Naming.rebind("rmi://localhost/concatenate", concatenateObj);

            System.out.println("Server Started");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

