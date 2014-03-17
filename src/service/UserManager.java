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

}

