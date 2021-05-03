package com.green.jdev010.CoffeeMintClient.Controller.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.green.jdev010.CoffeeMintClient.dao.UserRepository;
import com.green.jdev010.CoffeeMintClient.helpers.AppString;
import com.green.jdev010.CoffeeMintClient.models.User;

public class UserDtailServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.getUserByUsername(username);
		
		if (user == null) {
			throw new UsernameNotFoundException(AppString.usernameNotFound);
		}
		
		
		return null;
	}


}
