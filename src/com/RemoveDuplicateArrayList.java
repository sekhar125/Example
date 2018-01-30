package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Stu> al = new ArrayList<Stu>();
		al.add(new Stu("1","Sekhar"));
		al.add(new Stu("1","Sekhar"));
		al.add(new Stu("1","sunil"));
		for(Stu s:al)
			System.out.println(s.getId()+s.getName());
		// add elements to al, including duplicates
		Set<Stu> hs = new HashSet<Stu>(al);
		al.clear();
		al.addAll(hs);
		for(Stu s:al)
		System.out.println(s.getId()+s.getName());
	}

}
class Stu
{
	public Stu(String id,String name)
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Stu other = (Stu) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
