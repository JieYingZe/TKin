package action;

import service.PaymentManager;

public class AutoPayAction {
	private PaymentManager paymentManager;

	public void setPaymentManager(PaymentManager paymentManager) {
		this.paymentManager = paymentManager;
	}

	public void autoPayMonthly() {
		try {
			System.out.println("Auto Pay Action");
			paymentManager.autoPayMonthly();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
