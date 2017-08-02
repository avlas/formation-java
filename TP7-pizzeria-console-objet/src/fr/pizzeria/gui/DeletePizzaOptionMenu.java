package fr.pizzeria.gui;

import fr.pizzeria.console.PizzeriaAdminConsoleApp;
import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.StorageException;

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
	 * @throws StorageException
	 * @Override
	 */
	@Override
	public void execute() throws StorageException {
		System.out.println("\n***** DELETE PIZZA ***** ");
		System.out.println("****************************** ");

		System.out.println("Choose a CODE : ");
		String userCode = PizzeriaAdminConsoleApp.validator.validateUserCode();
		if (!dao.isExistingPizzaCode(userCode)) {
			throw new DeletePizzaException("\nUnknown CODE = [" + userCode + "]! \nPlease choose one from the list !");
		}

		boolean isDeleted = dao.deletePizza(userCode);
		if (!isDeleted) {
			throw new DeletePizzaException("\nImpossible to delete the pizza having the code = " + userCode);
		}

		System.out.println("\nThe PIZZA [code = " + userCode + "] was deleted ! ");
	}
}
