package com;

public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str="helloindia";
		/*String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse+=str.charAt(i);
		}*/
		System.out.println(reverse(str));
		
	}
	
	public static String reverse(String str)
	{
		 if(str==null ||str.length()<=1)
			 return str;
		 return reverse(str.substring(1))+ str.charAt(0);
		 
	}
	
	public static String stringReverse(String str){
		
		if(str==null ||str.length() != 0){
			str = str.charAt(str.length()-1) + stringReverse(str.substring(0, str.length()-1));
		}
		
		return str;
	}

}
