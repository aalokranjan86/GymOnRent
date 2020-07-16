package com.example.gymOnRent.gymDto;

public class UserOrderHistoryDto {

	private int serialNumber;
	private String productName;
	private int totalPrice;
	
	public UserOrderHistoryDto() {
		
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}

