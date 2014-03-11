package model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="family")
public class Family implements Serializable{

	private static final long serialVersionUID = -6775013992585980611L;

	private int numOfChildren;
	private User user;

	public int getNumOfChildren() {
		return numOfChildren;
	}

	public void setNumOfChildren(int numOfChildren) {
		this.numOfChildren = numOfChildren;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_user_userId",unique=true)
	@Id
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
