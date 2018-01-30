package com;

public class Question {

	
	static public void javaHungry(String str)
	{
		System.out.println("String");
	}
	static public void javaHungry(Object str)
	{
		System.out.println("object");
	}
	static public void javaHungry(Integer str)
	{
		System.out.println("Integer");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//javaHungry(null);
		if(null ==null)
		{
			System.out.println("if");
		}
		else
		{
			System.out.println("else");
		}
	}

}
