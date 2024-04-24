// LeapYear.java

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LeapYear extends Remote {
    boolean isLeapYear(int year) throws RemoteException;
}

