package action;

import java.util.ArrayList;

import model.Activity;
import service.ActivityManager;

public class ShowActivityAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private ArrayList<Activity> activityList = new ArrayList<>();
	private ActivityManager activityManager;

	public ArrayList<Activity> getActivityList() {
		return activityList;
	}

	public void setActivityList(ArrayList<Activity> activityList) {
		this.activityList = activityList;
	}


	public void setActivityManager(ActivityManager activityManager) {
		this.activityManager = activityManager;
	}

	public String execute() {
		try {
			System.out.println("Show Activity Action");
			activityList = activityManager.showActivity();
			request().setAttribute("activityList", activityList);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
