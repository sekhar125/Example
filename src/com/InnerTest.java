package com;

public class InnerTest {

	private int data=30;  
	 class Inner{  
	  void msg(){System.out.println("data is "+data);}  
	 }  
	 public static void main(String args[]){  
		 InnerTest obj=new InnerTest();  
		 InnerTest.Inner in=obj.new Inner();  
	  in.msg();  
	 }  

}

