package fr.pizzeria.exception;

/**
 * @author ali
 *
 */
public class SavePizzaException extends StorageException {

	/**
	 * serialVersionUID : long 
	 */	
	private static final long serialVersionUID = -2346475209618282430L;

	/**
	 * @param message
	 */
	public SavePizzaException(String message) {
		super(message);
	}

}
