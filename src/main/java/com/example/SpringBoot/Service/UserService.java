package com.example.SpringBoot.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBoot.Dto.UserLocationDTO;
import com.example.SpringBoot.Repository.UserRepository;
import com.example.SpringBoot.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<UserLocationDTO> getAllUsersLocation() {
		return userRepository.findAll()
				.stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}
			public UserLocationDTO convertEntityToDto(User user) {
			UserLocationDTO userLocationDTO = new UserLocationDTO();
			userLocationDTO.setUserId(user.getId());
			userLocationDTO.setEmail(user.getEmail());
			userLocationDTO.setPlace(user.getLocation().getPlace());
			userLocationDTO.setLongitude(user.getLocation().getLongitude());
			userLocationDTO.setLatitude(user.getLocation().getLatitude());
			return userLocationDTO;
		}
		
	}
