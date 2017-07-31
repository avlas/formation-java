package com.arrays;

import java.util.Scanner;

/**
 * @author AVL
 *
 */
public class TestArraysLimit {
	private static Scanner inputUser;

	private static int[] intArray = new int[0];

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		do {
			showMenu();

			inputUser = new Scanner(System.in);

			if (inputUser != null) {
				while (!inputUser.hasNextInt()) {
					System.out.println("Please give a number : ");
					inputUser.nextLine();
				}

				int userOption = readUserInput(inputUser);

				switch (userOption) {
					case 1:
						System.out.println("Please give an number : ");
						/* inputUser = new Scanner(System.in); */
						int userNumber = inputUser.nextInt();
	
						intArray = addElementToArray(intArray, userNumber);
						showMenu();
						userOption = readUserInput(inputUser);
						break;
	
					case 2:
						listElements(intArray);
						showMenu();
						userOption = readUserInput(inputUser);
						break;
	
					default:
						System.out.println("Invalid option !");
						break;
				}
			}
		} while (inputUser.hasNextInt());
		inputUser.close();
	}

	public static void showMenu() {
		System.out.println("Please choose an option : ");
		System.out.println("1 - Add a number");
		System.out.println("2 - List existing numbers");
	}

	public static int readUserInput(Scanner inputUser) {
		int userOption = inputUser.nextInt();

		while (userOption <= 0 || userOption > 2) {
			System.out.println("Invalid option. Please give a value between 1 and 2 !!");
			inputUser.nextLine();

			userOption = inputUser.nextInt();
		}
		return userOption;
	}

	/**
	 * @param oldArray
	 * @param valueToAdd
	 */
	public static int[] addElementToArray(int[] oldArray, int valueToAdd) {
		// create a new array with extra index
		int[] newArray = new int[oldArray.length + 1];

		// copy the integers from oldArray to newArray
		for (int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}

		// add the new integer to the last index
		newArray[newArray.length - 1] = valueToAdd;

		return newArray;
	}

	/**
	 * @param intArray
	 */
	public static void listElements(int[] intArray) {
		System.out.print("List of items : ");

		for (int i = 0; i < intArray.length; i++) {
			if (i == intArray.length - 1) {
				System.out.println(intArray[i]);
			} else {
				System.out.print(intArray[i] + ", ");
			}
		}

		System.out.println("\n");
	}
}
