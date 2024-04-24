// LeapYearImpl.java

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class LeapYearImpl extends UnicastRemoteObject implements LeapYear {
    public LeapYearImpl() throws RemoteException {
        super();
    }

    public boolean isLeapYear(int year) throws RemoteException {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}

