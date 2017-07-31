/**
 * @author AVL
 *
 */
package com.operateurs.console;

import java.util.Scanner;

public class OperateursApp {
	private static Scanner inputUser;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		inputUser = new Scanner(System.in);

		if (inputUser != null) {
			System.out.print("***** Application Operateurs ***** \nPlease enter the first number : ");
			int firstNumber = inputUser.nextInt();

			System.out.print("Please enter the second number : ");
			int secondNumber = inputUser.nextInt();

			System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
			System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
			System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
			System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
			System.out.println(firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber));

			inputUser.close();
		}
	}
}
