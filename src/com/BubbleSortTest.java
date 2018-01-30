package com;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {
	private int[] numbers;
    private final static int SIZE = 7;
    private final static int MAX = 20;
    @Before
    public void setUp() throws Exception {
        numbers = new int[SIZE];
        Random generator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(MAX);
        }
    }
    
    @Test
    public void testNull() {
        SortDemo sorter = new SortDemo();
        sorter.sort(null);
    }
    @Test
    public void testEmpty() {
        Quicksort sorter = new Quicksort();
        sorter.sort(new int[0]);
    }
    @Test
    public void testQuickSort() {
    	SortDemo sorter = new SortDemo();
        sorter.sort(numbers);
        printResult(numbers);
    }
    
    private void printResult(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
    }


}
