package com.projetoxbrain.vendavendedores.services;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoxbrain.vendavendedores.entities.Vendedor;
import com.projetoxbrain.vendavendedores.repositories.VendedorRepository;

@Service
public class VendedorService {
	
	@Autowired
	private VendedorRepository vendedorRepository;
	
	public List<Vendedor> mostrarVendedor(LocalDate datainicio, LocalDate datafim) {
		Long dias = calcularDias(datainicio, datafim);
		List<Object[]> resultado = vendedorRepository.recuperaVendedor(datainicio, datafim);
		List<Vendedor> vendedores = new ArrayList<Vendedor>();
		for (Object[] obj : resultado) {
	        Long vendasCount = (Long) obj[2];
	        Float vendasPorDia = (float) vendasCount / dias;

	        Vendedor vendedor = new Vendedor();
	        vendedor.setId((Long) obj[0]);
	        vendedor.setNome((String) obj[1]);
	        vendedor.setTotalVendas(vendasCount);
	        vendedor.setMediaVendasDia(vendasPorDia);

	        vendedores.add(vendedor);
	    }
		return vendedores;
	}
	
	public Long calcularDias(LocalDate dataInicio, LocalDate dataFim) {
		Long dias = ChronoUnit.DAYS.between(dataInicio, dataFim) + 1;
		return dias;
	}


	
	
	
	





}
