package com.projetoxbrain.vendavendedores.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoxbrain.vendavendedores.entities.Vendedor;
import com.projetoxbrain.vendavendedores.repositories.VendedorRepository;

@Service
public class VendedorService {
	@Autowired
	private VendedorRepository vendedorRepository;
	
//	public int calcularMediaVendas(Vendedor v1, int dias){
//		return v1.getTotalVendas()/dias;
//	}
}
