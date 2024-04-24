import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FactorialImpl extends UnicastRemoteObject implements Factorial {
    public FactorialImpl() throws RemoteException {
        super();
    }

    public long calculateFactorial(int number) throws RemoteException {
        if (number < 0) {
            throw new RemoteException("Factorial of negative numbers is not defined.");
        }

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
