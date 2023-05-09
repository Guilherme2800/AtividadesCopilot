package br.com.usto.re.copilot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EndPoints {
	
	@GetMapping("/employees")
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Hello world");
	}
	
	@PostMapping("/employees")
	public ResponseEntity<String> post(@RequestBody String texto) {
		return ResponseEntity.ok(texto);
	}
	
}
