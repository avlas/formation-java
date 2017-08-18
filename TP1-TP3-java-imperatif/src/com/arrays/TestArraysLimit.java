package com.arrays;

import java.util.Scanner;

/**
 * Application of array's operations -> add / list
 * 
 * @author AVL
 */
public class TestArraysLimit {
	private static Scanner scanner = new Scanner(System.in);
	private static int[] intArray = new int[0];

	/**
	 * The entry-point of the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		do {
			showMenu();

			if (scanner != null) {
//				while (!userInput.hasNextInt()) {
//					System.out.println("Please give a number : ");
//					userInput.nextLine();
//				}

				int userOption = readAndValidateUserInput(scanner);

				switch (userOption) {
				case 1:
					System.out.println("Please give an number : ");
					
					int userNumber = scanner.nextInt();
					
					intArray = addElementToArray(intArray, userNumber);

					showMenu();
					userOption = readAndValidateUserInput(scanner);
					break;

				case 2:
					listElements(intArray);

					showMenu();
					userOption = readAndValidateUserInput(scanner);
					break;

				default:
					System.out.println("Invalid option ! Please give a value between 1 and 2 !!");
					break;
				}
			}
		} while (scanner.hasNextInt());

		scanner.close();
	}

	/**
	 * Show the menu to the user
	 */
	public static void showMenu() {
		System.out.println("\nPlease choose an option : ");
		System.out.println("1 - Add a number");
		System.out.println("2 - List existing numbers");
	}

	/**
	 * Reads the user input and checks if it's a valid option
	 * 
	 * @param scanner
	 *            scanner used to read the user's input
	 * @return int
	 */
	public static int readAndValidateUserInput(Scanner scanner) {
		int userOption = scanner.nextInt();

		while (userOption <= 0 || userOption > 2) {
			System.out.println("Invalid option ! Please give a value between 1 and 2 !! \n");
			scanner.nextLine();
			
			userOption = scanner.nextInt();
		}
		return userOption;
	}

	/**
	 * Add the user input to the array
	 * 
	 * @param oldArray
	 *            the array before adding a new value
	 * @param numberToAdd
	 *            the number to add into array
	 * @return int[] the array, after adding a value
	 */
	public static int[] addElementToArray(int[] oldArray, int numberToAdd) {
		// Create a new array with extra index
		int[] newArray = new int[oldArray.length + 1];

		// Copy the integers from oldArray to newArray
		for (int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}

		// Add the new integer to the last index
		newArray[newArray.length - 1] = numberToAdd;

		System.out.println("The number " + numberToAdd + " was successfully added!! \n");
		
		return newArray;
	}

	/**
	 * List all elements of the array
	 * 
	 * @param intArray
	 */
	public static void listElements(int[] intArray) {
		if (intArray.length <= 0) {
			System.out.print("The list is empty! Please insert numbers !!");
		} else {
			System.out.print("\nList of items : ");

			for (int i = 0; i < intArray.length; i++) {
				if (i == intArray.length - 1) {
					System.out.println(intArray[i]);
				} else {
					System.out.print(intArray[i] + ", ");
				}
			}
		}
		System.out.println("\n");
	}
}
