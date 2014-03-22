package service.impl;


import java.util.ArrayList;

import model.Activity;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;

import dao.ActivityDao;
import forms.ActivityForm;
import service.ActivityManager;

public class ActivityManagerImpl implements ActivityManager {

	private ActivityDao dao;

	public void setDao(ActivityDao dao) {
		this.dao = dao;
	}

	@Override
	public void addActivity(ActivityForm activityForm) {
		Activity activity = new Activity();
		BeanUtils.copyProperties(activityForm, activity);
		dao.saveObject(activity);
	}

	@Override
	public ArrayList<ActivityForm> showActivity(int userId) {
		ArrayList<ActivityForm> activityFormList = new ArrayList<ActivityForm>();
		ArrayList<Activity> activityList = dao.getAllActivity();
		for(Activity activity:activityList){
			ActivityForm activityForm = new ActivityForm();
			BeanUtils.copyProperties(activity, activityForm);
			activityFormList.add(activityForm);
		}

		return activityFormList;
	}
	
	@Override
	public ArrayList<Activity> showActivity() {
		ArrayList<Activity> activityList = dao.getAllActivity();
		return activityList;
	}

}
