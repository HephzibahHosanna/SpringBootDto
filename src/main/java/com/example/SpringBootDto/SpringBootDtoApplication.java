package com.example.SpringBootDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.SpringBoot.Repository.LocationRepository;
import com.example.SpringBoot.Repository.UserRepository;
import com.example.SpringBoot.model.Location;
import com.example.SpringBoot.model.User;

@SpringBootApplication
public class SpringBootDtoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDtoApplication.class, args);
	}

	@Autowired(required = true)
	private UserRepository userRepository;
	
	@Autowired(required = true)
	private LocationRepository locationRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Location location = new Location();
		location.setPlace("Coimbatore");
		location.setDescription("CBE is a great place to live");
		location.setLongitude(40.5);
		location.setLatitude(30.6);
		locationRepository.save(location);
		
		User user1 = new User();
		user1.setFirstName("Vincy");
		user1.setLastName("Ekkleshiah");
		user1.setEmail("vincy28@gmail.com");
		user1.setPassword("vincy123");
		user1.setLocation(location);
		userRepository.save(user1);
		
		User user2 = new User();
		user2.setFirstName("Angel");
		user2.setLastName("Rebecca");
		user2.setEmail("Angel14@gmail.com");
		user2.setPassword("angel123");
		user2.setLocation(location);
		userRepository.save(user2);
		
	}

}
