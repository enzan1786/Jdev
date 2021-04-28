package com.green.jdev010.CoffeeMintClient.Controller.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.green.jdev010.CoffeeMintClient.dao.UserRepository;

public class UserDtailServiceImpl implements UserDetailsService {
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		User user = UserRepository.GetUserbyUsername(username);
		return null;
	}

}
