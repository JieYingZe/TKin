package service;

import java.util.ArrayList;

import model.User;
import forms.PaymentRecordForm;


public interface PaymentManager {
	
	public void activeUser(int userId, PaymentRecordForm paymentRecordForm);

	public void newPayment(User user, PaymentRecordForm paymentRecordForm);
	
	public ArrayList<PaymentRecordForm> showPaymentRecord();
	
	public ArrayList<PaymentRecordForm> showPaymentRecord(int userId);

	public void autoPayMonthly();

}

