/**
 * 
 */
package fr.pizzeria.dao;

import java.util.ArrayList;
import java.util.List;

import fr.pizzeria.model.Pizza;

/**
 * @author ali
 *
 */
public class PizzaDaoMemoryArrayListImpl implements IPizzaDao {

	private List<Pizza> pizzas;

	public PizzaDaoMemoryArrayListImpl() {
		pizzas = new ArrayList<>();

		pizzas.add(new Pizza("PEP", "Pépéroni", 12.5));
		pizzas.add(new Pizza("MAR", "Margherita", 14));
		pizzas.add(new Pizza("REIN", "La Reine", 11.5));
		pizzas.add(new Pizza("FRO", "La 4 fromages", 12));
		pizzas.add(new Pizza("CAN", "La cannibale", 12.5));
		pizzas.add(new Pizza("SAV", "La savoyarde", 13));
		pizzas.add(new Pizza("ORI", "L'orientale", 13.5));
		pizzas.add(new Pizza("IND", "L'indienne", 14));
	}

	@Override
	public boolean isCodeAlreadyExist(String codeToVerify) {
		for (Pizza pizza : pizzas) {
			if (pizza.getCode().equals(codeToVerify)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public List<Pizza> findAllPizzas() {
		for (Pizza pizza : pizzas) {
			System.out.println(pizza.getId() + " - " + pizza.getCode() + " -> " + pizza.getName() + " (" + pizza.getPrice() + " \u20AC)");
		}
		return pizzas;
	}

	@Override
	public boolean saveNewPizza(Pizza pizzaToSave) {
		return pizzas.add(pizzaToSave);
	}

	@Override
	public boolean updatePizza(String userCodeToUpdate, Pizza pizzaUpdates) {
		Pizza pizzaToUpdate = findPizzaByCode(userCodeToUpdate);
		
		if (pizzaToUpdate != null) {
			pizzaToUpdate.setCode(pizzaUpdates.getCode());
			pizzaToUpdate.setName(pizzaUpdates.getName());
			pizzaToUpdate.setPrice(pizzaUpdates.getPrice());
		}
		System.out.println("THE MODIFIED PIZZA IS : " + pizzaToUpdate.getCode() + " -> " + pizzaToUpdate.getName()
				+ " (" + pizzaToUpdate.getPrice() + " \u20AC)");
		return true;
	}

	public Pizza findPizzaByCode(String codePizza) {
		Pizza foundPizza = null;

		for (Pizza pizza : pizzas) {
			if (pizza.getCode().equals(codePizza)) {
				foundPizza = pizza;
			}
		}
		return foundPizza;
	}
	
	@Override
	public boolean deletePizza(String pizzaCodeToDelete) {
		for (Pizza pizza : pizzas) {
			if (pizza.getCode().equals(pizzaCodeToDelete)) {
				pizzas.remove(pizza);
				return true;
			}
		}
		return false;
	}
}
