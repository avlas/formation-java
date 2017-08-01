/** 
 *	@author avlas
 */

package fr.pizzeria.model;

public class Pizza {

	static int nextId = 0;

	/** id : int */
	private Integer id;

	/** code : String */
	private String code;

	/** name : String */
	private String name;

	/** price : double */
	private double price;

	public Pizza() {
	}

	/**
	 * @param code
	 * @param name
	 * @param price
	 */
	public Pizza(String code, String name, double price) {
		this.id = nextId++;
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
