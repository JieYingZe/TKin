package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="paymentRecord")
public class PaymentRecord implements Serializable{

	private static final long serialVersionUID = -373427254802229742L;

	private int paymentId;
	private Timestamp time;
	private BigDecimal money;
	private User user;
	
	@Id
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	
	@ManyToOne(targetEntity=User.class, fetch=FetchType.LAZY)
	@JoinColumn(name="fk_user_userId")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	
	
	
}
