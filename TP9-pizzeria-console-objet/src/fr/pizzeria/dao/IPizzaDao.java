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
	boolean isExistingPizzaCode(String codePizza);	
	Pizza findPizzaByCode(String codePizza);
	boolean savePizza(Pizza pizza);
	boolean updatePizza(String codePizza, Pizza pizza);
	boolean deletePizza(String codePizza);
	
}
