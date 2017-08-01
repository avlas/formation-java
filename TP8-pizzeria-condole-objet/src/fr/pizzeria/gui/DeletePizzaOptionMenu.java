package fr.pizzeria.gui;

import fr.pizzeria.console.PizzeriaAdminConsoleApp;
import fr.pizzeria.dao.IPizzaDao;

/**
 * @author AVL
 *
 */
public class DeletePizzaOptionMenu extends OptionMenu {

	private IPizzaDao dao;

	public DeletePizzaOptionMenu(IPizzaDao dao) {
		this.dao = dao;
	}

	/**
	 * @Override
	 */
	@Override
	public void execute() {
		System.out.println("\n***** DELETE PIZZA ***** ");

		System.out.println("\nChoose pizza's code you want to delete : ");

		dao.deletePizza(PizzeriaAdminConsoleApp.input.next().trim().toUpperCase());

		System.out.println("\n --------------------------------------------- ");
	}
}
