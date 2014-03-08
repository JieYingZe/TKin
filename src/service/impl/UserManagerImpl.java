package service.impl;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;

import beans.User;
import dao.BaseDao;
import forms.UserForm;
import service.UserManager;

public class UserManagerImpl implements UserManager {

	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	@Override
	public void regUser(UserForm userForm) throws HibernateException {
		User user = new User();
		BeanUtils.copyProperties(userForm, user);
		dao.saveObject(user);
	}

}