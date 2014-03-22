package action;

import service.ActivityManager;

public class ReserveActivityAction extends BaseAction {

	private static final long serialVersionUID = 1L;

	private int activityId;
	private ActivityManager activityManager;

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public void setActivityManager(ActivityManager activityManager) {
		this.activityManager = activityManager;
	}
	
	public String execute() {
		try {
			System.out.println("Reserve Activity Action");
			int userId = (int) session().getAttribute("userid");
			System.out.println("User"+userId+" reserve acitivity"+activityId);
			activityManager.reserveActivity(userId, activityId);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
