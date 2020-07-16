package com.example.gymOnRent.gymDto;

import java.util.List;

import com.example.gymOnRent.gymBo.UserCartBo;
import com.example.gymOnRent.gymBo.UserOrderHistoryBo;
import com.example.gymOnRent.gymBo.UserPaymentBo;


public class UserLogInDto {

	private String Email;
	private String userName;
	private String Password;
	private UserCartBo usercart;
	private List<UserPaymentBo> userPayment;
	private UserOrderHistoryBo orderHistory;
	
	public UserLogInDto() {
		
	}

	public UserCartBo getUsercart() {
		return usercart;
	}

	public void setUsercart(UserCartBo usercart) {
		this.usercart = usercart;
	}

	public List<UserPaymentBo> getUserPayment() {
		return userPayment;
	}

	public void setUserPayment(List<UserPaymentBo> userPayment) {
		this.userPayment = userPayment;
	}

	public UserOrderHistoryBo getOrderHistory() {
		return orderHistory;
	}

	public void setOrderHistory(UserOrderHistoryBo orderHistory) {
		this.orderHistory = orderHistory;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	
}

