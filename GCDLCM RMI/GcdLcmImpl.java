
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GcdLcmImpl extends UnicastRemoteObject implements GcdLcm {
    public GcdLcmImpl() throws RemoteException {
        super();
    }

    public int calculateGcd(int a, int b) throws RemoteException {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int calculateLcm(int a, int b) throws RemoteException {
        return (a / calculateGcd(a, b)) * b;
    }
}
