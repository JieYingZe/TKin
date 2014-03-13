package action;

import model.User;
import service.UserManager;

public class ShowUserAction extends BaseAction {

	private static final long serialVersionUID = 1L;

	private UserManager userManager;


	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public String execute() {

		try {
			userManager.showUser();
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
