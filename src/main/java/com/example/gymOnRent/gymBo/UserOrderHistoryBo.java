package com.example.gymOnRent.gymBo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderhistory")
public class UserOrderHistoryBo {
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name="userid")
	  private int orderId;
	  
	  @Column(name="serialnumber")
	  private int serialNumber;
	  
	  @Column(name="productname")
	  private String productName;
	  
	  @Column(name="totalprice")
	  private int totalPrice;

	  public UserOrderHistoryBo() {
		  
	  }
	  
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
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
