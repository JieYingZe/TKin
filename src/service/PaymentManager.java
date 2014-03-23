package service;

import java.util.ArrayList;

import forms.PaymentRecordForm;


public interface PaymentManager {

	public void newPayment(int userid, PaymentRecordForm paymentRecordForm);
	
	public ArrayList<PaymentRecordForm> showPaymentRecord();
	
	public ArrayList<PaymentRecordForm> showPaymentRecord(int userId);

}

