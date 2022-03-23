package com.microservice.diagonosis.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pathology")
public class PathologyController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ResponseEntity<?> sayHelloPath(){
		
		return ResponseEntity.ok().body("Hello ZUUL API, this is from Pathology Controller");
	}
	
	@RequestMapping(value = "/again-hello", method = RequestMethod.GET)
	public ResponseEntity<?> sayHelloAgainPath(){
		
		return ResponseEntity.ok().body("Hello ZUUL API, this is from Pathology Controller Again, how are you?");
	}

}
