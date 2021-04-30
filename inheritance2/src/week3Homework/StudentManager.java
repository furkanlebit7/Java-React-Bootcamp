package week3Homework;

public class StudentManager extends UserManager{
	public void getFullInformations(Student student) {
		System.out.println("ID : "+student.getId());
		System.out.println("Full Name : "+student.getFullName());
		System.out.println("E-mail : "+student.getEmail());
		System.out.println("Age : "+student.getAge());
		student.getCertificates();
	}
	public void addCertificate(Student student,String certificate) {
		if(student.certificates==null) {
			String[] newArray = {certificate};
			student.certificates=newArray;
			student.setCertificates(newArray);
		}else {
			int l = student.certificates.length;
			String[] newArray = new String[l+1];
			for (int i = 0; i < l; i++) {
				newArray[i] = student.certificates[i];
			}
			newArray[l]=certificate;
			student.setCertificates(newArray);
		}
		
	}
	

}
