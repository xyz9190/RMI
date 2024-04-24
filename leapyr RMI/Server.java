// Server.java

import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try {
             LeapYear leapYearObj = new LeapYearImpl();
            Naming.rebind("rmi://localhost/leapyear", leapYearObj);

            //LeapYearr leapYearrObj = new LeapYearrImpl();
            //Naming.rebind("rmi://localhost/leapyearr", leapYearrObj);

            System.out.println("Server Started");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

