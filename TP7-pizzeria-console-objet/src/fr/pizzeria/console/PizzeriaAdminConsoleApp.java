/** 
*	@author avlas
*/
package fr.pizzeria.console;

import java.util.InputMismatchException;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaDaoMemoryArrayListImpl;
import fr.pizzeria.exception.StorageException;
import fr.pizzeria.gui.DeletePizzaOptionMenu;
import fr.pizzeria.gui.ListAllPizzasOptionMenu;
import fr.pizzeria.gui.AddPizzaOptionMenu;
import fr.pizzeria.gui.UpdatePizzaOptionMenu;
import fr.pizzeria.validator.UserEntriesValidator;

public class PizzeriaAdminConsoleApp {

	static ListAllPizzasOptionMenu listPizzas;

	// Initialise the scanner who will ask questions to the user
	public static Scanner input = new Scanner(System.in);
	
	// Initialise the validator who will check the user entries
	public static UserEntriesValidator validator = new UserEntriesValidator();

	public static void main(String[] args) {

		int userOption = 0;

		IPizzaDao dao = new PizzaDaoMemoryArrayListImpl();

		do {
			showMenu();
			try {
				userOption = input.nextInt();

				switch (userOption) {
					case 1:
						listPizzas = new ListAllPizzasOptionMenu(dao);
						listPizzas.execute();
						break;
	
					case 2:
						AddPizzaOptionMenu addPizza = new AddPizzaOptionMenu(dao);
						addPizza.execute();
						break;
	
					case 3:
						listPizzas = new ListAllPizzasOptionMenu(dao);
						listPizzas.execute();
	
						UpdatePizzaOptionMenu updatePizza = new UpdatePizzaOptionMenu(dao);
						updatePizza.execute();
						break;
	
					case 4:
						listPizzas = new ListAllPizzasOptionMenu(dao);
						listPizzas.execute();

					DeletePizzaOptionMenu deletePizza = new DeletePizzaOptionMenu(dao);
					deletePizza.execute();
					break;

				case 99:
					System.out.println("Bye ☺ !!! ");
					input.close();
					break;

				default:
					System.out.println("Invalid option !");
					break;
				}
			} catch (StorageException se) {
				System.out.println(se.getMessage());

			} catch (InputMismatchException ime) {
				System.out.println("Invalid option !");
			}
		} while (userOption != 99);
	}

	public static void showMenu() {
		System.out.println("\n****************************************** ");
		System.out.println("*****   Pizzeria Administration  ********* ");
		System.out.println("****************************************** ");
		
		System.out.println("1. List all pizzas");
		System.out.println("2. Add new pizza");
		System.out.println("3. Modify a pizza");
		System.out.println("4. Delete a pizza");
		System.out.println("99. Exit");
	}
}
