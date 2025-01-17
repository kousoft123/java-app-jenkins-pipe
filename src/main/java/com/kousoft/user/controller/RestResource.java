package com.kousoft.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kousoft.user.model.User;

@Controller
public class RestResource 
{
	@RequestMapping("/api/users/me")
	public ResponseEntity<User> profile() 
	{
		//Build some dummy data to return for testing
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String email = user.getUsername() + "@howtodoinjava.com";

		User profile = new User();
		profile.setUsername(user.getUsername());
		profile.setEmail(email);

		return ResponseEntity.ok(profile);
	}
}