package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {

	private int userId;
	private int type;
	private String cardNo;
	private String username;
	private String password;
	private int gender;
	private String address;
	private int age;
	private int bankCardNo;
	private int qualifications;
	
	@Id
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBankCardNo() {
		return bankCardNo;
	}
	public void setBankCardNo(int bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	public int getQualifications() {
		return qualifications;
	}
	public void setQualifications(int qualifications) {
		this.qualifications = qualifications;
	}

}
