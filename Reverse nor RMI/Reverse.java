// Reverse.java

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Reverse extends Remote {
    int calculateReverse(int number) throws RemoteException;
}

