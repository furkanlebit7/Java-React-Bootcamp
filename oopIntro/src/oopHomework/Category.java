package oopHomework;

public class Category {
	int id;
	String name;
	int amountOfUnit;
	
	public Category() {
		System.out.println("Categorie constructor Çalýþtý");
		id=0;
		name="anonim";
		amountOfUnit=0;
	}
	public Category(int id,String name,int amountOfUnit) {
		System.out.println("Categorie constructor 2 Çalýþtý");
		this.id=id;
		this.name=name;
		this.amountOfUnit=amountOfUnit;
	}

}
