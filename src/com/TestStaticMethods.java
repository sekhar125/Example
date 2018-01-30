package com;

import java.util.ArrayList;
import java.util.List;

public class TestStaticMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3 a=new A3();
		a.display();
		B3 b=new B3();
		b.display();
		A3 b1=new B3();
		b1.display();
		/*List<A3> list1=new ArrayList<B3>();
		List<B3> list2=new ArrayList<A3>();*/
		/*List<A3> list3=new ArrayList<A3>();
		List<B3> list4=new ArrayList<B3>();*/
	}

}
class A3
{
	public static void display()
	{
		System.out.println("A");
	}
}
class  B3 extends A3
{
	public static void display()
	{
		System.out.println("B");
	}
}