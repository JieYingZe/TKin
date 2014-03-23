package action;

import java.math.BigDecimal;

import forms.PaymentRecordForm;
import service.PaymentManager;

public class PayAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private PaymentRecordForm paymentRecord;
	private PaymentManager paymentManager;

	public PaymentRecordForm getPaymentRecord() {
		return paymentRecord;
	}

	public void setPaymentRecord(PaymentRecordForm paymentRecord) {
		this.paymentRecord = paymentRecord;
	}
	
	public void setPaymentManager(PaymentManager paymentManager) {
		this.paymentManager = paymentManager;
	}

	public String activeMember() {
		try {
			System.out.println("Pay Action");
			int userId = (int) session().getAttribute("userid");
			paymentRecord.setMoney(new BigDecimal(80.00));
			paymentManager.newPayment(userId, paymentRecord);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
