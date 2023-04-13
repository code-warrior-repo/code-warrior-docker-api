package org.codewarrior.docker.controller;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CodeWarriorDockerApiRestController {

	@GetMapping("/ping")
	public ResponseEntity<String> getPing() {
		
		return ResponseEntity.ok("Today's date - " +  String.valueOf(new Date()) );
	}
	
}
