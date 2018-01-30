package com;

public class EnumTest {

	public enum Company {
		EBAY, PAYPAL, GOOGLE, YAHOO, ATT
	}

	Company cName;

	public EnumTest(Company cName) {
		this.cName = cName;
	}

	public void companyDetails() {
		switch (cName) {
		case EBAY:
			System.out.println("Biggest Market Place in the World.");
			break;
		case PAYPAL:
			System.out.println("Simplest way to manage Money.");
			break;
		case GOOGLE:
		case YAHOO:
			System.out.println("1st Web 2.0 Company.");
			break;
		default:
			System.out
					.println("Google - biggest search giant.. ATT - my carrier provider..");
			break;
		}
	}

	public static void main(String[] args) {
		EnumTest ebay = new EnumTest(Company.valueOf("EBAY"));
		ebay.companyDetails();
		EnumTest paypal = new EnumTest(Company.PAYPAL);
		paypal.companyDetails();
		EnumTest google = new EnumTest(Company.GOOGLE);
		google.companyDetails();
		EnumTest yahoo = new EnumTest(Company.YAHOO);
		yahoo.companyDetails();
		EnumTest att = new EnumTest(Company.ATT);
		att.companyDetails();
	}

}
