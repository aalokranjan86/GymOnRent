package com.example.gymOnRent.gymDto;

import com.example.gymOnRent.gymBo.UserLogInBo;

public class UserSignUpDto {

	private String Name;
	private String Email;
	private String userName;
	private String Password;
	private String Gender;
	private UserLogInBo userLogin;
	
	public UserSignUpDto() {
		
	}
	
	public UserLogInBo getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(UserLogInBo userLogin) {
		this.userLogin = userLogin;
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

