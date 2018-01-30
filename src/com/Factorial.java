package com;

import java.util.Scanner;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.print("Enter number");
        Scanner sc=new Scanner(System.in);
        int data1=Integer.parseInt(sc.nextLine());
        System.out.print("Enter factorial value");
        int data2=Integer.parseInt(sc.nextLine());
        int result=factorialRecursion(data1);
        System.out.print("result"+result);
        if(data2==result)
        {
        	System.out.print("equal");
        }
	}
	static int factorial(int temp)
	{
		int fact=1;
		for(int i=temp;i>0;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	static public int factorialRecursion(int n)
	{
		if (n == 0)
			return 1;
		else
			return n * factorialRecursion(n-1);
	}
}
