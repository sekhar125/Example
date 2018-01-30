package com;

public enum Color {
	RED("red"), GREEN("green"), BLUE("blue");

	Color(String color){
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Color arr[] = Color.BLUE.values();
		 
        // enum with loop
        for (Color col : arr)
        {
            // Calling ordinal() to find index
            // of color.
            System.out.println(col + " at index "
                             + col.ordinal());
        }
        System.out.println();
	}

}
