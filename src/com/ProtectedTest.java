package com;

public class ProtectedTest extends com.test.B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stubSYStem 
		ProtectedTest test=new ProtectedTest();
		System.out.print(test.j);
		test.j=100;
		System.out.print(test.j);
	}

}
class A2
{
	protected int i=0;
}