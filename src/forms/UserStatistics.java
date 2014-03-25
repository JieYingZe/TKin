package forms;

import java.util.Map;

public class UserStatistics {

	private Long maleCount;
	private Long femaleCount;
	private Map<String, Long> ageGroupCount;
	private Map<String, Long> addrCount;
	private Map<String, Long> qualificationsCount;
	
	public Long getMaleCount() {
		return maleCount;
	}
	public void setMaleCount(Long maleCount) {
		this.maleCount = maleCount;
	}
	public Long getFemaleCount() {
		return femaleCount;
	}
	public void setFemaleCount(Long femaleCount) {
		this.femaleCount = femaleCount;
	}
	public Map<String, Long> getAgeGroupCount() {
		return ageGroupCount;
	}
	public void setAgeGroupCount(Map<String, Long> ageGroupCount) {
		this.ageGroupCount = ageGroupCount;
	}
	public Map<String, Long> getAddrCount() {
		return addrCount;
	}
	public void setAddrCount(Map<String, Long> addrCount) {
		this.addrCount = addrCount;
	}
	public Map<String, Long> getQualificationsCount() {
		return qualificationsCount;
	}
	public void setQualificationsCount(Map<String, Long> qualificationsCount) {
		this.qualificationsCount = qualificationsCount;
	}
}
