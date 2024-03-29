package action;

import java.util.ArrayList;

import forms.ActivityForm;
import service.ActivityManager;

public class ShowActivityAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private ArrayList<ActivityForm> activityList = new ArrayList<>();
	private ActivityManager activityManager;

	public ArrayList<ActivityForm> getActivityList() {
		return activityList;
	}

	public void setActivityList(ArrayList<ActivityForm> activityList) {
		this.activityList = activityList;
	}

	public void setActivityManager(ActivityManager activityManager) {
		this.activityManager = activityManager;
	}

	public String showActivityForUser() {
		try {
			System.out.println("Show Activity Action");
			int userId = (int) session().getAttribute("userid");
			activityList = activityManager.showActivity(userId);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	
	public String showActivityForWaiter() {
		try {
			System.out.println("Show Activity Action");
			activityList = activityManager.showActivity();
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
