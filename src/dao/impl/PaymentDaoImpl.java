package dao.impl;

import java.util.ArrayList;

import model.PaymentRecord;
import model.User;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.PaymentDao;

public class PaymentDaoImpl extends HibernateDaoSupport implements PaymentDao {

	@Override
	public void saveObject(Object obj) throws HibernateException {
		getHibernateTemplate().save(obj);
	}
	
	@Override
	public void updateObject(Object obj) throws HibernateException {
		getHibernateTemplate().update(obj);
	}
	
	@Override
	public ArrayList<PaymentRecord> getAllPaymentRecord() throws HibernateException{
		String hql = "from PaymentRecord";
		@SuppressWarnings("unchecked")
		ArrayList<PaymentRecord> paymentRecordList =(ArrayList<PaymentRecord>) getHibernateTemplate().find(hql);
		return paymentRecordList;
	}

	@Override
	public PaymentRecord getPaymentRecordById(int paymentId) {
		PaymentRecord paymentRecord = (PaymentRecord) getHibernateTemplate().get(PaymentRecord.class, paymentId);
		return paymentRecord;
	}

	@Override
	public ArrayList<PaymentRecord> getPaymentRecord(User user) {
		String hql = "from PaymentRecord pr where pr.user=?";
		@SuppressWarnings("unchecked")
		ArrayList<PaymentRecord> paymentRecordList =(ArrayList<PaymentRecord>) getHibernateTemplate().find(hql,user);
		return paymentRecordList;
	}

}
