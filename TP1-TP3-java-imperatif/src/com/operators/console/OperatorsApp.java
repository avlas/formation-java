/**
 * @author AVL
 *
 */
package com.operators.console;

import java.util.Scanner;

public class OperatorsApp {
	private static Scanner userInput;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("***** Application Operators ***** \nPlease enter the first number : ");
		
		userInput = new Scanner(System.in);

		if (userInput != null) {			
			int firstNumber = userInput.nextInt();

			System.out.print("Please enter the second number : ");
			int secondNumber = userInput.nextInt();

			System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
			System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
			System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
			System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
			System.out.println(firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber));

			userInput.close();
		}
	}
}
