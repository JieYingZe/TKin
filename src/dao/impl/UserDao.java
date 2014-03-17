package dao.impl;

import java.util.ArrayList;

import model.Activity;
import model.User;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.BaseDao;

public class UserDao extends HibernateDaoSupport implements BaseDao {

	@Override
	public void saveObject(Object obj) throws HibernateException {
		getHibernateTemplate().save(obj);
	}
	
	@Override
	public void updateObject(Object obj) throws HibernateException {
		getHibernateTemplate().update(obj);
	}
	
	@Override
	public User getUserByNameAndPass(String username, String password) throws HibernateException {
		String hql = "from User u where u.username=? and u.password=?";
		@SuppressWarnings("unchecked")
		ArrayList<User> userList = (ArrayList<User>) getHibernateTemplate().find(hql, new Object[] { username, password });
		System.out.println(userList.size());
		return userList.size() == 0 ? null : userList.get(0);
	}

	@Override
	public ArrayList<User> getAllUser() {
		String hql = "from User";
		@SuppressWarnings("unchecked")
		ArrayList<User> userList =(ArrayList<User>) getHibernateTemplate().find(hql);
		return userList;
	}

	@Override
	public ArrayList<Activity> getAllActivity() {
		String hql = "from Activity";
		@SuppressWarnings("unchecked")
		ArrayList<Activity> activityList =(ArrayList<Activity>) getHibernateTemplate().find(hql);
		return activityList;
	}



}
