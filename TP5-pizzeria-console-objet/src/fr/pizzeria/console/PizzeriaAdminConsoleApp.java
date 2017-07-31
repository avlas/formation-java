/** 
*	@author avlas
*/
package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.gui.AddPizzaOptionMenu;
import fr.pizzeria.gui.DeletePizzaOptionMenu;
import fr.pizzeria.gui.ListAllPizzasOptionMenu;
import fr.pizzeria.gui.ModifyPizzaOptionMenu;
import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {
	public static ListAllPizzasOptionMenu listingPizzas;

	// Initialise the scanner who will ask questions to the user
	public static Scanner input = new Scanner(System.in);

	public static Pizza[] listPizzas = null;

	static int userOption = 0;

	public static void main(String[] args) {

		initPizzas();

		do {
			showMenu();

			userOption = input.nextInt();

			switch (userOption) {
				case 1:
					listingPizzas = new ListAllPizzasOptionMenu(listPizzas);
					listingPizzas.execute();
					break;
				case 2:
					AddPizzaOptionMenu addingPizza = new AddPizzaOptionMenu(listPizzas);
					addingPizza.execute();
					break;
				case 3:
					ModifyPizzaOptionMenu modifingPizza = new ModifyPizzaOptionMenu(listPizzas);
					modifingPizza.execute();
					break;
				case 4:
					DeletePizzaOptionMenu deletingPizza = new DeletePizzaOptionMenu(listPizzas);
					deletingPizza.execute();
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

}
