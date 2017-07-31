package fr.pizzeria.gui;

import fr.pizzeria.console.OptionMenu;
import fr.pizzeria.model.Pizza;

/**
 * @author AVL
 *
 */
public class ListAllPizzasOptionMenu extends OptionMenu {

	private Pizza[] pizzas;

	public ListAllPizzasOptionMenu(Pizza[] listPizzas) {
		this.pizzas = listPizzas;
	}

	/**
	 * @Override
	 */
	@Override
	public void execute() {
		System.out.println("\n***** LIST ALL PIZZAS : ***** ");

		for (int i = 0; i < this.pizzas.length - 1; i++) {
			if (this.pizzas[i] != null) {
				System.out.println(this.pizzas[i].getCode() + " -> " + this.pizzas[i].getName() + " ("
						+ this.pizzas[i].getPrice() + " €)");
			}
		}

		System.out.println("\n --------------------------------------------- ");
	};
}
