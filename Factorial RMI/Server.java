
import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try {
            Factorial factorialObj = new FactorialImpl();
            Naming.rebind("rmi://localhost/factorial", factorialObj);

            System.out.println("Factorial Server Started");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
