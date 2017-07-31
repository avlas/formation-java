package fr.pizzeria.gui;

import fr.pizzeria.console.OptionMenu;
import fr.pizzeria.console.PizzeriaAdminConsoleApp;
import fr.pizzeria.model.Pizza;

/**
 * @author AVL
 *
 */
public class ModifyPizzaOptionMenu extends OptionMenu {

	private Pizza[] pizzas;

	public ModifyPizzaOptionMenu(Pizza[] listPizzas) {
		this.pizzas = listPizzas;
	}

	/**
	 * @Override
	 */
	@Override
	public void execute() {

		System.out.println("\n***** MODIFY PIZZA ***** ");
		PizzeriaAdminConsoleApp.listingPizzas.execute();

		System.out.println("\n***** Please choose pizza's code you want to modify : ***** ");
		String userCode = PizzeriaAdminConsoleApp.input.next();

		for (int i = 0; i < this.pizzas.length - 1; i++) {
			if (this.pizzas[i].getCode().equals(userCode)) {
				System.out.println("Choose a code : ");
				userCode = PizzeriaAdminConsoleApp.input.next();
				this.pizzas[i].setCode(userCode);

				System.out.println("Choose a name (whitout spaces) : ");
				String userName = PizzeriaAdminConsoleApp.input.next();
				this.pizzas[i].setName(userName);

				System.out.println("Choose price : ");
				double userPrice = PizzeriaAdminConsoleApp.input.nextDouble();
				this.pizzas[i].setPrice(userPrice);

				System.out.println("This pizza was modified : " + this.pizzas[i].getCode() + " -> "
						+ this.pizzas[i].getName() + " (" + this.pizzas[i].getPrice() + " €)");
				break;
			}
		}

		System.out.println("\n --------------------------------------------- ");

	}
}
