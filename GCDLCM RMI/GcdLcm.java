
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GcdLcm extends Remote {
    int calculateGcd(int a, int b) throws RemoteException;
    int calculateLcm(int a, int b) throws RemoteException;
}
