package tn.enis.pfa.service;


import java.util.List;

import tn.enis.pfa.model.User;

public interface UserService {
	void persistUser(User user);
	User findUserById(int id);
	void updateUser(User user);
	void deleteUser(User user);
	List<User> getUsers();
	User login(String username,String password);
}
