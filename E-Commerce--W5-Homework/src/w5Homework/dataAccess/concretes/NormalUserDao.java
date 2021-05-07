package w5Homework.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import w5Homework.dataAccess.abstracts.UserDao;
import w5Homework.entities.concretes.User;

public class NormalUserDao implements UserDao{
	
	private List<User> users = new ArrayList<User>();
	
	public NormalUserDao() {
		super();
		User user1=new User(1, "Zeynep", "Yavuz", "zeynepyavuz@gmail.com", "741852", true);
		User user2=new User(2, "Umut Can", "Yýlmaz", "umutcan@gmail.com", "852963", true);
		
		users.add(user1);
		users.add(user2);
	}

	@Override
	public void add(User user) {
		users.add(user);
	}

	@Override
	public boolean delete(int id) {
		User removedUser=users.stream()
				.filter(u->u.getId()==id)
				.findFirst()
				.orElse(null);
		if(!(removedUser==null)) {
			users.remove(removedUser);
			return true;
		}
		return false;
	}

	@Override
	public boolean update(User user) {
		User updatedUser = users.stream()
				.filter(u->u.getId()==user.getId())
				.findFirst()
				.orElse(null);
		if(!(updatedUser==null)) {
			updatedUser.setFirstName(user.getFirstName());
			updatedUser.setLastName(user.getLastName());
			updatedUser.setEmail(user.getEmail());
			updatedUser.setPassword(user.getPassword());
			updatedUser.setIsVerified(user.getIsVerified());
			return true;
		}
		return false;
		
		
	}

	@Override
	public User get(String email) {
		User user = users.stream()
				.filter(u -> u.getEmail() == email)
				.findFirst()
				.orElse(null);
		return user;
	}

}
