package service.impl;


import java.text.DecimalFormat;
import java.util.ArrayList;

import model.Family;
import model.User;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;

import dao.BaseDao;
import forms.FamilyForm;
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
		user.setType(0);
		dao.saveObject(user);
		user.setCardNo(("M"+new DecimalFormat("000000").format(user.getUserId())));
		dao.updateObject(user);
	}

	
	
	@Override
	public User loginUser(UserForm userForm) {
		User user = new User();
		BeanUtils.copyProperties(userForm, user);
		return dao.getUserByNameAndPass(user.getUsername(), user.getPassword());
	}

	@Override
	public ArrayList<User> showUser() {
		ArrayList<User> userList = dao.getAllUser();
		return userList;
	}

	@Override
	public void regFamilyUser(UserForm userForm, FamilyForm familyForm) {
		User user = new User();
		BeanUtils.copyProperties(userForm, user);
		user.setType(1);
		
		Family family = new Family();
		BeanUtils.copyProperties(familyForm, family);
		family.setUser(user);
		
		dao.saveObject(user);
		dao.saveObject(family);
		user.setCardNo(("F"+new DecimalFormat("000000").format(user.getUserId())));
		dao.updateObject(user);
	}

}
