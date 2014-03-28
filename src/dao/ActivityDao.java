package dao;

import java.util.ArrayList;
import java.util.Map;

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

	public Map<String, Long> getGroupCountByAttr(String attr);

	public Map<String, Long> getPeopleCountMonthly();

	public Map<String, Long> getPeopleCountDaily();

	public ActivityRecord getActivityRecord(User user, Activity activity);

}