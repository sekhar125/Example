package com;


public class MySimpleGenerics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleGeneric<Student1> s=new SimpleGeneric<Student1>(new Student1("Sekhar","babu"));
		s.printType();
		SimpleGeneric<Employee2> b=new SimpleGeneric<Employee2>(new Employee2("Sekhar1","babu1",1000));
		b.printType();
	}

}

class SimpleGeneric<T extends Person>
{
	private T objRef;
	public SimpleGeneric(T param)
	{
		this.objRef=param;
	}
	
	public T getObjRef()
	{
		return this.objRef;
	}
	public void printType()
	{
		System.out.println("object:"+objRef.toString());
	}
}

class Student1 extends Person
{
	public Student1(String firstName,String lastName)
	{
		super(firstName,lastName);
	}
	
	@Override
	public String toString() {
		return "FirstName:"+getFirstName()+"LastName:"+getLastName();
	}
}

class Employee2 extends Person
{
	public Employee2(String firstName,String lastName,float salary)
	{
		super(firstName, lastName);
		this.salary=salary;
	}
	
	private float salary;
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "FirstName:"+getFirstName()+"LastName:"+getLastName()+"Salary:"+this.salary;
	}
}

class Person
{
	private String firstName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private String lastName;
	public Person(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	
}