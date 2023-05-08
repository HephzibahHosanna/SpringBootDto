package com.example.SpringBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot.Dto.UserLocationDTO;
import com.example.SpringBoot.Service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/users_location")
	public List<UserLocationDTO> getAllUsersLocation() {
		return userService.getAllUsersLocation();
	}
	
}
