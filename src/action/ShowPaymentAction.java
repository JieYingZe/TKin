package action;

import java.util.ArrayList;

import forms.PaymentRecordForm;
import service.PaymentManager;

public class ShowPaymentAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private ArrayList<PaymentRecordForm> paymentRecordList = new ArrayList<>();
	private PaymentManager paymentManager;

	public ArrayList<PaymentRecordForm> getPaymentRecordList() {
		return paymentRecordList;
	}

	public void setPaymentRecordList(ArrayList<PaymentRecordForm> paymentRecordList) {
		this.paymentRecordList = paymentRecordList;
	}

	public void setPaymentManager(PaymentManager paymentManager) {
		this.paymentManager = paymentManager;
	}

	public String showPaymentRecordForUser() {
		try {
			System.out.println("Show Payment Action");
			int userId = (int) session().getAttribute("userid");
			paymentRecordList = paymentManager.showPaymentRecord(userId);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	
	public String showPaymentRecordForWaiter() {
		try {
			System.out.println("Show Payment Action");
			paymentRecordList = paymentManager.showPaymentRecord();
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
