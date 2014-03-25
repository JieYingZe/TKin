package dao;

import java.util.ArrayList;

import model.Family;
import model.User;

import org.hibernate.HibernateException;


public interface UserDao {

	public void saveObject(Object obj) throws HibernateException;
	
	public void updateObject(Object obj) throws HibernateException;
	
	public User getUserById(int userId) throws HibernateException;
	
	public User getUserByNameAndPass(String username, String password) throws HibernateException;
	
	public ArrayList<User> getAllUser() throws HibernateException;

	public Family getFamilyByUserId(int userId);

	public int getCountByAttrAndVal(String attr, String val);

}