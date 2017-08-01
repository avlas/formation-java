package fr.pizzeria.gui;

import fr.pizzeria.console.PizzeriaAdminConsoleApp;
import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

/**
 * @author AVL
 *
 */
public class UpdatePizzaOptionMenu extends OptionMenu {

	private IPizzaDao dao;

	public UpdatePizzaOptionMenu(IPizzaDao dao) {
		this.dao = dao;
	}

	/**
	 * @Override
	 */
	@Override
	public void execute() {

		System.out.println("\n***** MODIFY PIZZA ***** ");
		System.out.println("\n***** Please choose pizza's code you want to modify : ***** ");
		String userCodeToUpdate = PizzeriaAdminConsoleApp.input.next().trim();
		
		Pizza pizzaToUpdate = dao.findPizzaByCode(userCodeToUpdate);
		if (pizzaToUpdate != null) {
			System.out.println("Choose a code : ");
			String newUserCode = PizzeriaAdminConsoleApp.input.next().trim();
			pizzaToUpdate.setCode(newUserCode);

			System.out.println("Choose a name (whitout spaces) : ");
			String newUserName = PizzeriaAdminConsoleApp.input.next().trim();
			pizzaToUpdate.setName(newUserName);

			System.out.println("Choose price : ");
			double newUserPrice = PizzeriaAdminConsoleApp.input.nextDouble();
			pizzaToUpdate.setPrice(newUserPrice);
			
			System.out.println("This pizza was modified : " + pizzaToUpdate.getCode() + " -> " + pizzaToUpdate.getName()
			+ " (" + pizzaToUpdate.getPrice() + " \u20AC)");
			
	//		dao.updatePizza(userCodeToUpdate, new Pizza(newUserCode, newUserName, newUserPrice));		
		} else {
			System.out.println("Pizza not found !!");
		}
		
		System.out.println("\n --------------------------------------------- ");
	}
}
