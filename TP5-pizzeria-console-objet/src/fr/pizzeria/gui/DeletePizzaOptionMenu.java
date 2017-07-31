package fr.pizzeria.gui;

import fr.pizzeria.console.OptionMenu;
import fr.pizzeria.console.PizzeriaAdminConsoleApp;
import fr.pizzeria.model.Pizza;

/**
 * @author AVL
 *
 */
public class DeletePizzaOptionMenu extends OptionMenu {

	private Pizza[] pizzas;

	public DeletePizzaOptionMenu(Pizza[] listPizzas) {
		this.pizzas = listPizzas;
	}

	/**
	 * @Override
	 */
	@Override
	public void execute() {
		System.out.println("\n***** DELETE PIZZA ***** ");

		PizzeriaAdminConsoleApp.listingPizzas.execute();

		System.out.println("\n***** Please choose pizza's code you want to delete : ***** ");
		String userCode = PizzeriaAdminConsoleApp.input.next();

		for (int i = 0; i < this.pizzas.length - 1; i++) {
			if (this.pizzas[i].getCode().equals(userCode)) {
				this.pizzas[i] = null;
				break;
			}
		}

		System.out.println("\n --------------------------------------------- ");
	}
}
