package w5Homework.business.abstracts;

import w5Homework.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(int id);
	void update(User user);
}
