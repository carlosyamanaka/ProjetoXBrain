package com.projetoxbrain.vendavendedores.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projetoxbrain.vendavendedores.entities.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Long>{
	
}
