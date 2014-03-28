package service.impl;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Family;
import model.User;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;

import dao.UserDao;
import forms.FamilyForm;
import forms.UserForm;
import forms.UserStatistics;
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
		user.setUsername(userForm.getUsername());
		user.setPassword(userForm.getPassword());
		user.setGender(userForm.getGender());
		user.setAge(userForm.getAge());
		user.setAddress(userForm.getAddress());
		user.setUserId(userId);
		userDao.updateObject(user);
	}

	@Override
	public UserStatistics showUserStatistics() {
		UserStatistics userStatistics = new UserStatistics();
		
		Map<String, Long> ageGroupCount = new HashMap<String, Long>();
		ageGroupCount.put("儿童：0~6岁", userDao.getCountByAttrAndRange("age", 0, 6));
		ageGroupCount.put("少年：7~17岁", userDao.getCountByAttrAndRange("age", 7, 17));
		ageGroupCount.put("青年：18~40岁", userDao.getCountByAttrAndRange("age", 18, 40));
		ageGroupCount.put("中年人：41~65岁", userDao.getCountByAttrAndRange("age", 41, 65));
		ageGroupCount.put("老年人：66岁以上", userDao.getCountByAttrAndRange("age", 66, 128));
		userStatistics.setAgeGroupCount(ageGroupCount);
		
		userStatistics.setMaleCount(userDao.getCountByAttrAndVal("gender", "1"));
		userStatistics.setFemaleCount(userDao.getCountByAttrAndVal("gender", "0"));
		
		Map<String, Long> addrCount = new HashMap<String, Long>();
		List<Object[]> addrCountList = userDao.getGroupCountByAttr("address");
		for (Object[] addrCountListItem : addrCountList) {
			addrCount.put((String) addrCountListItem[0], (Long) addrCountListItem[1]);
		}
		userStatistics.setAddrCount(addrCount);
		
		Map<String, Long> qualificationsCount = new HashMap<String, Long>();
		qualificationsCount.put("未激活", userDao.getCountByAttrAndVal("qualifications", "0"));
		qualificationsCount.put("有效", userDao.getCountByAttrAndVal("qualifications", "1"));
		qualificationsCount.put("暂停", userDao.getCountByAttrAndVal("qualifications", "2"));
		qualificationsCount.put("停止", userDao.getCountByAttrAndVal("qualifications", "3"));
		qualificationsCount.put("取消", userDao.getCountByAttrAndVal("qualifications", "4"));
		userStatistics.setQualificationsCount(qualificationsCount);
		
		return userStatistics;
	}

}
