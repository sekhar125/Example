package com;

public class Singleton {

	private static Employe emp;
	private Singleton()
	{
		System.out.println("init");
	}
	
	public  static Employe getInst()
	{
			if(emp==null)
			{
				System.out.println("New Object Created");
				emp=new Employe("Koti","140059");
			}
		
		System.out.println("getInst");
		return emp;
	}
	public void hello()
	{
		System.out.print("hello");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employe emp = Singleton.getInst();
		System.out.println(emp.toString());
		emp.setId("1234");
		emp.setName("Sekhar");
		emp = null;
		emp = Singleton.getInst();
		System.out.println(emp.toString());
	}

}

class Employe{
	String name;
	String id;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	Employe(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " ===== " + id;
	}
}
