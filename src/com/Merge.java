package com;
public class Merge {

	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]={1,2,30,40,3,4,5};
         int b[]={6,7,8,9,10};
         int c[]=merge(a,b);
         for(int i=0;i<c.length;i++)
         {
        	System.out.println(c[i]);
         }
         
	}
     static int[] merge(int a[],int b[])
     {
    	int[]c = new int[a.length+b.length];
    	 int i;
    	 for(i=0; i<a.length; i++)
    	    c[i] = a[i];

    	    for(int j=0; j<b.length; j++)
    	       c[i++]=b[j];
    	    
    	    for(int k=0;k<c.length;k++)
    	    {
    	   	 for(int l=0;l<c.length-1;l++)
    	   	 {
    	   		 if(c[l]>c[l+1])
    	   		 {
    	   			 int temp=c[l];
    	   			 c[l]=c[l+1];
    	   			 c[l+1]=temp;
    	   		 }
    	   	 }
    	    }
    	       return c;
     }
}

