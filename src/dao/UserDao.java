package dao;

import java.util.ArrayList;
import java.util.List;

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

	public Long getCountByAttrAndVal(String attr, String val);

	List<Object[]> getGroupCountByAttr(String attr);

	public Long getCountByAttrAndRange(String attr, int min, int max);

	public ArrayList<User> getActiveUser();

}