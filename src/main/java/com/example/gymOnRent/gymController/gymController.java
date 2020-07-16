package com.example.gymOnRent.gymController;

import java.util.List;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gymOnRent.gymBo.UserSignUpBo;
import com.example.gymOnRent.gymDto.UserSignUpDto;
import com.example.gymOnRent.gymService.gymService;
import com.example.gymOnRent.gymValidator.AllValidator;


@RestController
@RequestMapping(value = "/gym")
//@CrossOrigin(origins = "*")
public class gymController {

	private gymService ser;
	
	@Autowired
	public gymController(gymService ab) {
		ser=ab;
	}
	
	@Autowired
	private AllValidator valid;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(valid);
	}
	
	@GetMapping("/getdetail")
	public List<UserSignUpDto> getList(){
		List <UserSignUpDto> usd = ser.getDetails();
		return usd;
	}
	
	@GetMapping("/find/{id}")
	public UserSignUpBo Search(@PathVariable int id) {
		return ser.find(id);
	}
	
	@PostMapping("/save")
	public String save( @RequestBody UserSignUpDto usd, Errors value) {
		if(value.hasErrors()) {
			return "Fill the Details";
		}
		UserSignUpDto us = ser.saveDetail(usd);
		return "Registered Sucessfully";
	}
	
	@DeleteMapping("/delete/{userid}")
	public String deleteDetail(@PathVariable int userid) {
		ser.deleteDetail(userid);
		return "Deleted Sucessfully " +userid;
	}
	
}
