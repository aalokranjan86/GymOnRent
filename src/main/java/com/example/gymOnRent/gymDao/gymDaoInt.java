package com.example.gymOnRent.gymDao;

import java.util.List;

import com.example.gymOnRent.gymBo.UserSignUpBo;

public interface gymDaoInt {

	public List<UserSignUpBo> getList();
	public UserSignUpBo find(int id);
	public UserSignUpBo saveDetail(UserSignUpBo user);
	public void deleteDetail(int userid);
}
