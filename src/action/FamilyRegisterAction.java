package action;

import com.opensymphony.xwork2.ActionSupport;

import forms.FamilyForm;
import forms.UserForm;
import service.UserManager;

public class FamilyRegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private UserForm user;
	private FamilyForm family;
	private UserManager userManager;
	
	public FamilyForm getFamily() {
		return family;
	}

	public void setFamily(FamilyForm family) {
		this.family = family;
	}

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
			userManager.regFamilyUser(user, family);
			return SUCCESS;

		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
