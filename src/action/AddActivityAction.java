package action;

import com.opensymphony.xwork2.ActionSupport;

import forms.ActivityForm;
import service.ActivityManager;

public class AddActivityAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private ActivityForm activity;

	private ActivityManager activityManager;
	
	
	public ActivityForm getActivity() {
		return activity;
	}

	public void setActivity(ActivityForm activity) {
		this.activity = activity;
	}

	public void setActivityManager(ActivityManager activityManager) {
		this.activityManager = activityManager;
	}


	public String execute() {
		try {
			System.out.println("Add Activity Action");
			activityManager.addActivity(activity);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
