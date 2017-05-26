package tn.enis.pfa.dao.impl;



import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tn.enis.pfa.dao.UserDao;
import tn.enis.pfa.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void persistUser(User user) {
		sessionFactory.getCurrentSession().persist(user);
	}

	public User findUserById(int id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
	}

	public void updateUser(User user) {
		sessionFactory.getCurrentSession().update(user);
		
	}

	public void deleteUser(User user) {
		sessionFactory.getCurrentSession().delete(user);
		
	}

	public List<User> getUsers() {
		List<User> list=sessionFactory.getCurrentSession().createCriteria(User.class).list();
		return list;
	}

	public User login(String username, String password) {
		List<User> list = sessionFactory.getCurrentSession().createQuery("from User where username=? and password=?")
		.setParameter(0,username).setParameter(1,password).list();
		if ((list != null) && (list.size() > 0))
			return list.get(0);
		
		return null;
	}
	

}
