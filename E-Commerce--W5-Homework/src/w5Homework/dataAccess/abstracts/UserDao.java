package w5Homework.dataAccess.abstracts;

import w5Homework.entities.concretes.User;

public interface UserDao {
	void add(User user);
	boolean delete(int id);
	boolean update(User user);
	User get(String email);
}
