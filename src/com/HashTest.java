package com;

import java.util.HashMap;

public class HashTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Capital c1=new Capital();
		c1.setCapital("India");
		c1.setCountryName("NewDelhi");
		
		Capital c2=new Capital();
		c2.setCapital("London");
		c2.setCountryName("London");
		HashMap<Capital, String> map=new HashMap<Capital, String>();
		map.put(c1, "1000");
		System.out.println(map);
		System.out.println(map.get(c1));
		

	}

}

class Capital
{
	String countryName;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result
				+ ((countryName == null) ? 0 : countryName.hashCode());
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
		Capital other = (Capital) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		return true;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	String capital;
	
}
