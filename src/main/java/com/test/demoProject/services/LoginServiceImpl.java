package com.test.demoProject.services;
import com.test.demoProject.Model.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demoProject.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired 				
	private LoginDao loginDao;

	@Override
	public Login Login(Login login) {
		return loginDao.getOne(login.getUsername());
	}

	@Override
	public Login AddUser(com.test.demoProject.Model.Login login) {
		return loginDao.saveAndFlush(login);
	}

}
