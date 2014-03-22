package service.impl;


import java.util.ArrayList;

import model.Activity;
import model.ActivityRecord;
import model.User;

import org.springframework.beans.BeanUtils;

import dao.ActivityDao;
import dao.UserDao;
import forms.ActivityForm;
import service.ActivityManager;

public class ActivityManagerImpl implements ActivityManager {

	private ActivityDao activityDao;
	private UserDao userDao;

	public void setActivityDao(ActivityDao activityDao) {
		this.activityDao = activityDao;
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addActivity(ActivityForm activityForm) {
		Activity activity = new Activity();
		BeanUtils.copyProperties(activityForm, activity);
		activityDao.saveObject(activity);
	}

	@Override
	public ArrayList<ActivityForm> showActivity() {
		ArrayList<ActivityForm> activityFormList = new ArrayList<ActivityForm>();
		ArrayList<Activity> activityList = activityDao.getAllActivity();
		for(Activity activity:activityList){
			ActivityForm activityForm = new ActivityForm();
			BeanUtils.copyProperties(activity, activityForm);
			activityForm.setStatus(-1);
			activityFormList.add(activityForm);
		}
		return activityFormList;
	}

	@Override
	public void reserveActivity(int userId, int activityId) {
		ActivityRecord activityRecord = new ActivityRecord();
		User user = userDao.getUserById(userId);
		activityRecord.setUser(user);
		Activity activity = activityDao.getActivityById(activityId);
		activityRecord.setActivity(activity);
		activityRecord.setStatus(0);
		activityDao.saveObject(activityRecord);
	}

	@Override
	public ArrayList<ActivityForm> showActivityRecord(int userId) {
		User user = userDao.getUserById(userId);
		ArrayList<ActivityRecord> activityRecordList = activityDao.getActivityRecord(user);
		ArrayList<ActivityForm> activityFormList = new ArrayList<ActivityForm>();
		for(ActivityRecord activityRecord : activityRecordList){
			ActivityForm activityForm = new ActivityForm();
			BeanUtils.copyProperties(activityRecord, activityForm);
			BeanUtils.copyProperties(activityRecord.getActivity(), activityForm);
			activityFormList.add(activityForm);
		}
		return activityFormList;
	}

	@Override
	public ArrayList<ActivityForm> showActivity(int userId) {
		ArrayList<ActivityForm> activityList = showActivity();
		ArrayList<ActivityForm> activityRecordList = showActivityRecord(userId);
		for (ActivityForm activityRecordForm : activityRecordList) {
			for (ActivityForm activityForm : activityList) {
				if (activityRecordForm.getActivityId()==activityForm.getActivityId()) {
					activityForm.setStatus(activityRecordForm.getStatus());
					break;
				}
			}
		}
		return activityList;
	}
}
