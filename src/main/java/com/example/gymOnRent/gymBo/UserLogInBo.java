package com.example.gymOnRent.gymBo;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="login")
public class UserLogInBo {
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name="userid")
	  private int userId;

	  @Column(name="email")
	  private String Email;
	  
	  @Column(name="username")
	  private String userName;
	  
	  @Column(name="password")
	  private String Password;
	  
	  @OneToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name="userid", referencedColumnName = "userid", nullable = true) 
	  private UserCartBo usercart;
	  
	  @OneToMany(cascade = CascadeType.ALL)
	  @JoinColumn(name = "userid", referencedColumnName = "userid", nullable = true)
	  private List<UserPaymentBo> userPayment;
	  
	  @OneToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name = "userid", referencedColumnName = "userid", nullable = true,insertable=false, updatable=false)
	  private UserOrderHistoryBo orderHistory;
	  
      public UserLogInBo() {
		  
	   } 
	  
	  public UserOrderHistoryBo getOrderHistory() {
		return orderHistory;
	}

	public void setOrderHistory(UserOrderHistoryBo orderHistory) {
		this.orderHistory = orderHistory;
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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
