package service.impl;

import model.User;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;

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

	@Override
	public User loginUser(UserForm userForm) {
		User user = new User();
		BeanUtils.copyProperties(userForm, user);
		return dao.getUserByNameAndPass(user.getUsername(), user.getPassword());
	}

}
