package fr.pizzeria.validator;

import fr.pizzeria.console.PizzeriaAdminConsoleApp;
import fr.pizzeria.exception.StorageException;
import fr.pizzeria.model.PizzaType;

/**
 * @author ali
 *
 */
public class UserEntriesValidator {

	public String validateUserCode() throws StorageException {
		String userCode = PizzeriaAdminConsoleApp.input.next();
		
		if (userCode.trim().length() != 3) {
			throw new StorageException("\nThe CODE [" + userCode + "] must contain 3 letters !");
		}

		if(userCode.startsWith(" ") || userCode.endsWith(" ")) {
			userCode = userCode.trim();
		}
		
		return userCode.toUpperCase();
	}

	public String validateUserName() {
		System.out.println("Choose a NAME (without spaces) : ");
		
		String userName = PizzeriaAdminConsoleApp.input.next();
		
		if(userName.startsWith(" ") || userName.endsWith(" ")) {
			userName = userName.trim();
		}
		
		return userName.toUpperCase();
	}

	public double validateUserPrice() throws StorageException {
		System.out.println("Choose a PRICE : ");

		String userPriceStr = PizzeriaAdminConsoleApp.input.next();

		double userPrice;
		try {
			userPrice = Double.parseDouble(userPriceStr);
		} catch (NumberFormatException nfe) {
			throw new StorageException("\nThe PRICE [" + userPriceStr + "] must be a number !");
		}
		return userPrice;
	}
	
	public PizzaType validateUserType() throws StorageException {
		System.out.println("Choose a TYPE : ");

		String userType = PizzeriaAdminConsoleApp.input.next();

		for(PizzaType type : PizzaType.values()) {
			if(!type.getValue().equalsIgnoreCase(userType)) {
				throw new StorageException("\nThe TYPE must be one of this values : Meat | Fish | Without meat");
			} else {
				return type;
			}
		}

		return null;
	}
}
