package com.edivanio.curso.boot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.edivanio.curso.boot.interfaces.CepService;
import com.edivanio.curso.boot.model.Endereco;

@RestController
public class CepRestController {

	@Autowired
	private CepService cepService;
	
	@GetMapping("/{cep}")
	public ResponseEntity<Endereco> getCep(@PathVariable String cep){
		Endereco endereco = cepService.buscaEnderecoPorCep(cep);
		return Optional.of(endereco)
				.map(e -> ResponseEntity.ok().body(e))
				.orElse(ResponseEntity.notFound().build());
	}
}
