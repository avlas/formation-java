package fr.pizzeria.gui;

import fr.pizzeria.dao.IPizzaDao;

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
		System.out.println("\nID - CODE -> NAME (PRICE)");
		System.out.println("-------------------------");
		dao.findAllPizzas();

		System.out.println("\n --------------------------------------------- ");
		
	}
}
