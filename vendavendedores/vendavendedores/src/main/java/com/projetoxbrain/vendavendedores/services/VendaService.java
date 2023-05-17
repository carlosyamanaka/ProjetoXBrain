package com.projetoxbrain.vendavendedores.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.projetoxbrain.vendavendedores.entities.Venda;
import com.projetoxbrain.vendavendedores.entities.Vendedor;
import com.projetoxbrain.vendavendedores.repositories.VendaRepository;
import com.projetoxbrain.vendavendedores.repositories.VendedorRepository;

@Service
public class VendaService {
	
	@Autowired
	private VendaRepository vendaRepository;
	
	public List<Venda> findAll() {
		return vendaRepository.findAll();
	}

	public Venda save(Venda venda) {
		Venda result = vendaRepository.save(venda);
		return result;
	}

	
}
