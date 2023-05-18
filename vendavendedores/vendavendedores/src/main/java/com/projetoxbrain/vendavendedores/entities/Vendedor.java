package com.projetoxbrain.vendavendedores.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "tb_vendedor")
public class Vendedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome")
	private String nome;
	@Transient
	private Long totalVendas;
	@Transient
	private float mediaVendasDia;

	public Vendedor() {
	}
	
	public float getMediaVendasDia() {
		return mediaVendasDia;
	}

	public void setMediaVendasDia(float mediaVendasDia) {
		this.mediaVendasDia = mediaVendasDia;
	}

	public Long getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(Long totalVendas) {
		this.totalVendas = totalVendas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
