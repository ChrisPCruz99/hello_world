package org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Informa que é um controller
@RequestMapping("/entregaEx") //Informa o endereço da web
public class entregaEx {
	@GetMapping //Pega informação do método e exibe
	public String hello() {
		return "Hello World!";
	}
	public class metodosController {
		String ment [] = {"COMUNICAÇÃO","MENTALIDADE DE CRESCIMENTO","ORIENTAÇÃO AO DETALHE",
				"ORIENTAÇÃO AO FUTURO","PERSISTÊNCIA","PROATIVIDADE","RESPONSABILIDADE PESSOAL",
				"TRABALHO EM EQUIPE"},saida="";
		
		@GetMapping //Pega informação do método e exibe
		public String mentalidades() {
			for(String mentalidade : ment) {
				saida += mentalidade+"<br/>";
			}	
				return saida;
			}
		@GetMapping //Pega informação do método e exibe
		public String hello() {
			return "Aprender as funções do STS, entender melhor as bibliotecas"
					+ "e trabalhar no projeto integrador.";	
				}
	}