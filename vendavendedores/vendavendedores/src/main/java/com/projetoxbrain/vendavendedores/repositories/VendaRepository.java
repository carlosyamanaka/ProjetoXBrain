package com.projetoxbrain.vendavendedores.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projetoxbrain.vendavendedores.entities.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long>{
	
//	@Query("SELECT COUNT(v) FROM Venda v WHERE v.vendedorId = id")
//	public Long countVendedorByVendaId(Long id);
}
