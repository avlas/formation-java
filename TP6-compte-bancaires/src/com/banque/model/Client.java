package com.banque.model;

/**
 * Client - class to instantiate Client objects
 * 
 * @author ali
 */
public class Client {

	/** name : String */
	private String name;

	/** age : int */
	private int age;

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param age
	 */
	public Client(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name : the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age : the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "" + name + " (" + age + " years)";
	}
}
