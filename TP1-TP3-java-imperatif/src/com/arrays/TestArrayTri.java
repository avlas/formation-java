package com.arrays;

import java.util.Arrays;

/**
 * @author AVL
 *
 */
public class TestArrayTri {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intArray = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// Ascending sort of the array - imperative way
		sortArray(intArray);

		// Ascending sort of the array - using objects
		sortArrayUsingObjects(intArray);

	}

	/**
	 * @param unsortedArray
	 */
	public static void sortArray(int[] unsortedArray) {
		int[] sortedArray = new int[unsortedArray.length];
		int temp;

		for (int i = 0; i < unsortedArray.length - 1; i++) {
			for (int j = i + 1; j < unsortedArray.length; j++) {
				if (unsortedArray[i] > unsortedArray[j]) {
					temp = unsortedArray[i];
					unsortedArray[i] = unsortedArray[j];
					unsortedArray[j] = temp;
					sortedArray = unsortedArray;
				}
			}
		}

		System.out.print("Ascending sort of the array - imperative way : ");

		for (int i = 0; i < sortedArray.length; i++) {
			if (i != sortedArray.length - 1) {
				System.out.print(sortedArray[i] + ", ");
			} else {
				System.out.print(sortedArray[i]);
			}
		}
		System.out.println("\n");
	}

	/**
	 * @param unsortedArray
	 */
	public static void sortArrayUsingObjects(int[] unsortedArray) {
		Arrays.sort(unsortedArray);
		System.out.println("Ascending sort of the table - using objects : " + Arrays.toString(unsortedArray));
	}

}
