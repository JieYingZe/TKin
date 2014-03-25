package action;

import java.util.ArrayList;

import forms.UserStatistics;
import model.User;
import service.UserManager;

public class ShowUserStatisticsAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private UserStatistics userStatistics;

	private UserManager userManager;


	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	
	public UserStatistics getUserStatistics() {
		return userStatistics;
	}


	public void setUserStatistics(UserStatistics userStatistics) {
		this.userStatistics = userStatistics;
	}
	
	public String execute() {
		try {
			System.out.println("Show User Statistics Action");
			userStatistics = userManager.showUserStatistics();
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}




}
