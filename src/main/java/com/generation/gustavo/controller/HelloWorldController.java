package com.generation.gustavo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Web")
public class HelloWorldController {
	@GetMapping("/hello")
	public String helloworld() {
		return "hello World!!";
	}
	@GetMapping("/bsn")
	public String [] bsn(){
		String [] bsn = {
				"Orientação ao detalhe",
				"Comunicação",
				"Orientção ou futuro",
				"Percistencia",
				"Proatividade"
		};
		return bsn;
	}
	@GetMapping("/obj")
	public String [] obj() {
		String [] obj = {
			"Ter foco total em java",
			"Aprender uma nova linguagem ",
			"Enterder mais sobro o beck"
		};
		return obj;
	}
}
