package fr.pizzeria.gui;

import fr.pizzeria.console.PizzeriaAdminConsoleApp;
import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.StorageException;
import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.model.PizzaType;

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
	 * @throws StorageException
	 * @Override
	 */
	@Override
	public void execute() throws StorageException {
		System.out.println("\n***** MODIFY PIZZA ***** ");
		System.out.println("************************ ");
		System.out.println("Choose the CODE to modify : ");

		String oldUserCode = PizzeriaAdminConsoleApp.validator.validateUserCode();
		if (!dao.isExistingPizzaCode(oldUserCode)) {
			throw new UpdatePizzaException(
					"\nUnknown CODE = [" + oldUserCode + "]! \nPlease choose one from the list !");
		}

		Pizza pizzaToUpdate = dao.findPizzaByCode(oldUserCode);
		if (pizzaToUpdate == null) {
			throw new UpdatePizzaException("\n The PIZZA [code = " + oldUserCode + "] not found !");
		}

		System.out.println("Choose a new value for CODE : ");
		String newUserCode = PizzeriaAdminConsoleApp.validator.validateUserCode();

		if (dao.isExistingPizzaCode(newUserCode)) {
			throw new UpdatePizzaException(
					"\nThe CODE [" + newUserCode + "] already exist ! Please choose a different one !");
		}

		String newUserName = PizzeriaAdminConsoleApp.validator.validateUserName();

		double newUserPrice = PizzeriaAdminConsoleApp.validator.validateUserPrice();

		PizzaType userType = PizzeriaAdminConsoleApp.validator.validateUserType();

		pizzaToUpdate.setCode(newUserCode);
		pizzaToUpdate.setName(newUserName);
		pizzaToUpdate.setPrice(newUserPrice);
		pizzaToUpdate.setPizzaType(userType);

		/*
		 * boolean isUpdated = dao.updatePizza(oldUserCode, pizzaToUpdate); if
		 * (!isUpdated) { 
		 * 		throw new UpdatePizzaException("\nImpossible to update the pizza [" + pizzaToUpdate + "] !"); 
		 * }
		 */

		System.out.println("\nThe PIZZA " + oldUserCode + " was modified into [" + pizzaToUpdate + "]   !");
	}
}
