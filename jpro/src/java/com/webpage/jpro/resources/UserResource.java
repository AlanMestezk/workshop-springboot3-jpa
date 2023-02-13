package com.webpage.jpro.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webpage.jpro.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	
	@GetMapping
	
	public ResponseEntity<User> findAll(){
		
		User u = new User(12L, "Alan", "alan@mail.com", "4002-8922", "senh@1234");
		
		return ResponseEntity.ok().body(u);
	}
	
}
