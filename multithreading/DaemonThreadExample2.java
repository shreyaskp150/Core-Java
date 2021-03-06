package multithreading;

public class DaemonThreadExample2 extends Thread
{
	public void run() 
    { 
        System.out.println("Thread name: "+Thread.currentThread().getName()); 
        System.out.println("Check if its DaemonThread: "+Thread.currentThread().isDaemon()); 
    }
    public static void main(String[] args) 
    { 
        DaemonThreadExample2 t1 = new DaemonThreadExample2(); 
        DaemonThreadExample2 t2 = new DaemonThreadExample2(); 
        t1.start();
        // Exception as the thread is already started 
        t1.setDaemon(true);
        t2.start(); 
    } 
}