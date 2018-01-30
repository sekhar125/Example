package com;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagram{

	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // String temp=System.getProperty("user.dir");;
	  //String temp="abcdefghijklmnopqrstuvwxyz";
		//String temp=args[0];
		Scanner sc=new Scanner(System.in);
		
	  String temp=sc.nextLine();
		System.out.println(temp);
      System.out.print(ispanagram(temp));
      temp="abcdefghijklmnopqrstuwxyz";
      System.out.println(temp);
      System.out.print(ispanagram(temp));
      
      //temp=System.console().readLine();
      //System.out.print(ispanagram(temp));
	}
	static boolean  ispanagram(String temp )
	{
		Set<Character> lettersRemaining =
			new HashSet<Character>();
		temp=temp.toLowerCase();
		for(char tchar : temp.toCharArray())
		{
			if(tchar>='a'&& tchar<='z')
			{
			lettersRemaining.add(tchar);
			}
		}
		if(lettersRemaining.size()==26)
		{
			return true;
		}
		else
		{
			return false;	
		}
		
	}

}


