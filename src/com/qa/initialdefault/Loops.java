package com.qa.initialdefault;
import java.util.Arrays;


public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test1[] = {1, 2, 3} ;
//		arrayMethod(int test1[] = {1, 2, 3});
//		arrayMethod({1, 2, 3, 4, 5});
//		arrayMethod(int[] = {1, 2, 3})
//		arrayMethod(int[3, 4, 5]);
//		arrayMethod(test1);
//		arrayMethod(int[1, 2, 3]);

	}

	public static int[] arrayMethod(int array[]) {
		int defaultInt[] = array;
		System.out.println("Returned " + defaultInt + " " + 7);
		System.out.println(array[1]);
		
		System.out.println(Arrays.toString(array));

		return defaultInt;
	}
}
