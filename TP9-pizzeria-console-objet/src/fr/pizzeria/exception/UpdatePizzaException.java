package fr.pizzeria.exception;

/**
 * @author ali
 *
 */
public class UpdatePizzaException extends StorageException {

	/**
	 * serialVersionUID : long 
	 */	
	private static final long serialVersionUID = 8702769028656955569L;

	/**
	 * @param message
	 */
	public UpdatePizzaException(String message) {
		super(message);
	}

}
