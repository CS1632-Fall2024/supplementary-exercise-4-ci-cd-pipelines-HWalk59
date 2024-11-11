package edu.pitt.cs;

public class CatImpl implements Cat {

	private int id;
	private String name;
	private boolean rented;

	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
		this.rented = false;
	}

	public void rentCat() {
		this.rented = true;
	}

	public void returnCat() {
		this.rented = false;
	}

	public void renameCat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public boolean getRented() {
		return rented;
	}

	public String toString() {
		String ret = "ID " + this.id + ". " + this.name;
		return ret;
	}

}