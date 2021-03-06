/** 
*	@author avlas
*/
package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaDaoMemoryImpl;
import fr.pizzeria.gui.AddPizzaOptionMenu;
import fr.pizzeria.gui.DeletePizzaOptionMenu;
import fr.pizzeria.gui.ListAllPizzasOptionMenu;
import fr.pizzeria.gui.ModifyPizzaOptionMenu;

public class PizzeriaAdminConsoleApp {

	public static ListAllPizzasOptionMenu listingPizzas;

	// Initialise the scanner who will ask questions to the user
	public static Scanner input = new Scanner(System.in);

	static int userOption = 0;

	public static void main(String[] args) {
		
		IPizzaDao dao = new PizzaDaoMemoryImpl();

		do {
			showMenu();

			userOption = input.nextInt();

			switch (userOption) {
				case 1:
					listingPizzas = new ListAllPizzasOptionMenu(dao);
					listingPizzas.execute();
					break;
	
				case 2:
					AddPizzaOptionMenu addingPizza = new AddPizzaOptionMenu(dao);
					addingPizza.execute();
					break;
	
				case 3:
					listingPizzas.execute();
	
					ModifyPizzaOptionMenu modifingPizza = new ModifyPizzaOptionMenu(dao);
					modifingPizza.execute();
					break;
	
				case 4:
					listingPizzas.execute();
	
					DeletePizzaOptionMenu deletingPizza = new DeletePizzaOptionMenu(dao);
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
