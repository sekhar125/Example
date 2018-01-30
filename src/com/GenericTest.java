package com;

public class GenericTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Student<Integer> tStudent= new Student();
		tStudent.setId(10);
		System.out.println(tStudent.id);
	}

}

class Employee11
{
	String id;
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class Student <T>
{
	T id;
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getId() {
		return id;
	}
	public void setId(T id) {
		this.id = id;
	}
	
	
}