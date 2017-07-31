package fr.pizzeria.gui;

import fr.pizzeria.console.PizzeriaAdminConsoleApp;
import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

/**
 * @author AVL
 *
 */
public class ModifyPizzaOptionMenu extends OptionMenu {

	private IPizzaDao dao;

	public ModifyPizzaOptionMenu(IPizzaDao dao) {
		this.dao = dao;
	}

	/**
	 * @Override
	 */
	@Override
	public void execute() {

		System.out.println("\n***** MODIFY PIZZA ***** ");
		System.out.println("\n***** Please choose pizza's code you want to modify : ***** ");
		String codeUser = PizzeriaAdminConsoleApp.input.next();
		
	//	Pizza pizza = dao.findPizzaByCode(codeUser);
	//	if (pizza!= null) {
			System.out.println("Choose a code : ");
			String userCode = PizzeriaAdminConsoleApp.input.next();
	//		pizza.setCode(userCode);

			System.out.println("Choose a name (whitout spaces) : ");
			String userName = PizzeriaAdminConsoleApp.input.next();
	//		pizza.setName(userName);

			System.out.println("Choose price : ");
			double userPrice = PizzeriaAdminConsoleApp.input.nextDouble();
	//		pizza.setPrice(userPrice);
			
			dao.updatePizza(codeUser, new Pizza(userCode, userName, userPrice));		
	//	}
		
		System.out.println("\n --------------------------------------------- ");
	}
}
