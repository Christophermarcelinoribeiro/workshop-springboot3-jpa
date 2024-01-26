package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Yasmin Soares", "yasmin2323@gmail.com", "5344456", "123seila");
		return ResponseEntity.ok().body(u);
	}
}
