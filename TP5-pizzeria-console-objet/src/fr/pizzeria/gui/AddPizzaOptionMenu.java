package fr.pizzeria.gui;

import fr.pizzeria.console.PizzeriaAdminConsoleApp;
import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

/**
 * @author AVL
 *
 */
public class AddPizzaOptionMenu extends OptionMenu {

	private IPizzaDao dao;

	public AddPizzaOptionMenu(IPizzaDao dao) {
		this.dao = dao;
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

		Pizza newPizza = new Pizza(userCode, userName, userPrice);
		dao.saveNewPizza(newPizza);

		System.out.println("\n --------------------------------------------- ");

	}
}
