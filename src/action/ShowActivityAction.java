package action;

import java.util.ArrayList;

import model.Activity;
import service.ActivityManager;

public class ShowActivityAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private ArrayList<Activity> activityList = new ArrayList<>();

	private ActivityManager activityManager;


	public void setUserManager(ActivityManager activityManager) {
		this.activityManager = activityManager;
	}
	
	public ArrayList<Activity> getUserList() {
		return activityList;
	}
	
	public void setUserList(ArrayList<Activity> activityList) {
		this.activityList = activityList;
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
