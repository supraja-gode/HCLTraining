package org.hcl;
class MyThread1 extends Thread
{
	public void start()
	{
		System.out.println("start method");
	}
	public void run()
	{
		System.out.println("run method");
	}
}
class ThreadDemo
{
	public static void main(String[] args)
	{
		MyThread t=new MyThread();
		t.start();
		System.out.println("main method");
	}
}