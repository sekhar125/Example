package com;

import java.lang.reflect.Constructor;

public class TestMain {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	   public static void   main(String... args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.setSecurityManager(new SecurityManager());
		Class cs=(Class)Class.forName("com.Singleton");
		Constructor[] csarg=cs.getDeclaredConstructors();
		System.out.print(csarg[0].toString());
		csarg[0].setAccessible(true);
		cs.newInstance();
		//Singleton obj=(Singleton)cs.newInstance();*/
		
		//Singleton singleton=new Singleton();
		
		/*String str="Done";
		System.out.println(str);
		String reverse="";
		for(int i=str.length();i>0;i--)
		{
			reverse+=str.charAt(i-1);
		}
		System.out.println(reverse);
		TestMain t=new TestMain();
		reverse=t.reverseString(str);
		TestMain t=new TestMain();
		reverse=reverse+t.reverseString(str);
		
		System.out.println(reverse);*/
		/*Integer id=new Integer("2147483648");
		System.out.println(id);*/
		String str = "11001223021";

		for(int i=0; i<str.length()-1; i++){
		    System.err.print(str.charAt(i));
		    if(Integer.parseInt(str.charAt(i)+"") != 0){
		                                
		                if(Integer.parseInt((str.charAt(i)+""))%2 == 0 && Integer.parseInt(str.charAt(i+1)+"")%2 == 0){
		                                System.err.print("*");
		                }
		                else{
		                                System.err.print("-");
		                }
		    }
		}
		System.err.print(str.charAt(str.length()-1));

	}
	
	/*
	String reverse = "";
    
    public String reverseString(String str){
         
        if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1)
                    +reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
	}*/
	public String reverseString(String str){
        if(str.length() <1){
            return str;
        } else {
        	 return reverseString(str.substring(1))+str.charAt(0);
        }
	}
}
