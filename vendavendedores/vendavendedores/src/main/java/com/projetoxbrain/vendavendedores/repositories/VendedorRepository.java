package com.projetoxbrain.vendavendedores.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.projetoxbrain.vendavendedores.entities.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Long>{
	 
	@Query("SELECT v.vendedor.id, v.vendedor.nome, COUNT(v) FROM Venda v WHERE v.datavenda >= :dataInicial AND v.datavenda <= :dataFinal GROUP BY v.vendedor.id, v.vendedor.nome")
	List<Object[]> recuperaVendedor(@Param("dataInicial") LocalDate dataInicial, @Param("dataFinal") LocalDate dataFinal);
}
