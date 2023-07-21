package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
	
		boolean isvalidUser=username.equalsIgnoreCase("TusharP");
		boolean isvalidPass=password.equalsIgnoreCase("1234");
		
		return isvalidUser && isvalidPass;
	
	
	}
}
