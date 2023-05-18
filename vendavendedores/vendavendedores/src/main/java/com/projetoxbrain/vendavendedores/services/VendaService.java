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
	
	@Autowired
	private VendedorRepository vendedorRepository;
	
	public List<Venda> findAll() {
		return vendaRepository.findAll();
	}

	public Venda save(Venda venda) {
		Venda result = vendaRepository.save(venda);
		Long count = countVendasByVendedorId(venda.getVendedor().getId());
		updateTotalVendas(venda.getVendedor().getId(), count);
		return result;
	}

	public Long countVendasByVendedorId(Long id) {
        Long count = vendaRepository.countVendasByVendedorId(id);
        return count;
    }
	
	private void updateTotalVendas(Long vendedorId, Long totalVendas) {
        Vendedor vendedor = vendedorRepository.findById(vendedorId)
                .orElseThrow(() -> new RuntimeException("Vendedor não encontrado com ID: " + vendedorId));
        vendedor.setTotalVendas(totalVendas);
        vendedorRepository.save(vendedor);
    }
}
