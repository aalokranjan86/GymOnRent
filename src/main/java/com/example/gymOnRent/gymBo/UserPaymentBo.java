package com.example.gymOnRent.gymBo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paymentdetails")
public class UserPaymentBo {

	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name="userid")
	  private int userId;
	  
	  @Column(name="cardnumber")
	  private int cardNumber;
	  
	  @Column(name="expirydate")
	  private int expiryDate;
	  
	  @Column(name="name")
	  private String Name;
	  
	  @Column(name="cvv")
	  private String Cvv;
	  
	  public UserPaymentBo() {
		  
	  }

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(int expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCvv() {
		return Cvv;
	}

	public void setCvv(String cvv) {
		Cvv = cvv;
	}
	  
	  
}