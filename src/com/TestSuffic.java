package com;

public class TestSuffic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "babu,rameshsekhartbabu,rahulbabu,dsfdbbabu,kotibabu,babu", suffix = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			if (((str.length() - str.replaceAll(str.charAt(i) + suffix + ",",
					",").length()) / ((str.charAt(i) + suffix + ",").length() - 1)) != 0) {
				suffix = str.charAt(i) + suffix;
			} else {
				break;
			}

		}
		System.out.println(suffix);

	}

}
