package com.example.gymOnRent.gymBo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="signup")
public class UserSignUpBo {

	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name="userid")
	  private int userId;
	 
	  @Column(name="name")
	  private String Name;
	  
	  @Column(name="email")
	  private String Email;
	  
	  @Column(name="username")
	  private String userName;
	  
	  @Column(name="password")
	  private String Password;
	  
	  @Column(name="gender")
	  private String Gender;

	  @OneToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name="userid", referencedColumnName = "userid", nullable = true) 
	  private UserLogInBo userLogin;
	  
	public UserSignUpBo() {
		  
	  }
	
	 public UserLogInBo getUserLogin() {
			return userLogin;
		}

		public void setUserLogin(UserLogInBo userLogin) {
			this.userLogin = userLogin;
		}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
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

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}
}

