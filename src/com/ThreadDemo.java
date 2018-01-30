package com;

public class ThreadDemo {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
		t.start();
		MyThread1 t1=new MyThread1();
		t1.start();
		t1.sleep(1000);
		
		MyThread1 t2=new MyThread1();
		t2.start();
		for(int i=0;i<10;i++)
		System.out.println("Parent Thread");
		System.out.println("Thread count"+Thread.getAllStackTraces().toString());
	}

}

class MyThread extends Thread
{
	
	public void run() {
		for(int i=0;i<10;i++)
		System.out.println("child Thread");
	}
}
class MyThread1 extends Thread
{
	public void run() {
		for(int i=0;i<10;i++)
		System.out.println("child Thread1");
	}
}