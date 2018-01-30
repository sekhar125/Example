package com;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Collection<Employee> tcollection=new ArrayList<Employee>();
		
		Employee e1=new Employee();
		e1.setId("100");
		e1.setFname("Sekhar");
		e1.setLname("babu");
		e1.setSal(1000.00);
		tcollection.add(e1);
		System.out.println("Test collection1:"+e1.toString());
		Employee e2=new Employee();
		e2.setId("100");
		e2.setFname("Sekhar");
		e2.setLname("babu");
		e2.setSal(1000.00);
		tcollection.add(e2);
		System.out.println("Test collection2:"+e2.toString());
		System.out.println("Test collection1 and collection2 are:"+e2.equals(e1));
	}

}
