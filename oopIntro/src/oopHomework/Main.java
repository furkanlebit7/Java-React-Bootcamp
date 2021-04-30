package oopHomework;

public class Main {

	public static void main(String[] args) {
		Category category1 = new Category();
		Category category2 = new Category(1,"Web Development",5);
		Category category3 = new Category(2,"IoT",6);
		
		Category[] categories= {category1,category2,category3};
		
		for (Category category : categories) {
			System.out.println(category.name);
		}
		
		
		Instructor instructor1 = new Instructor();
		Instructor instructor2 = new Instructor(1,"Furkan Lebit",23,"Web Development");
		Instructor instructor3 = new Instructor(2,"Zeynep Yavuz",21,"Cyber Security");
		
		Instructor[] instructors= {instructor1,instructor2,instructor3};
		
		for (Instructor instructor : instructors) {
			System.out.println(instructor.name);
		}
		
		ManageClasses manageClasses = new ManageClasses();
		manageClasses.getCategoriy(category1);
		manageClasses.getCategoriy(category2);
		manageClasses.getCategoriy(category3);
		manageClasses.getInstructor(instructor1);
		manageClasses.getInstructor(instructor2);
		manageClasses.getInstructor(instructor3);

	}
}
