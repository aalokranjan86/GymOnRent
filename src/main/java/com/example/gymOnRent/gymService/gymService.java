package com.example.gymOnRent.gymService;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gymOnRent.gymBo.UserSignUpBo;
import com.example.gymOnRent.gymDao.gymDao;
import com.example.gymOnRent.gymDto.UserSignUpDto;



@Service
@Transactional
public class gymService implements gymServiceInt {

	@Autowired
    private ModelMapper modelMapper;
	
	gymDao gym;
	
	@Autowired
	public gymService(gymDao gd) {
		gym=gd;
	}
	
	@Override
	public List<UserSignUpDto> getDetails() {
		List<UserSignUpDto> abc = new ArrayList();
		List<UserSignUpBo> ab = gym.getList();
		for(UserSignUpBo usub : ab) {
			UserSignUpDto usb = convertToDto(usub);
			abc.add(usb);
		}
		
		return abc;
	}

	public String  validation(UserSignUpDto to) 
	{
		List<Object[]> data = gym.getNameAndPassword();
		Object[] data1;
		for(Object[] data2:data)
		{
			if(data2[0].equals(to.getName()))
			 break;
			else if(data2[1].equals(to.getPassword()) )
				break;
		}
		return "alredy exist";
		
		
	}
		
	
	
	@Override
	public UserSignUpBo find(int id) {
		return gym.find(id);
	}

	@Override
	public UserSignUpDto saveDetail(UserSignUpDto user) {
		UserSignUpBo ab = convertToBo(user);
		UserSignUpBo abc = gym.saveDetail(ab);
		return convertToDto(abc);
	}

	@Override
	public void deleteDetail(int userid) {
		UserSignUpBo ab = gym.find(userid);
		modelMapper.map(ab, UserSignUpDto.class);
		gym.deleteDetail(userid);
		
	}
	
	
	
	public UserSignUpDto convertToDto(UserSignUpBo model) {
		UserSignUpDto data = modelMapper.map(model, UserSignUpDto.class);
		return data;
	}
	
	public UserSignUpBo convertToBo(UserSignUpDto mod) {
		UserSignUpBo post = modelMapper.map(mod, UserSignUpBo.class);
		return post;
	}

}
