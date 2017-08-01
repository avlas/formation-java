package com.banque.model;

public class Client {

	/** name : String */
	private String name;

	/** age : int */
	private int age;

	/**
	 * @param name
	 * @param age
	 */
	public Client(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "" + name + " - " + age;
	}
}
