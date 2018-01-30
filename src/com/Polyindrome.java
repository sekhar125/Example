package com;

public class Polyindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String poly="ABA";
		System.out.print(polindrome(poly,0,poly.length()-1));
	}
	public static boolean polindrome(String poly,int low,int high)
	{
		if(high<=low)
		{
			return true;
		}
		else if(poly.charAt(low)!=poly.charAt(high))
		{
			
			return false;
		}
		else
		{
			return polindrome(poly,low+1,high-1);
		}
	}

}
