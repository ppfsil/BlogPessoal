package com.generation.helloworld.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ObjetivAprend")

public class ObjetivAprendController {

	@GetMapping
	public ArrayList ObjetivList() { // Método para Listar as BSM

		ArrayList<String> objetivList = new ArrayList<String>(); // Coloco as Array(Lista) dentro

		objetivList.add("Segunda --- DB - MYSQL2 - Creating Relational Database with MYSQL");
		objetivList.add("Terça --- DB - MYSQL3 - Introduction to SQL");
		objetivList.add("Terça --- DB - MYSQL4 - Advanced SQL - Joing Tables");
		objetivList.add("Quarta --- SA-PI-T2 - Prototipando o Banco de Dados");
		objetivList.add("Quinta --- Web-Java1 - Introduction to Web Development using Java and Spring Boot");
		objetivList.add("Quinta --- Mentalidade de Crescimento");
		objetivList.add("Sexta --- Web-Java2 - Dependencies Injection using Spring Framework");

		return objetivList;
	}
}
