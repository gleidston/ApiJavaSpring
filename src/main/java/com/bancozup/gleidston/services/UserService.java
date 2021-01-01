package com.bancozup.gleidston.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancozup.gleidston.entities.User;
import com.bancozup.gleidston.repositories.UserRepository;

@Service
public class UserService {
@Autowired
 private UserRepository repository;
 public List<User> findall(){
	 return repository.findAll();
 }
 public User findById(long id) {
Optional<User>obj = repository.findById(id);
return obj.get();
 }
}
