package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		/*int[] a= {15,3,46,17,18,2};
		//int[] b=new int[a.length];
		for(int j=a.length;j>1;j--)
		{
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				
			}
		}
		for(int k=0;k<a.length;k++)
		{
		System.out.print(a[k]+" ");
		}
		System.out.println();
		}*/
		List list=new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		list.add("abc");
		System.out.println(list);
		NavigableSet  temp=new TreeSet(list);
		System.out.println(temp);
		System.out.println(temp.last());
		System.out.println(temp.first());
		System.out.println("NavigableSet");
		Iterator ite=temp.descendingIterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		NavigableSet deSet=temp.descendingSet();
		System.out.println(deSet);
				
	}

}
