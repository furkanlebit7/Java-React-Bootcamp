package week3Homework;

public class Instructor extends User{
	private String field;
	
	Instructor(){
		System.out.println("Instructor oluşturuldu");
	}
	

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
}
