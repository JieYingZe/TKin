package service.impl;


import java.text.DecimalFormat;
import java.util.ArrayList;

import model.Family;
import model.User;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;

import dao.UserDao;
import forms.FamilyForm;
import forms.UserForm;
import service.UserManager;

public class UserManagerImpl implements UserManager {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void regUser(UserForm userForm) throws HibernateException {
		User user = new User();
		BeanUtils.copyProperties(userForm, user);
		user.setType(0);
		userDao.saveObject(user);
		user.setCardNo(("M"+new DecimalFormat("000000").format(user.getUserId())));
		userDao.updateObject(user);
	}

	
	
	@Override
	public User loginUser(UserForm userForm) {
		User user = new User();
		BeanUtils.copyProperties(userForm, user);
		return userDao.getUserByNameAndPass(user.getUsername(), user.getPassword());
	}

	@Override
	public ArrayList<User> showUser() {
		ArrayList<User> userList = userDao.getAllUser();
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
		
		userDao.saveObject(user);
		userDao.saveObject(family);
		user.setCardNo(("F"+new DecimalFormat("000000").format(user.getUserId())));
		userDao.updateObject(user);
	}

	@Override
	public UserForm showUserInfo(int userId) {
		User user = userDao.getUserById(userId);
		UserForm userForm = new UserForm();
		BeanUtils.copyProperties(user, userForm);
		return userForm;
	}
	
	@Override
	public FamilyForm showFamilyInfo(int userId) {
		User user = userDao.getUserById(userId);
		if (user.getType()==1) {
			Family family = userDao.getFamilyByUserId(userId);
			FamilyForm familyForm = new FamilyForm();
			BeanUtils.copyProperties(family, familyForm);
			return familyForm;
		}else {
			return null;
		}
	}

	@Override
	public void updateUser(int userId, UserForm userForm) {
		User user = userDao.getUserById(userId);
		BeanUtils.copyProperties(userForm, user);
		user.setUserId(userId);
		userDao.updateObject(user);
	}

}
