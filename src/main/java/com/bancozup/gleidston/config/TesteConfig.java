package com.bancozup.gleidston.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.bancozup.gleidston.entities.User;
import com.bancozup.gleidston.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
	
	
	@Autowired
    private UserRepository userRepository ;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(0, "Maria Brown", "maria@gmail.com", "123.123.123-33", "22/05/1979", "123456", "3654", "21/01/2021");
		User u2 = new User(0, "Alex Green", "alex@gmail.com", "333.333.333-45", "22/08/1985", "123456", "3654", "22/01/2021"); 
		
		userRepository.saveAll(Arrays.asList(u1,u2));

	}
	
}
