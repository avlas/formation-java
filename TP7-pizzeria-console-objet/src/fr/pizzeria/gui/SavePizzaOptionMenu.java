package fr.pizzeria.gui;

import fr.pizzeria.console.PizzeriaAdminConsoleApp;
import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

/**
 * @author AVL
 *
 */
public class SavePizzaOptionMenu extends OptionMenu {

	private IPizzaDao dao;

	public SavePizzaOptionMenu(IPizzaDao dao) {
		this.dao = dao;
	}

	/**
	 * @Override
	 */
	@Override
	public void execute() {
		System.out.println("\n***** ADD PIZZA ***** ");

		System.out.println("Choose a code : ");
		String userCode = PizzeriaAdminConsoleApp.input.next().trim().toUpperCase();

		if (dao.isExistingPizzaCode(userCode)) {
			System.out.println("THIS CODE ALREADY EXIST - Choose a different one !!");
		} else {
			System.out.println("Choose a name (whitout spaces) : ");
			String userName = PizzeriaAdminConsoleApp.input.next().trim().toUpperCase();

			System.out.println("Choose price : ");
			String userPriceStr = PizzeriaAdminConsoleApp.input.next().trim();
			
			if(!userPriceStr.isEmpty()){
				double userPrice = Double.parseDouble(userPriceStr);	
				Pizza pizza = new Pizza(userCode, userName, userPrice);
				dao.savePizza(pizza);
				
				System.out.println("NEW PIZZA ADDED : " + pizza.getId() + " - "+ pizza.getCode() + " -> " + pizza.getName() + " (" + pizza.getPrice() + " \u20AC)");
			}
		}

		System.out.println("\n --------------------------------------------- ");
	}
}
