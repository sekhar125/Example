package com;

public class Singleton {

	private static volatile Singleton singleton=null;
	private Singleton()
	{
		System.out.println("init");
	}
	
	public  static Singleton getInst()
	{
		synchronized (singleton) {
			if(singleton==null)
			{
				singleton=new Singleton();
			}
		}
		
		System.out.println("getInst");
		return singleton;
	}
	public void hello()
	{
		System.out.print("hello");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton.getInst().hello();

	}

}
