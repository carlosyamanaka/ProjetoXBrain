package com.projetoxbrain.vendavendedores.repositories;	

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoxbrain.vendavendedores.entities.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long> {
}

