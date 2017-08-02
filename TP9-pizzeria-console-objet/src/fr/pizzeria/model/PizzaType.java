package fr.pizzeria.model;

/**
 * @author ali
 *
 */
public enum PizzaType {
	MEAT("Meat"), 
	FISH("Fish"), 
	WITHOUT_MEAT("Without meat");

	private String value;

	private PizzaType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}	
}
