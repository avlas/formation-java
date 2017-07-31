package com.arrays;

/**
 * @author AVL
 *
 */
public class TestArray1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intArray = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// List all items of the array
		listAllItems(intArray);

		// List all items in reverse order of the array
		listReversedItems(intArray);

		// List only the items greater than 3
		listItemsGreaterThan3(intArray);

		// List only even items
		listEvenItems(intArray);

		// List the maximum of the array
		showMaximum(intArray);

		// List the minimum of the array
		showMinimum(intArray);
	}

	/**
	 * @param intArray
	 */
	private static void listAllItems(int[] intArray) {
		System.out.print("All items of the array, using a loop : ");

		for (int i = 0; i < intArray.length; i++) {
			if (i != intArray.length - 1) {
				System.out.print(intArray[i] + ", ");
			} else {
				System.out.print(intArray[i]);
			}
		}

		System.out.println("\n");
	}

	/**
	 * @param intArray
	 */
	private static void listReversedItems(int[] intArray) {
		System.out.print("Items of the array, in reverse order : ");

		for (int i = intArray.length - 1; i >= 0; i--) {
			if (i != 0) {
				System.out.print(intArray[i] + ", ");
			} else {
				System.out.print(intArray[i]);
			}
		}

		System.out.println("\n");
	}

	/**
	 * @param intArray
	 */
	private static void listItemsGreaterThan3(int[] intArray) {
		System.out.print("Items greater than \"3\" : ");

		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > 3) {
				if (i != intArray.length-2) {
					System.out.print(intArray[i] + ", ");
				} else {
					System.out.print(intArray[i]);
				}
			}
		}

		System.out.println("\n");
	}

	/**
	 * @param intArray
	 */
	private static void listEvenItems(int[] intArray) {
		System.out.print("Even items : ");

		for (int i = 0; i < intArray.length; i++) {
			if ((intArray[i] % 2) == 0) {
				if (i != intArray.length - 1) {
					System.out.print(intArray[i] + ", ");
				} else {
					System.out.print(intArray[i]);
				}
			}
		}

		System.out.println("\n");
	}

	/**
	 * @param intArray
	 */
	private static void showMaximum(int[] intArray) {
		int max = 0;

		for (int i = 0; i < intArray.length; i++) {
			if (max < intArray[i]) {
				max = intArray[i];
			}
		}

		System.out.println("Biggest item of the array : " + max + "\n");
	}

	/**
	 * @param intArray
	 */
	private static void showMinimum(int[] intArray) {
		int min = intArray[0];

		for (int i = 1; i < intArray.length; i++) {
			if (intArray[i] < min) {
				min = intArray[i];
			}
		}

		System.out.println("Smallest item of the array : " + min + "\n");
	}
}
