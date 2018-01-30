package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<CgiEmployee> emp=new HashSet<CgiEmployee>();
		
		emp.add(new CgiEmployee("1","Sekhar"));
		//emp.add("String");
		System.out.println(emp.toString());
		List list=new ArrayList();

	}
	
	

}

class CgiEmployee
{
	public CgiEmployee(String id,String name)
	{
		this.id=id;
		this.name=name;
	}
	String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name;
	
}
