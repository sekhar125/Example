package com;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList(
				Arrays.asList(1, 2, 3, 4, 5));

		
		for (int i : numbers) {
			System.out.println(i);
			// sleep a little to let other thread finish adding an element
			// before iteration is complete
		}


	}

}
