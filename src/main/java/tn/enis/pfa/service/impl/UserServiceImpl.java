package tn.enis.pfa.service.impl;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.enis.pfa.dao.UserDao;
import tn.enis.pfa.model.User;
import tn.enis.pfa.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Transactional
	public void persistUser(User user) {
		userDao.persistUser(user);
		
	}
	@Transactional
	public User findUserById(int id) {
	
		return userDao.findUserById(id);
	}
	@Transactional
	public void updateUser(User user) {
		userDao.updateUser(user);
		
	}
	@Transactional
	public void deleteUser(User user) {
		userDao.deleteUser(user);
		
	}
	@Transactional
	public List<User> getUsers() {
		return userDao.getUsers();
		
	}
	@Transactional
	public User login(String username, String password) {
		return userDao.login(username, password);
	}

}
