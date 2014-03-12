package action;

import com.opensymphony.xwork2.ActionSupport;
import forms.UserForm;
import service.UserManager;

public class LoginAction extends ActionSupport {

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
			if(userManager.loginUser(user)!=null){
				return SUCCESS;
			}else {
				return ERROR;
			}
	}

}
