package week3Homework;

public class UserManager {
	
	public void addUser(User user) {
		System.out.println(user.getFullName()+" kullan�c�s� eklendi ID:"+user.getId());
	}
	public void removeUser(User user) {
		System.out.println(user.getFullName()+" is removed");
	}
}
