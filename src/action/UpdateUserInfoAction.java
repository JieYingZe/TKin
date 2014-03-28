package action;


import forms.UserForm;
import service.UserManager;

public class UpdateUserInfoAction extends BaseAction {

	private static final long serialVersionUID = 1L;

	private UserForm user;

	private UserManager userManager;

	public UserForm getUser() {
		return user;
	}

	public void setUser(UserForm user) {
		this.user = user;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public String execute() {
		try {
			System.out.println("Update User Info Action");
			int userId = (int) session().getAttribute("userid");
			userManager.updateUser(userId, user);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	
	public String updateUserInfoByWaiter() {
		try {
			System.out.println("Update User Info By Waiter Action");
			int userId = user.getUserId();
			userManager.updateUser(userId, user);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}



}
