/** 
*	@author avlas
*/
package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {
	static Pizza[] listPizzas = null;

	// Initialise the scanner who will ask questions to the user
	static Scanner input = new Scanner(System.in);

	static int userOption = 0;

	static String userCode;
	static String userName;
	static double userPrice;

	static int lastIndex = 0;

	public static void main(String[] args) {

		// Initialise an array of 50 pizzas
		initPizzas();

		do {
			// Show the Menu
			showMenu();

			userOption = input.nextInt();

			switch (userOption) {
				case 1:
					listAllPizzas();
					break;
				case 2:
					addPizza();
					break;
				case 3:
					modifyPizza();
					break;
				case 4:
					deletePizza();
					break;
				case 99:
					System.out.println("Bye ☺ !!! ");
					input.close();
					break;
				default:
					System.out.println("Invalid option !");
					break;
			}
		} while (userOption != 99);
	}

	public static Pizza[] initPizzas() {
		listPizzas = new Pizza[50];
		listPizzas[0] = new Pizza("PEP", "Pépéroni", 12.50);
		listPizzas[1] = new Pizza("MAR", "Margherita", 14.00);
		listPizzas[2] = new Pizza("REIN", "La Reine", 11.50);
		listPizzas[3] = new Pizza("FRO", "La 4 fromages", 12.00);
		listPizzas[4] = new Pizza("CAN", "La cannibale", 12.50);
		listPizzas[5] = new Pizza("SAV", "La savoyarde", 13.00);
		listPizzas[6] = new Pizza("ORI", "L’orientale", 13.50);
		listPizzas[7] = new Pizza("IND", "L’indienne", 14.00);
		return listPizzas;
	}

	public static void showMenu() {
		System.out.println("***** Pizzeria Administration *****");
		System.out.println("1. List all pizzas");
		System.out.println("2. Add new pizza");
		System.out.println("3. Modify a pizza");
		System.out.println("4. Delete a pizza");
		System.out.println("99. Exit");

		System.out.println("\nPlease choose an option : ");
	}

	public static void listAllPizzas() {
		System.out.println("\n***** LIST ALL PIZZAS : ***** ");

		for (int i = 0; i < listPizzas.length - 1; i++) {
			if (listPizzas[i] != null) {
				System.out.println(listPizzas[i].getCode() + " -> " + listPizzas[i].getName() + " ("
						+ listPizzas[i].getPrice() + " €)");
			}
		}
		System.out.println("\n --------------------------------------------- ");
	}

	public static void addPizza() {
		System.out.println("\n***** ADD PIZZA ***** ");

		System.out.println("Choose a code : ");
		userCode = input.next();

		System.out.println("Choose a name (whitout spaces) : ");
		userName = input.next();

		System.out.println("Choose price : ");
		userPrice = input.nextDouble();

		for (int i = 0; i < listPizzas.length; i++) {
			if (listPizzas[i] != null) {
				lastIndex = listPizzas[i].getId();
			}
		}

		listPizzas[lastIndex + 1] = new Pizza(userCode, userName, userPrice);

		System.out.println(listPizzas[lastIndex + 1].getCode() + " -> " + listPizzas[lastIndex + 1].getName() + " ("
				+ listPizzas[lastIndex + 1].getPrice() + " €)");
		System.out.println("\n --------------------------------------------- ");
	}

	public static void modifyPizza() {
		System.out.println("\n***** MODIFY PIZZA ***** ");
		listAllPizzas();

		System.out.println("\n***** Please choose pizza's code you want to modify : ***** ");
		userCode = input.next();

		for (int i = 0; i < listPizzas.length - 1; i++) {
			if (listPizzas[i].getCode().equals(userCode)) {
				System.out.println("Choose a code : ");
				userCode = input.next();
				listPizzas[i].setCode(userCode);

				System.out.println("Choose a name (whitout spaces) : ");
				userName = input.next();
				listPizzas[i].setName(userName);

				System.out.println("Choose price : ");
				userPrice = input.nextDouble();
				listPizzas[i].setPrice(userPrice);

				System.out.println(listPizzas[i].getCode() + " -> " + listPizzas[i].getName() + " ("
						+ listPizzas[i].getPrice() + " €)");
				break;
			}
		}

		System.out.println("\n --------------------------------------------- ");
	}

	public static void deletePizza() {
		System.out.println("\n***** DELETE PIZZA ***** ");
		listAllPizzas();

		System.out.println("\n***** Please choose pizza's code you want to delete : ***** ");
		userCode = input.next();

		for (int i = 0; i < listPizzas.length - 1; i++) {
			if (listPizzas[i].getCode().equals(userCode)) {
				listPizzas[i] = null;
				break;
			}
		}

		System.out.println("\n --------------------------------------------- ");
	}
}
