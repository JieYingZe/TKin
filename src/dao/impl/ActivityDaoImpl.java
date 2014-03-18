package dao.impl;

import java.util.ArrayList;

import model.Activity;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.ActivityDao;

public class ActivityDaoImpl extends HibernateDaoSupport implements ActivityDao {

	@Override
	public void saveObject(Object obj) throws HibernateException {
		getHibernateTemplate().save(obj);
	}
	
	@Override
	public void updateObject(Object obj) throws HibernateException {
		getHibernateTemplate().update(obj);
	}
	
	@Override
	public ArrayList<Activity> getAllActivity() throws HibernateException{
		String hql = "from Activity";
		@SuppressWarnings("unchecked")
		ArrayList<Activity> activityList =(ArrayList<Activity>) getHibernateTemplate().find(hql);
		return activityList;
	}



}
