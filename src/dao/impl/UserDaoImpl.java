package dao.impl;

import java.util.ArrayList;
import java.util.List;

import model.Family;
import model.User;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.UserDao;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

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
		return userList.size() == 0 ? null : userList.get(0);
	}

	@Override
	public ArrayList<User> getAllUser() throws HibernateException{
		String hql = "from User";
		@SuppressWarnings("unchecked")
		ArrayList<User> userList =(ArrayList<User>) getHibernateTemplate().find(hql);
		return userList;
	}

	@Override
	public User getUserById(int userId) throws HibernateException {
		User user = (User) getHibernateTemplate().get(User.class, userId);
		return user;
	}

	@Override
	public Family getFamilyByUserId(int userId) {
		Family family = (Family) getHibernateTemplate().get(Family.class, userId);
		return family;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Long getCountByAttrAndVal(String attr, String val) {
		String hql = "select COUNT(*) from User u where u." + attr + "=" + val;
		ArrayList<Long> count = (ArrayList<Long>) getHibernateTemplate().find(hql);
		return (count.size() > 0 ? (count.get(0)) : 0L);
	}
	
	@Override
	public List<Object[]> getGroupCountByAttr(String attr) {
		String hql = "select u." + attr + ", COUNT(*) from User u group by u." + attr;
		@SuppressWarnings("unchecked")
		List<Object[]> count = getHibernateTemplate().find(hql);
		return count;
	}

	@Override
	public Long getCountByAttrAndRange(String attr, int min, int max) {
		String hql = "select COUNT(*) from User u where u." + attr + ">=? and u." + attr + " <=?";
		@SuppressWarnings("unchecked")
		ArrayList<Long> count = (ArrayList<Long>) getHibernateTemplate().find(hql, new Object[]{ min, max });
		return (count.size() > 0 ? (count.get(0)) : 0L);
	}
}
