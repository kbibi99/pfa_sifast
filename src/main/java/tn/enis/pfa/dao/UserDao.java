package tn.enis.pfa.dao;


import java.util.List;

import tn.enis.pfa.model.User;

public interface UserDao {
	void persistUser(User user);
	User findUserById(int id);
	User findUserByUserName(String Username);
	User findUserByEmail(String email);
	User findUserByConfidetialCode(String cc);
	User findUserByCIN(String cin);
	void updateUser(User user);
	void deleteUser(User user);
	List<User> getUsers();
	User login(String username,String password);
}
