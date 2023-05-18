package com.projetoxbrain.vendavendedores.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.projetoxbrain.vendavendedores.entities.Venda;
import com.projetoxbrain.vendavendedores.entities.Vendedor;
import com.projetoxbrain.vendavendedores.repositories.VendedorRepository;

@Service
public class VendedorService {
	@Autowired
	private VendedorRepository vendedorRepository;
	
	public List<Venda> findVendasBetweenDates(LocalDate datainicio, LocalDate datafim) {
		List<Venda>vendedoraux = vendedorRepository.findVendasBetweenDates(datainicio, datafim);
		return vendedoraux;
	}


	
	
	
	





}
