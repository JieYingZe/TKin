package service.impl;


import java.sql.Timestamp;
import java.util.ArrayList;

import model.PaymentRecord;
import model.User;

import org.springframework.beans.BeanUtils;

import dao.PaymentDao;
import dao.UserDao;
import forms.PaymentRecordForm;
import service.PaymentManager;

public class PaymentManagerImpl implements PaymentManager {

	private PaymentDao paymentDao;
	private UserDao userDao;
	
	public void setPaymentDao(PaymentDao paymentDao) {
		this.paymentDao = paymentDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void newPayment(int userId, PaymentRecordForm paymentRecordForm) {
		User user = userDao.getUserById(userId);
		PaymentRecord paymentRecord = new PaymentRecord();
		BeanUtils.copyProperties(paymentRecordForm, paymentRecord);
		paymentRecord.setUser(user);
		paymentRecord.setTime(new Timestamp(System.currentTimeMillis()));
		paymentDao.saveObject(paymentRecord);
	}

	@Override
	public ArrayList<PaymentRecordForm> showPaymentRecord() {
		ArrayList<PaymentRecordForm> paymentRecordFormList = new ArrayList<PaymentRecordForm>();
		ArrayList<PaymentRecord> paymentRecordList = paymentDao.getAllPaymentRecord();
		for(PaymentRecord paymentRecord:paymentRecordList){
			PaymentRecordForm paymentRecordForm = new PaymentRecordForm();
			BeanUtils.copyProperties(paymentRecord, paymentRecordForm);
			paymentRecordFormList.add(paymentRecordForm);
		}
		return paymentRecordFormList;
	}

	@Override
	public ArrayList<PaymentRecordForm> showPaymentRecord(int userId) {
		User user = userDao.getUserById(userId);
		ArrayList<PaymentRecord> paymentRecordList = paymentDao.getPaymentRecord(user);
		ArrayList<PaymentRecordForm> paymentRecordFormList = new ArrayList<PaymentRecordForm>();
		for(PaymentRecord paymentRecord : paymentRecordList){
			PaymentRecordForm paymentRecordForm = new PaymentRecordForm();
			BeanUtils.copyProperties(paymentRecord, paymentRecordForm);
			paymentRecordFormList.add(paymentRecordForm);
		}
		return paymentRecordFormList;
	}
}
