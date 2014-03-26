package service;

import java.util.ArrayList;

import forms.ActivityForm;
import forms.ClubStatistics;


public interface ActivityManager {

	public void addActivity(ActivityForm activity);
	
	public ArrayList<ActivityForm> showActivity();
	
	public ArrayList<ActivityForm> showActivity(int userId);

	public void reserveActivity(int userId, int activityId);

	public ArrayList<ActivityForm> showActivityRecord(int userId);

	public ClubStatistics showClubStatistics();

}

