package dao;

import java.util.ArrayList;

import model.PaymentRecord;
import model.User;

import org.hibernate.HibernateException;


public interface PaymentDao {

	public void saveObject(Object obj) throws HibernateException;
	
	public void updateObject(Object obj) throws HibernateException;
	
	public ArrayList<PaymentRecord> getAllPaymentRecord() throws HibernateException;

	public PaymentRecord getPaymentRecordById(int paymentId);

	public ArrayList<PaymentRecord> getPaymentRecord(User user);

}