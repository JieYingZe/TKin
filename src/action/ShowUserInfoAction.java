package action;

import forms.FamilyForm;
import forms.UserForm;
import service.UserManager;

public class ShowUserInfoAction extends BaseAction {

	private static final long serialVersionUID = 1L;

	private UserForm user;
	private FamilyForm family;
	private UserManager userManager;

	public UserForm getUser() {
		return user;
	}

	public void setUser(UserForm user) {
		this.user = user;
	}
	
	public FamilyForm getFamily() {
		return family;
	}

	public void setFamily(FamilyForm family) {
		this.family = family;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public String execute() {
		try {
			System.out.println("Show User Info Action");
			if (session().getAttribute("userid") != null) {
				int userId = (int) session().getAttribute("userid");
				user = userManager.showUserInfo(userId);
				family = userManager.showFamilyInfo(userId);
				return SUCCESS;
			}else {
				return INPUT;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
