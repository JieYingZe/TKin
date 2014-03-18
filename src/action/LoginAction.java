package action;

import model.User;
import forms.UserForm;
import service.UserManager;

public class LoginAction extends BaseAction {

	private static final long serialVersionUID = 1L;

	private UserForm userForm;

	private UserManager userManager;

	public UserForm getUser() {
		return userForm;
	}

	public void setUser(UserForm user) {
		this.userForm = user;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public String execute() {
		System.out.println("Login Action");
		User user = userManager.loginUser(userForm);
			if(user != null){
				session().setAttribute("userid", user.getUserId());
				session().setAttribute("username", user.getUsername());
				return SUCCESS;
			}else {
				return ERROR;
			}
	}
	
	public String logout(){
		session().removeAttribute("userid");
		session().removeAttribute("username");
		return SUCCESS;
	}

}
