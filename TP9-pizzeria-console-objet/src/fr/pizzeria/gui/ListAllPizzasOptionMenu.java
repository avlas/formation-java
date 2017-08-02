package fr.pizzeria.gui;

import java.util.List;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

/**
 * @author AVL
 *
 */
public class ListAllPizzasOptionMenu extends OptionMenu {

	private IPizzaDao dao;

	public ListAllPizzasOptionMenu(IPizzaDao dao) {
		this.dao = dao;
	}

	/**
	 * @Override
	 */
	@Override
	public void execute() {
		System.out.println("\n***** LIST ALL PIZZAS : ***** ");
		System.out.println("***************************** ");

		System.out.println("\nID : CODE -> NAME (PRICE) - TYPE");
		System.out.println("-------------------------");

		List<Pizza> pizzas = dao.findAllPizzas();
		if (pizzas.isEmpty()) {
			System.out.println("NO PIZZAS FOUND !!");
		}

		for (Pizza pizza : pizzas) {
			System.out.println(pizza);
		}
	}
}
