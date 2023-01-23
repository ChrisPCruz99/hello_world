package org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Informa que é um controller
@RequestMapping("/objetivos") //Informa o endereço da web

public class objetivosController {
	@GetMapping //Pega informação do método e exibe
	public String hello() {
		return "Aprender as funções do STS, entender melhor as bibliotecas"
				+ "e trabalhar no projeto integrador.";	
			}
}
