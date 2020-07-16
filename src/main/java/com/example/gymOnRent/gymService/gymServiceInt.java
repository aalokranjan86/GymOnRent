package com.example.gymOnRent.gymService;

import java.util.List;

import com.example.gymOnRent.gymBo.UserSignUpBo;
import com.example.gymOnRent.gymDto.UserSignUpDto;


public interface gymServiceInt {

	public List<UserSignUpDto> getDetails();
	public UserSignUpBo find(int id);
	public UserSignUpDto saveDetail(UserSignUpDto user);
	public void deleteDetail(int userid);
}
