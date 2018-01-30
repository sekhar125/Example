package com;

public class VarArgExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		display();
		display("hai");
		display("one","two");
	}
	public static void display(String... args)
	{
		for(String arg:args)
		{
		 System.out.println(arg);
		}
	}

}
