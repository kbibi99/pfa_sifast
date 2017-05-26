package tn.enis.pfa.dao;


import java.util.List;

import tn.enis.pfa.model.User;

public interface UserDao {
	void persistUser(User user);
	User findUserById(int id);
	void updateUser(User user);
	void deleteUser(User user);
	List<User> getUsers();
	User login(String username,String password);
}
