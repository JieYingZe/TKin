package dao;

import java.util.ArrayList;

import model.Activity;
import model.User;

import org.hibernate.HibernateException;


public interface BaseDao {

	public void saveObject(Object obj) throws HibernateException;
	
	public void updateObject(Object obj) throws HibernateException;
	
	public User getUserByNameAndPass(String username, String password) throws HibernateException;
	
	public ArrayList<User> getAllUser();

	public ArrayList<Activity> getAllActivity();

}