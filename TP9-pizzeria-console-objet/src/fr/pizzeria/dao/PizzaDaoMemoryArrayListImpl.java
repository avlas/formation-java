/**
 * 
 */
package fr.pizzeria.dao;

import java.util.ArrayList;
import java.util.List;

import fr.pizzeria.model.Pizza;
import fr.pizzeria.model.PizzaType;

/**
 * @author ali
 *
 */
public class PizzaDaoMemoryArrayListImpl implements IPizzaDao {

	private List<Pizza> pizzas;

	public PizzaDaoMemoryArrayListImpl() {
		pizzas = new ArrayList<>();

		pizzas.add(new Pizza("PEP", "Pépéroni", 12.5, PizzaType.WITHOUT_MEAT));
		pizzas.add(new Pizza("MAR", "Margherita", 14, PizzaType.MEAT));
		pizzas.add(new Pizza("REIN", "La Reine", 11.5, PizzaType.MEAT));
		pizzas.add(new Pizza("FRO", "La 4 fromages", 12, PizzaType.WITHOUT_MEAT));
		pizzas.add(new Pizza("CAN", "La cannibale", 12.5, PizzaType.MEAT));
		pizzas.add(new Pizza("SAV", "La savoyarde", 13, PizzaType.WITHOUT_MEAT));
		pizzas.add(new Pizza("ORI", "L'orientale", 13.5, PizzaType.WITHOUT_MEAT));
		pizzas.add(new Pizza("IND", "L'indienne", 14, PizzaType.WITHOUT_MEAT));
	}

	@Override
	public boolean isExistingPizzaCode(String pizzaCodeToCheck) {
		for (Pizza pizza : pizzas) {
			if (pizza.getCode().equals(pizzaCodeToCheck)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Pizza> findAllPizzas() {
		return pizzas;
	}

	@Override
	public boolean savePizza(Pizza pizzaToSave) {
		return pizzas.add(pizzaToSave);
	}

	@Override
	public boolean updatePizza(String codeToUpdate, Pizza pizzaUpdates) {
		Pizza pizzaToUpdate = findPizzaByCode(codeToUpdate);
		if (pizzaToUpdate != null) {
			pizzaToUpdate.setCode(pizzaUpdates.getCode());
			pizzaToUpdate.setName(pizzaUpdates.getName());
			pizzaToUpdate.setPrice(pizzaUpdates.getPrice());
			
			return true;
		}
		
		return false;
	}

	public Pizza findPizzaByCode(String codePizza) {
		for (Pizza pizza : pizzas) {
			if (pizza.getCode().equals(codePizza)) {
				return pizza;
			}
		}
		return null;
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
