package com;

import java.util.HashSet;

public class B implements A {

	public void ser(){
		System.out.println("Serxd");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> s1=new HashSet<String>();
s1.add("1");
s1.add("2");
HashSet<String> s2=new HashSet<String>();
s2.add("3");
s2.add("4");
s2.addAll(s1);
System.out.print(s2);

}

}
