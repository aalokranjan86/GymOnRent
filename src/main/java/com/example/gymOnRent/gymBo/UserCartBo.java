package com.example.gymOnRent.gymBo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usercart")
public class UserCartBo {
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name="userid")
	  private int cartId;
	  
	  @Column(name="serialnumber")
	  private int serialNumber;
	  
	  @Column(name="productname")
	  private String productName;
	  
	  @Column(name="productprice")
	  private int productPrice;
	  
	  public UserCartBo() {
		  
	  }

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
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

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
}
