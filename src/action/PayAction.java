package action;

import forms.PaymentRecordForm;
import forms.UserForm;
import service.PaymentManager;

public class PayAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	private UserForm user;
	private PaymentRecordForm paymentRecord;
	private PaymentManager paymentManager;

	public UserForm getUser() {
		return user;
	}

	public void setUser(UserForm user) {
		this.user = user;
	}

	public PaymentRecordForm getPaymentRecord() {
		return paymentRecord;
	}

	public void setPaymentRecord(PaymentRecordForm paymentRecord) {
		this.paymentRecord = paymentRecord;
	}
	
	public void setPaymentManager(PaymentManager paymentManager) {
		this.paymentManager = paymentManager;
	}

	public String activeUser() {
		try {
			System.out.println("Pay Action");
			int userId = (int) session().getAttribute("userid");
			paymentManager.activeUser(userId, paymentRecord);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
