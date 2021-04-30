package week3Homework;

public class InstructorManager extends UserManager{

	public void getFullInformations(Instructor instructor) {
		System.out.println("ID : "+instructor.getId());
		System.out.println("Full Name : "+instructor.getFullName());
		System.out.println("E-mail : "+instructor.getEmail());
		System.out.println("Age : "+instructor.getAge());
		System.out.println("Field : "+instructor.getField());
	}

}
