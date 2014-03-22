package dao;

import java.util.ArrayList;

import model.Activity;
import model.ActivityRecord;
import model.User;

import org.hibernate.HibernateException;


public interface ActivityDao {

	public void saveObject(Object obj) throws HibernateException;
	
	public void updateObject(Object obj) throws HibernateException;
	
	public ArrayList<Activity> getAllActivity() throws HibernateException;

	public Activity getActivityById(int activityId);

	public ArrayList<ActivityRecord> getActivityRecord(User user);

}