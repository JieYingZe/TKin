package dao;

import java.util.ArrayList;

import model.Activity;

import org.hibernate.HibernateException;


public interface ActivityDao {

	public void saveObject(Object obj) throws HibernateException;
	
	public void updateObject(Object obj) throws HibernateException;
	
	public ArrayList<Activity> getAllActivity() throws HibernateException;

}