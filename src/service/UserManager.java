package service;

import java.util.ArrayList;

import model.User;
import forms.UserForm;

public interface UserManager {

	public void regUser(UserForm user);

	public User loginUser(UserForm user);

	public ArrayList<User> showUser();

}

