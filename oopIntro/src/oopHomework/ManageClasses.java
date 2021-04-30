package oopHomework;

public class ManageClasses {
	public void getCategoriy(Category category) {
		System.out.println(category.id+" id'sine sahip "+category.name+" kategorisinde "
	+category.amountOfUnit+" adet ders bulunaktadýr.");
	}
	public void getInstructor(Instructor instructor) {
		System.out.println(instructor.id+" id'sine sahip "+instructor.name+" isimli eðitmen "+instructor.age+
				" yaþýndadýr ve "+instructor.field+" alanýna yönelik çalýþmalar yapmaktadýr");
	}
}
