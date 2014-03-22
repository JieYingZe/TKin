package forms;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class PaymentRecordForm implements Serializable{

	private static final long serialVersionUID = -373427254802229742L;

	private int paymentId;
	private Timestamp time;
	private BigDecimal money;
	
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
	
}
