package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // colocando isso estamos falando que essa classe é controladora (receberá
				// requisições e respostas) e na linha de baixo demos o endereço pra onde quero
				// chegar
@RequestMapping("/hello-world") // endpoint - entra no Controller por aqui - é o endereço
public class HelloWordController {

	@GetMapping // estamos falando que esse método faz parte da requisição, quando fizer o
				// método ele trará a resposta Hello World
	public String helloworld() { // classe criada que irá retornar a palavra Hello World - ação (método) quando
									// for atender essa requisição
		return "Hello World";
	}
}

