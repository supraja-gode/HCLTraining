package org.hcl;
import java.lang.*;
public class ThreadYeildDemo implements Runnable
{
	Thread t;
	ThreadYeildDemo(String str)
	{
		t=new Thread(this,str);
		t.start();
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			if((i%5)==0)
			{
				System.out.println(Thread.currentThread().getName() + "yielding control...");
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName() + " has finished executing.");
	}
	public static void main(String []args)
	{
		new ThreadYeildDemo("Thread 1");
		new ThreadYeildDemo("Thread 2");
		new ThreadYeildDemo("Thread 3");
	}
}