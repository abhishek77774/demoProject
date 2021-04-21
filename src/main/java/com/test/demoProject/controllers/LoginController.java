package com.test.demoProject.controllers;
import com.test.demoProject.Model.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.demoProject.services.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	
	  @PostMapping("/Login") 
	  public Login Login(@RequestBody Login login) 
	  {
	  return loginService.Login(login); 
	  }
	  
	  @PostMapping("/AddUser") 
	  public Login AddUser(@RequestBody Login login) 
	  {
	  return loginService.AddUser(login); 
	  }
	 

}
