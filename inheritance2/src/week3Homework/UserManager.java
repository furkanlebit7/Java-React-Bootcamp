package week3Homework;

public class UserManager {
	
	public void addUser(User user) {
		System.out.println(user.getFullName()+" kullanýcýsý eklendi ID:"+user.getId());
	}
	public void removeUser(User user) {
		System.out.println(user.getFullName()+" is removed");
	}
}
