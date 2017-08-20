package fr.pizzeria.gui;

import fr.pizzeria.console.PizzeriaAdminConsoleApp;
import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.StorageException;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.model.PizzaType;

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
	 * @throws StorageException
	 * @Override
	 */
	@Override
	public void execute() throws StorageException {
		System.out.println("\n*******   ADD PIZZA  ********* ");
		System.out.println("****************************** ");

		System.out.println("Choose a CODE : ");
		String userCode = PizzeriaAdminConsoleApp.validator.validateUserCode();
		if (dao.isExistingPizzaCode(userCode)) {
			throw new SavePizzaException("\nThe CODE [" + userCode + "] already exist !");
		}

		String userName = PizzeriaAdminConsoleApp.validator.validateUserName();
		double userPrice = PizzeriaAdminConsoleApp.validator.validateUserPrice();
		PizzaType userType = PizzeriaAdminConsoleApp.validator.validateUserType();

		Pizza pizzaToSave = new Pizza(userCode, userName, userPrice, userType);

		boolean isSaved = dao.savePizza(pizzaToSave);
		if (!isSaved) {
			throw new SavePizzaException("\nImpossible to save the pizza [" + pizzaToSave + "] !");
		}

		System.out.println("\nNew PIZZA was saved : [" + pizzaToSave + "] ");
	}
}
