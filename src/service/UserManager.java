package service;

import java.util.ArrayList;

import model.User;
import forms.FamilyForm;
import forms.UserForm;

public interface UserManager {

	public void regUser(UserForm user);
	
	public void regFamilyUser(UserForm user, FamilyForm family);

	public User loginUser(UserForm user);

	public ArrayList<User> showUser();

	public UserForm showUserInfo(int userid);

	public FamilyForm showFamilyInfo(int userId);

	public void updateUser(int userid, UserForm user);
	
}

