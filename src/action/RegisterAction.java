package action;

import com.opensymphony.xwork2.ActionSupport;

import forms.UserForm;
import service.UserManager;

public class RegisterAction extends ActionSupport {

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
			System.out.println("Register Action");
			userManager.regUser(user);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
