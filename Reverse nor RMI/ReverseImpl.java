// ReverseImpl.java

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ReverseImpl extends UnicastRemoteObject implements Reverse {
    public ReverseImpl() throws RemoteException {
        super();
    }

    public int calculateReverse(int number) throws RemoteException {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }
}

