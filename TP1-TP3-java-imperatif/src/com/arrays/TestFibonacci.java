package com.arrays;

import java.util.Scanner;

/**
 * Fibonacci - recursive way
 * @author AVL
 *
 */
public class TestFibonacci {

	private static Scanner inputUser = new Scanner(System.in);;

	/**
	 * * The entry-point of the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please give a limit for Fibonacci serie :");

		while (!inputUser.hasNextInt()) {
			System.out.println("Please give a number : ");
			inputUser.nextLine();
		}

		int userLimit = inputUser.nextInt();

		while (userLimit < 0) {
			System.out.println("Please give a positive integer : ");
			inputUser.nextLine();

			userLimit = inputUser.nextInt();
		}

		recursiveFibonacci(userLimit);
	}

	/**
	 * Fibonacci - recursive 
	 * 
	 * @param userLimit the limit given by the user
	 */
	private static void recursiveFibonacci(int userLimit) {
		int index = 1;

		System.out.println("Recursive Fibonacci : ");
		while (index <= userLimit) {
			System.out.print(fibonacci(index) + " ");
			index++;
		}
		System.out.println("\n");
	}
	
	/**
	 * Fibonacci  
	 * 
	 * @param i the index
	 */
	private static int fibonacci(int i) {
		if (i <= 2) {
			return 1;
		}
		return fibonacci(i - 1) + fibonacci(i - 2);
	}

}
