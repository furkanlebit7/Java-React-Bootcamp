package entities;

public class Game {
	int id;
	String name;
	double price;
	boolean need18;
	int yearOfRelease;
	
	
	public Game() {
		
	}
	
	public Game(int id, String name, int price, boolean need18, int yearOfRelease) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.need18 = need18;
		this.yearOfRelease = yearOfRelease;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean getNeed18() {
		return need18;
	}

	public void setNeed18(boolean need18) {
		this.need18 = need18;
	}

	public int getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	
}
