package forms;

import java.util.Map;

public class ClubStatistics {

	private Map<String, Long> peopleCountDaily;
	private Map<String, Long> peopleCountMonthly;
	private Map<String, Long> siteCount;
	private Map<String, Long> coachCount;
	public Map<String, Long> getPeopleCountDaily() {
		return peopleCountDaily;
	}
	public void setPeopleCountDaily(Map<String, Long> peopleCountDaily) {
		this.peopleCountDaily = peopleCountDaily;
	}
	public Map<String, Long> getPeopleCountMonthly() {
		return peopleCountMonthly;
	}
	public void setPeopleCountMonthly(Map<String, Long> peopleCountMonthly) {
		this.peopleCountMonthly = peopleCountMonthly;
	}
	public Map<String, Long> getSiteCount() {
		return siteCount;
	}
	public void setSiteCount(Map<String, Long> siteCount) {
		this.siteCount = siteCount;
	}
	public Map<String, Long> getCoachCount() {
		return coachCount;
	}
	public void setCoachCount(Map<String, Long> coachCount) {
		this.coachCount = coachCount;
	}
	
}
