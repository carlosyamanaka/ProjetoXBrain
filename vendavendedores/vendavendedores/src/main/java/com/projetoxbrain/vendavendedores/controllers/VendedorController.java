package com.projetoxbrain.vendavendedores.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projetoxbrain.vendavendedores.entities.Venda;
import com.projetoxbrain.vendavendedores.entities.Vendedor;
import com.projetoxbrain.vendavendedores.services.VendedorService;

@RestController
@RequestMapping(value = "/vendedores")
public class VendedorController {
	
	@Autowired
	private VendedorService service;
	
	//Exemplo de get para ser colocado no postman
	//http://localhost:8080/vendedores?dataInicio=2023-05-12&dataFim=2023-05-12
	
	@GetMapping
	public List<Vendedor> findByData(@RequestParam("dataInicio") LocalDate dataInicio, 
            					  @RequestParam("dataFim") LocalDate dataFim){
		List<Vendedor> result = service.mostrarVendedor(dataInicio, dataFim);
		return result;
	}
}
