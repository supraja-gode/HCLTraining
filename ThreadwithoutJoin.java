package org.hcl;
public class ThreadwithoutJoin {
	public static void main(String[] args) {
	      Thread th1 = new Thread(new MyClass2(), "thread1");
	      Thread th2 = new Thread(new MyClass2(), "thread2");
	      Thread th3 = new Thread(new MyClass2(), "thread3");
	      th1.start();
	      th2.start();        
	      th3.start();
	   }
	}
class MyClass2 implements Runnable{
	  @Override
	    public void run() {
	    	Thread t = Thread.currentThread();
	        System.out.println("Thread started: "+t.getName());
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException ie) {
	            ie.printStackTrace();
	        }
	        System.out.println("Thread ended: "+t.getName());    
	    }
}
