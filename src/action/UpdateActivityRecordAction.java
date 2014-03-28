package action;


import forms.ActivityForm;
import service.ActivityManager;

public class UpdateActivityRecordAction extends BaseAction {

	private static final long serialVersionUID = 1L;

	private int userId;
	private int activityId;
	private ActivityForm activity;

	private ActivityManager activityManager;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}
	public ActivityForm getActivity() {
		return activity;
	}

	public void setActivity(ActivityForm activity) {
		this.activity = activity;
	}

	public void setActivityManager(ActivityManager activityManager) {
		this.activityManager = activityManager;
	}

	public String participateActivity() {
		try {
			System.out.println("Participate Activity Action");
			activityManager.participateActivity(userId, activityId);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	
	public String missActivity() {
		try {
			System.out.println("Miss Activity Action");
			activityManager.missActivity(userId, activityId);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}


}
