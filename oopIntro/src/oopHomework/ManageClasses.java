package oopHomework;

public class ManageClasses {
	public void getCategoriy(Category category) {
		System.out.println(category.id+" id'sine sahip "+category.name+" kategorisinde "
	+category.amountOfUnit+" adet ders bulunaktad�r.");
	}
	public void getInstructor(Instructor instructor) {
		System.out.println(instructor.id+" id'sine sahip "+instructor.name+" isimli e�itmen "+instructor.age+
				" ya��ndad�r ve "+instructor.field+" alan�na y�nelik �al��malar yapmaktad�r");
	}
}
