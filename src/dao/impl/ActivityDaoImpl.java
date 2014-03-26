package dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import model.Activity;
import model.ActivityRecord;
import model.User;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.ActivityDao;

public class ActivityDaoImpl extends HibernateDaoSupport implements ActivityDao {

	@Override
	public void saveObject(Object obj) throws HibernateException {
		getHibernateTemplate().save(obj);
	}
	
	@Override
	public void updateObject(Object obj) throws HibernateException {
		getHibernateTemplate().update(obj);
	}
	
	@Override
	public ArrayList<Activity> getAllActivity() throws HibernateException{
		String hql = "from Activity";
		@SuppressWarnings("unchecked")
		ArrayList<Activity> activityList =(ArrayList<Activity>) getHibernateTemplate().find(hql);
		return activityList;
	}

	@Override
	public Activity getActivityById(int activityId) {
		Activity activity = (Activity) getHibernateTemplate().get(Activity.class, activityId);
		return activity;
	}

	@Override
	public ArrayList<ActivityRecord> getActivityRecord(User user) {
		String hql = "from ActivityRecord ar where ar.user=?";
		@SuppressWarnings("unchecked")
		ArrayList<ActivityRecord> activityRecordList =(ArrayList<ActivityRecord>) getHibernateTemplate().find(hql,user);
		return activityRecordList;
	}

	@Override
	public Map<String, Long> getGroupCountByAttr(String attr) {
		String hql = "select a." + attr + ", COUNT(*) from Activity a group by a." + attr;
		@SuppressWarnings("unchecked")
		List<Object[]> countList = getHibernateTemplate().find(hql);
		
		Map<String, Long> countMap = new HashMap<String, Long>();
		for (Object[] countListItem : countList) {
			countMap.put((String) countListItem[0], (Long) countListItem[1]);
		}
		return countMap;
	}

	@Override
	public Map<String, Long> getPeopleCountMonthly() {
		String hql = "select year(ar.activity.startTime), month(ar.activity.startTime), COUNT(*) from ActivityRecord ar group by year(ar.activity.startTime),  month(ar.activity.startTime) order by year(ar.activity.startTime) ASC,  month(ar.activity.startTime) ASC";
		@SuppressWarnings("unchecked")
		List<Object[]> countList = getHibernateTemplate().find(hql);
		
		Map<String, Long> countMap = new LinkedHashMap<String, Long>();
		for (Object[] countListItem : countList) {
			countMap.put((countListItem[0].toString() + "," + countListItem[1].toString()), (Long) countListItem[2]);
		}
		return countMap;
	}

	@Override
	public Map<String, Long> getPeopleCountDaily() {
		String hql = "select year(ar.activity.startTime), month(ar.activity.startTime), day(ar.activity.startTime), COUNT(*) from ActivityRecord ar group by year(ar.activity.startTime),  month(ar.activity.startTime), day(ar.activity.startTime) order by year(ar.activity.startTime) ASC,  month(ar.activity.startTime) ASC, day(ar.activity.startTime) ASC";
		@SuppressWarnings("unchecked")
		List<Object[]> countList = getHibernateTemplate().find(hql);
		Map<String, Long> countMap = new LinkedHashMap<String, Long>();
		for (Object[] countListItem : countList) {
			countMap.put((countListItem[0].toString() + "," + countListItem[1].toString() + "," + countListItem[2]), (Long) countListItem[3]);
		}
		return countMap;
	}
}
