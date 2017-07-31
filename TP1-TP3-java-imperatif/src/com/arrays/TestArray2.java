package com.arrays;

/**
 * @author AVL
 *
 */
public class TestArray2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intArray = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// Calculate the average of the array
		calculateArrayAverage(intArray);

		// Retrieve the index of an item
		retrieveItemIndex(intArray, 15);

		// Find the number of duplicate integers in the array
		countDuplicatesOfItem(intArray, 7);
	}

	/**
	 * @param intArray
	 */
	private static void calculateArrayAverage(int[] intArray) {
		float average = 0.0f;

		for (int i = 0; i < intArray.length; i++) {
			average += intArray[i];
		}

		average /= intArray.length;
		System.out.println("The average of the array : " + average + "\n");
	}

	/**
	 * @param intArray
	 * @param item
	 */
	private static void retrieveItemIndex(int[] intArray, int item) {
		int index = 0;

		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == item) {
				index = i;
			}
		}

		System.out.println("The index of the item \"" + item + "\" in the array  : " + index + "\n");
	}

	/**
	 * @param intArray
	 * @param nbToCheck
	 */
	private static void countDuplicatesOfItem(int[] intArray, int nbToCheck) {
		int nbDuplicates = 0;

		for (int i = 0; i < intArray.length; i++) {
			if (nbToCheck == intArray[i]) {
				nbDuplicates++;
			}
		}

		System.out.println("Number of duplicates for the item \"" + nbToCheck + "\" : " + nbDuplicates + "\n");
	}
}
