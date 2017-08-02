package fr.pizzeria.exception;

/**
 * @author ali
 *
 */
public class DeletePizzaException extends StorageException {

	/**
	 * serialVersionUID : long 
	 */
	
	private static final long serialVersionUID = -205480846048285884L;

	public DeletePizzaException(String message) {
		super(message);
	}	
}
