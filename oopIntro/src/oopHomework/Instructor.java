package oopHomework;

public class Instructor {
	int id;
	String name;
	int age;
	String field;
	
	public Instructor() {
		System.out.println("Instructor constructor �al��t�");
		id=0;
		name="anonim";
		age=0;
		field="unknown";
	}
	public Instructor(int id,String name,int age,String field) {
		System.out.println("Instructor constructor 2 �al��t�");
		this.id=id;
		this.name=name;
		this.age=age;
		this.field=field;
	}
	
}
