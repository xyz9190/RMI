

import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try {
            GcdLcm gcdLcmObj = new GcdLcmImpl();
            Naming.rebind("rmi://localhost/gcdlcm", gcdLcmObj);

            System.out.println("GCD LCM Server Started");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
