package week3Homework;
public class Student extends User{
	private String nameOfSchool;
	protected String[] certificates;
	
	Student(){
		System.out.println("Öðrenci oluþturuldu");
	}

	public String getNameOfSchool() {
		return nameOfSchool;
	}

	public void setNameOfSchool(String nameOfSchool) {
		this.nameOfSchool = nameOfSchool;
	}
	protected void setCertificates(String[] certificates) {
		this.certificates=certificates;
	}
	public void getCertificates() {
		if(certificates==null) {
			System.out.println(getFullName()+" has no any cerficiate");
		}else {
			System.out.println(getFullName()+"'s certificates are :");
			for(String certificate:certificates) {
				System.out.println(certificate);
			}
		}
		
		
	}
	
}
