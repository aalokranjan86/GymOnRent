package com.example.gymOnRent.gymDto;

public class UserPaymentDto {

	 private int cardNumber;
	 private int expiryDate;
	 private String Name;
	 private String Cvv;
	 
	 public UserPaymentDto() {
		 
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
