package com.bancozup.gleidston.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bancozup.gleidston.entities.User;

public interface UserRepository extends JpaRepository<User , Long> {

}
