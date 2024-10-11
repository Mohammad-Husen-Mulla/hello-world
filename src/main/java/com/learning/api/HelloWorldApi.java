package com.learning.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldApi {

	@GetMapping("/")
	public ResponseEntity<String> helloWorld(){
		return ResponseEntity.ok("Hello-World!");
	}
}
