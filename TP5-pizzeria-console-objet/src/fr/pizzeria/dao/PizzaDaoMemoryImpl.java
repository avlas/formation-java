/**
 * 
 */
package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

/**
 * @author ali
 *
 */
public class PizzaDaoMemoryImpl implements IPizzaDao {

	private static int lastIndex = 0;

	private Pizza[] pizzas;

	public PizzaDaoMemoryImpl() {
		pizzas = new Pizza[50];

		pizzas[0] = new Pizza("PEP", "Pépéroni", 12.50);
		pizzas[1] = new Pizza("MAR", "Margherita", 14.00);
		pizzas[2] = new Pizza("REIN", "La Reine", 11.50);
		pizzas[3] = new Pizza("FRO", "La 4 fromages", 12.00);
		pizzas[4] = new Pizza("CAN", "La cannibale", 12.50);
		pizzas[5] = new Pizza("SAV", "La savoyarde", 13.00);
		pizzas[6] = new Pizza("ORI", "L'orientale", 13.50);
		pizzas[7] = new Pizza("IND", "L'indienne", 14.00);
	}

	@Override
	public Pizza[] findAllPizzas() {
		for (int i = 0; i < pizzas.length - 1; i++) {
			if (pizzas[i] != null) {
				System.out.println(
						pizzas[i].getCode() + " -> " + pizzas[i].getName() + " (" + pizzas[i].getPrice() + " \u20AC)");
			}
		}

		return pizzas;
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		Pizza pizza = null;
		for (int i = 0; i < pizzas.length; i++) {
			if (pizzas[i] != null && (pizzas[i].getCode().equals(codePizza))) {
				pizza = pizzas[i];
			}
		}
		return pizza;
	}

	@Override
	public boolean saveNewPizza(Pizza pizza) {

		for (int i = 0; i < pizzas.length; i++) {
			if (pizzas[i] != null) {
				lastIndex = pizzas[i].getId();
			}
		}

		this.pizzas[lastIndex + 1] = pizza;

		System.out.println("Added " + pizzas[lastIndex + 1].toString());

		return true;
	}

	@Override
	public boolean updatePizza(String codePizza, Pizza pizza) {
		for (int i = 0; i < pizzas.length - 1; i++) {
			if (pizzas[i] != null && (pizzas[i].getCode().equals(codePizza))) {
				pizzas[i].setCode(pizza.getCode());
				pizzas[i].setName(pizza.getName());
				pizzas[i].setPrice(pizza.getPrice());
				System.out.println("Modified " + pizzas[i].toString());
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean deletePizza(String codePizza) {
		for (int i = 0; i < this.pizzas.length - 1; i++) {
			if (this.pizzas[i].getCode().equals(codePizza)) {
				this.pizzas[i] = null;
				break;
			}
		}
		System.out.println("The pizza \"" + codePizza + "\" was successfully deleted !! ");
		return true;
	}
}
