package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="activityRecord")
public class ActivityRecord implements Serializable{

	private static final long serialVersionUID = 2741972691682472271L;
	
	private int status;
	private User user;
	private Activity activity;
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	@Id
	@ManyToOne(targetEntity=User.class, fetch=FetchType.LAZY)
	@JoinColumn(name="fk_user_userId")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Id
	@ManyToOne(targetEntity=Activity.class, fetch=FetchType.LAZY)
	@JoinColumn(name="fk_activity_activityId")
	public Activity getActivity() {
		return activity;
	}
	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	
}
