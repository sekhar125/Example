package com;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=new String("abc");
		String s2=s1.intern();
		System.out.print(s1==s2);//false
		String s3="abc";
		System.out.print(s2==s3);//true
	}

}
