package service.impl;


import java.util.ArrayList;

import model.Activity;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;

import dao.BaseDao;
import forms.ActivityForm;
import service.ActivityManager;

public class ActivityManagerImpl implements ActivityManager {

	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	@Override
	public void addActivity(ActivityForm activityForm) {
		Activity activity = new Activity();
		BeanUtils.copyProperties(activityForm, activity);
		dao.saveObject(activity);
	}

	@Override
	public ArrayList<Activity> showActivity() {
		ArrayList<Activity> activityList = dao.getAllActivity();
		return activityList;
	}

}
