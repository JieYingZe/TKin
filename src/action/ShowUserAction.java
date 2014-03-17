package action;

import java.util.ArrayList;

import model.User;
import service.UserManager;

public class ShowUserAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private ArrayList<User> userList = new ArrayList<>();

	private UserManager userManager;


	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	
	public ArrayList<User> getUserList() {
		return userList;
	}
	
	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}

	public String execute() {
		try {
			System.out.println("Show User Action");
			userList = userManager.showUser();
			request().setAttribute("userList", userList);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
