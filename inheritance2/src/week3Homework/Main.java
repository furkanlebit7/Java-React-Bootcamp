package week3Homework;

public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFullName("Engin Demiroð");
		instructor.setEmail("engindemirog@gmail.com");
		instructor.setAge(34);
		instructor.setField("Software Development");		
		Student student=new Student();
		student.setId(2);
		student.setFullName("Furkan Lebit");
		student.setEmail("furkanlebitt7@gmail.com");
		student.setAge(23);
		student.setNameOfSchool("IZU");	
		UserManager userManager  =new UserManager();
		userManager.addUser(instructor);
		userManager.addUser(student);
		System.out.println("---------------------------------------------");
		StudentManager studentManager = new StudentManager();
		studentManager.addCertificate(student,"React & Java");
		studentManager.addCertificate(student,"Angular & C#");
		studentManager.getFullInformations(student);
		System.out.println("---------------------------------------------");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.getFullInformations(instructor);
		
	}

}
