package action;

import java.util.Map;

import forms.ClubStatistics;
import service.ActivityManager;

public class ShowClubStatisticsAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private ClubStatistics clubStatistics;
	private ActivityManager activityManager;

	public ClubStatistics getClubStatistics() {
		return clubStatistics;
	}

	public void setClubStatistics(ClubStatistics clubStatistics) {
		this.clubStatistics = clubStatistics;
	}
	
	public void setActivityManager(ActivityManager activityManager) {
		this.activityManager = activityManager;
	}

	public String execute() {
		try {
			System.out.println("Show Club Statistics Action");
			clubStatistics = activityManager.showClubStatistics();
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}





}
