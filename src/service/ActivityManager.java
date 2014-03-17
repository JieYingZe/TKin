package service;

import java.util.ArrayList;

import model.Activity;
import forms.ActivityForm;


public interface ActivityManager {

	public void addActivity(ActivityForm activity);
	
	public ArrayList<Activity> showActivity();

}

