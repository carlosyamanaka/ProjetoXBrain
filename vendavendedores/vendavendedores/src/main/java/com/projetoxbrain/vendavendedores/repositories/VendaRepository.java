package com.projetoxbrain.vendavendedores.repositories;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projetoxbrain.vendavendedores.entities.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long> {

    @Query("SELECT COUNT(v) FROM Venda v WHERE v.vendedor.id = :id")
    public Long countVendasByVendedorId(Long id);
    
}

