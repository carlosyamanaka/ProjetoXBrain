package com.projetoxbrain.vendavendedores.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoxbrain.vendavendedores.entities.Venda;
import com.projetoxbrain.vendavendedores.repositories.VendaRepository;
import com.projetoxbrain.vendavendedores.services.VendaService;

@RestController
@RequestMapping(value = "/vendas")
public class VendaController {
	
	@Autowired
	private VendaService service;
	
	@GetMapping
	public List<Venda> findall(){
		List<Venda> result = service.findAll();
		return result;
	}
	@PostMapping
	public Venda insert(@RequestBody Venda venda){
		Venda result = service.save(venda);
		return result;
	}
	
	
}
