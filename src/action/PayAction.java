package action;


import service.UserManager;

public class PayAction extends BaseAction {

	private static final long serialVersionUID = 1L;

	private UserManager userManager;

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public String execute() {
		try {
			System.out.println("Pay Action");
			int userId = (int) session().getAttribute("userid");
			userManager.updateUser(userId, user);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
