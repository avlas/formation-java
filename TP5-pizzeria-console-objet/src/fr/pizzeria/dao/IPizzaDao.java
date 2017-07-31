/**
 * 
 */
package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

/**
 * @author ali
 *
 */
public interface IPizzaDao {
	
	Pizza[] findAllPizzas();
	Pizza findPizzaByCode(String codePizza);
	boolean saveNewPizza(Pizza pizza);
	boolean updatePizza(String codePizza, Pizza pizza);
	boolean deletePizza(String codePizza);
	
}
