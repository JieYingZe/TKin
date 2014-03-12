package dao;

import model.User;

import org.hibernate.HibernateException;

public interface BaseDao {

	public void saveObject(Object obj) throws HibernateException;
	
	public User getUserByNameAndPass(String username, String password) throws HibernateException;

}