package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Employee1
{
	int id;
	String employeeName;
	public Employee1(int id,String name)
	{
		this.id=id;
		this.employeeName=name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employee) {
		this.employeeName = employee;
	}

	@Override
	public int hashCode() {
		
		return 0;
	}
	
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
*/	
	
}
public class HasMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Employee1,Integer> map=new HashMap<Employee1,Integer>();
		map.put(new Employee1(19,"Bash"), 1000);;
		map.put(new Employee1(19,"sekhar"), 2000);;
		map.put(null, 1000);;
		map.put(null, 4000);;
	//	System.out.print(map.get(new Employee1(19,"sekhar")));
		
		Set entryset = map.entrySet();
		Iterator it = entryset.iterator();
		while(it.hasNext()){
			Entry e = (Entry)it.next();
			System.out.println(e.getKey()+"==="+e.getValue());
		}
		
		/*Set<Employee1> setEmployee=map.keySet();
		Employee1 e1=new Employee1(19,"sekhar");
		map.put(e1, 300);
		e1.setEmployeeName("Raghuma");
		e1.setId(2000);
		map.put(e1,2000);
		System.out.print(map.get(e1));
		for(Iterator ite =setEmployee.iterator();ite.hasNext();)
		{
			System.out.print(((Employee1)ite.next()).employeeName);	
		}*/
		
		//System.out.print(map.get(e1));
		/*Employee1 e3=new Employee1();
		e3.setId(10);
		e3.setEmployee("Sekhar");
		if(map.get(e3)==null)
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("No");
		}*/
		
		
		
	}

}
