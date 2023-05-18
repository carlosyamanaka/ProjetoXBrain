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
	
	@GetMapping
	public List<Venda> findByData(@RequestParam("dataInicio") LocalDate dataInicio, 
            					  	 @RequestParam("dataFim") LocalDate dataFim){
		List<Venda> result = service.findVendasBetweenDates(dataInicio, dataFim);
		return result;
	}
}
