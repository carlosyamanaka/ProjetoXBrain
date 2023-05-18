package com.projetoxbrain.vendavendedores.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.projetoxbrain.vendavendedores.entities.Venda;
import com.projetoxbrain.vendavendedores.entities.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Long>{
	@Query("SELECT vendedor.nome, COUNT(venda) AS totalVendas " +
	           "FROM Vendedor vendedor " +
	           "WHERE venda.datavenda >= :dataInicial AND venda.datavenda <= :dataFinal " +
	           "GROUP BY vendedor.nome")
	    List<Venda> findVendasBetweenDates(@Param("dataInicial") LocalDate dataInicial, @Param("dataFinal") LocalDate dataFinal);
}
