package com;

public class StringInternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			/**
			 * @param args
			 */
				// TODO Auto-generated method stub
				// S1 refers to Object in the Heap Area
		String s1 = "Test";
        String s2 = "Test";
        String s3 = new String("Test");
        final String s4 = s3.intern();
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
             

	}

}
