package action;

import java.util.ArrayList;

import forms.ActivityForm;
import service.ActivityManager;

public class ShowActivityRecordAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private ArrayList<ActivityForm> activityRecordList = new ArrayList<>();
	private ActivityManager activityManager;

	public ArrayList<ActivityForm> getActivityRecordList() {
		return activityRecordList;
	}

	public void setActivityRecordList(ArrayList<ActivityForm> activityRecordList) {
		this.activityRecordList = activityRecordList;
	}

	public void setActivityManager(ActivityManager activityManager) {
		this.activityManager = activityManager;
	}

	public String execute() {
		try {
			System.out.println("Show Activity Action");
			int userId = (int) session().getAttribute("userid");
			System.out.println(userId);
			activityRecordList = activityManager.showActivityRecord(userId);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
