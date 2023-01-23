package org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Informa que é um controller
@RequestMapping("/HelloWorld") //Informa o endereço da web
public class helloController {
	@GetMapping //Pega informação do método e exibe
	public String hello() {
		return "Hello World!";	
	}
}