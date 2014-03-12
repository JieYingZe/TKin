package dao.impl;

import java.util.List;

import model.User;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.BaseDao;

public class UserDao extends HibernateDaoSupport implements BaseDao {

	@Override
	public void saveObject(Object obj) throws HibernateException {
		getHibernateTemplate().save(obj);
	}
	
	public User getUserByNameAndPass(String username, String password) throws HibernateException {
		String sql = "from User u where u.username=? and u.password=?";
		@SuppressWarnings("unchecked")
		List<User> userList = getHibernateTemplate().find(sql, new Object[] { username, password });
		System.out.println(userList.size());
		return userList.size() == 0 ? null : userList.get(0);
	}

}
