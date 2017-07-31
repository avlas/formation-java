package fr.pizzeria.gui;

import fr.pizzeria.console.OptionMenu;
import fr.pizzeria.console.PizzeriaAdminConsoleApp;
import fr.pizzeria.model.Pizza;

/**
 * @author AVL
 *
 */
public class AddPizzaOptionMenu extends OptionMenu {

	static int lastIndex = 0;

	private Pizza[] pizzas;

	public AddPizzaOptionMenu(Pizza[] listPizzas) {
		this.pizzas = listPizzas;
	}

	/**
	 * @Override
	 */
	@Override
	public void execute() {
		System.out.println("\n***** ADD PIZZA ***** ");

		System.out.println("Choose a code : ");
		String userCode = PizzeriaAdminConsoleApp.input.next();

		System.out.println("Choose a name (whitout spaces) : ");
		String userName = PizzeriaAdminConsoleApp.input.next();

		System.out.println("Choose price : ");
		double userPrice = PizzeriaAdminConsoleApp.input.nextDouble();

		for (int i = 0; i < this.pizzas.length; i++) {
			if (this.pizzas[i] != null) {
				lastIndex = this.pizzas[i].getId();
			}
		}

		this.pizzas[lastIndex + 1] = new Pizza(userCode, userName, userPrice);

		System.out.println("This pizza was added : " + this.pizzas[lastIndex + 1].getCode() + " -> "
				+ this.pizzas[lastIndex + 1].getName() + " (" + this.pizzas[lastIndex + 1].getPrice() + " €)");

		System.out.println("\n --------------------------------------------- ");

	}
}
