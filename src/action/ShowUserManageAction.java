package action;

import java.util.ArrayList;

import forms.ActivityForm;
import forms.FamilyForm;
import forms.PaymentRecordForm;
import forms.UserForm;
import service.ActivityManager;
import service.PaymentManager;
import service.UserManager;

public class ShowUserManageAction extends BaseAction {

	private static final long serialVersionUID = 1L;

	private int userId;
	private UserForm user;
	private FamilyForm family;
	private ArrayList<ActivityForm> activityRecordList;
	private ArrayList<PaymentRecordForm> paymentRecordList;
	private UserManager userManager;
	private ActivityManager activityManager;
	private PaymentManager paymentManager;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

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

	public ArrayList<ActivityForm> getActivityRecordList() {
		return activityRecordList;
	}

	public void setActivityRecordList(ArrayList<ActivityForm> activityRecordList) {
		this.activityRecordList = activityRecordList;
	}

	public ArrayList<PaymentRecordForm> getPaymentRecordList() {
		return paymentRecordList;
	}

	public void setPaymentRecordList(ArrayList<PaymentRecordForm> paymentRecordList) {
		this.paymentRecordList = paymentRecordList;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public void setActivityManager(ActivityManager activityManager) {
		this.activityManager = activityManager;
	}

	public void setPaymentManager(PaymentManager paymentManager) {
		this.paymentManager = paymentManager;
	}

	public String execute() {
		try {
			System.out.println("Show User Manage Action");
				System.out.println("Waiter Show User " + userId);
				user = userManager.showUserInfo(userId);
				family = userManager.showFamilyInfo(userId);
				activityRecordList = activityManager.showActivityRecord(userId);
				paymentRecordList = paymentManager.showPaymentRecord(userId);
				return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}


}
