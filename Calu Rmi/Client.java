import java.rmi.*;

public class Client extends Thread{
	public  void run(){
	

		try{
			Add obj=(Add)Naming.lookup("rmi://localhost/guru");
			System.out.println(Thread.currentThread().getName()+" Addition is: "+obj.add(36,15));
			System.out.println(Thread.currentThread().getName()+ " Subtraction is: "+obj.sub(20,9));
			System.out.println(Thread.currentThread().getName()+" Muiltiplication is: "+obj.mul(15,3));
			System.out.println(Thread.currentThread().getName()+" Division is: "+obj.div(75,9));
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	public static void main(String args[]){
		
	Client c=new Client();
	c.setName("Thread 1");
	c.start();
	Client c2=new Client();
	c.setName("Thread 2");
	c2.start();
	
	
		
		
	}
}
