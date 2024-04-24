

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Factorial extends Remote {
    long calculateFactorial(int number) throws RemoteException;
}

