package com.bancozup.gleidston.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancozup.gleidston.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@GetMapping
 public ResponseEntity<User> findall (){
	User u = new User(1L, "Maria", "@g", "0300", "12/2020", "cascata bairro prado ", "3022", "10/2020");
	
	return ResponseEntity.ok().body(u);
 };
}
