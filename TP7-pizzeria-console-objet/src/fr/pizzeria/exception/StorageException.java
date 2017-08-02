package fr.pizzeria.exception;

/**
 * @author ali
 *
 */
public class StorageException extends Exception {

	/**
	 * serialVersionUID : long
	 */

	private static final long serialVersionUID = 4951164905972859720L;

	/**
	 * @param message
	 */
	public StorageException(String message) {
		super(message);
	}
}
