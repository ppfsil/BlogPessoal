package com.generation.helloworld.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class bsmController {

	@GetMapping
	public ArrayList bsmList() { // Método para Listar as BSM

		ArrayList<String> bsmList = new ArrayList<String>(); // Coloco as Array(Lista) dentro

		bsmList.add("Comunicação");
		bsmList.add("Persistência");
		bsmList.add("Trabalho em Equipe");
		bsmList.add("Responsabilidade Pessoal");
		bsmList.add("Proatividade");
		bsmList.add("Mentalidade de Crescimento");
		bsmList.add("Orientação ao Detalhe");
		bsmList.add("Orientação ao Futuro");

		return bsmList;
	}
}
