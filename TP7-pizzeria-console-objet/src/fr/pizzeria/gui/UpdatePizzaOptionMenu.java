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
		System.out.println("\nChoose pizza's code you want to modify : ");
		String userCodeToUpdate = PizzeriaAdminConsoleApp.input.next().trim().toUpperCase();

		if (dao.isExistingPizzaCode(userCodeToUpdate)) {
			Pizza pizzaToUpdate = dao.findPizzaByCode(userCodeToUpdate);

			if (pizzaToUpdate != null) {
				System.out.println("Choose a code : ");
				String newUserCode = PizzeriaAdminConsoleApp.input.next().trim().toUpperCase();

				if (dao.isExistingPizzaCode(newUserCode)) {
					System.out.println("THIS CODE ALREADY EXIST - Choose a different one !!");
				} else {
					pizzaToUpdate.setCode(newUserCode);

					System.out.println("Choose a name (whitout spaces) : ");
					String newUserName = PizzeriaAdminConsoleApp.input.next().trim().toUpperCase();
					pizzaToUpdate.setName(newUserName);

					System.out.println("Choose price : ");
					String newUserPriceStr = PizzeriaAdminConsoleApp.input.next().trim();

					if (!newUserPriceStr.isEmpty()) {
						double newUserPrice = Double.parseDouble(newUserPriceStr);
						pizzaToUpdate.setPrice(newUserPrice);

						System.out.println("MODIFIED PIZZA : " + pizzaToUpdate.getCode() + " -> "
								+ pizzaToUpdate.getName() + " (" + pizzaToUpdate.getPrice() + " \u20AC)");
					}
					// dao.updatePizza(userCodeToUpdate, new Pizza(newUserCode, newUserName, newUserPrice));
				}
			}
		} else {
			System.out.println("PIZZA NOT FOUND !!");
		}

		System.out.println("\n --------------------------------------------- ");
	}
}
