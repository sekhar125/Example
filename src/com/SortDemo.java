package com;

public class SortDemo {

	/**
	 * @param args
	 */
	public int[] sort(int a[]) {
		// TODO Auto-generated method stub
		if(a==null || a.length==0)
			return null;
		for(int i=0;i<a.length;i++)
			for (int j=i+1;j<a.length;j++)
			{
				int temp=a[i];
				if(a[i]>a[j])
				{
					a[i]=a[j];
					a[j]=temp;
				}
			}
		return a;
		
	}

}
