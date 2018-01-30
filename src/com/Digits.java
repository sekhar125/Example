package com;

import java.util.ArrayList;
import java.util.List;

public class Digits {

	/**
	 * @param args
	 */
	
	static void findingDigits(int[] foo) {
        
        for(int i=0;i<foo.length;i++)
        {
        	int temp=foo[i];
        	List<Integer> result=new ArrayList<Integer>();
           while(true)
           {
        	   int digit=temp%10;
        	   if(temp==0)
        	   {
        		   break;
        	   }
        	   result.add(digit);
        	   temp=temp/10;
           }
           
           System.out.println(result);
           int temp1=0;
           for(Integer test:result)
           {
        	   
        	   if(test!=0&&foo[i]%test==0)
        	   {
        		   temp1=temp1+1;
        	   }
           }
           System.out.println(temp1);
        }

   }


	public static void main(String[] args) {
		int test[]={-10,17,1012};
		findingDigits(test);
	}

}
