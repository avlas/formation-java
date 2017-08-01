/**
 * 
 */
package fr.pizzeria.dao;

import java.util.List;

import fr.pizzeria.model.Pizza;

/**
 * @author ali
 *
 */
public interface IPizzaDao {
	
	List<Pizza> findAllPizzas();
	public Pizza findPizzaByCode(String codePizza);
	boolean saveNewPizza(Pizza pizza);
	boolean updatePizza(String codePizza, Pizza pizza);
	boolean deletePizza(String codePizza);
	
}
