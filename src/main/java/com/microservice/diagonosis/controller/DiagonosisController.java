package com.microservice.diagonosis.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/diagonosis")
public class DiagonosisController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ResponseEntity<?> sayHelloDiag(){
		
		return ResponseEntity.ok().body("Hello ZUUL API, this is from Diagonosis Controller");
	}
	
	@RequestMapping(value = "/again-hello", method = RequestMethod.GET)
	public ResponseEntity<?> sayHelloAgainDiag(){
		
		return ResponseEntity.ok().body("Hello ZUUL API, this is from Diagonosis Controller Again, how are you?");
	}

}
