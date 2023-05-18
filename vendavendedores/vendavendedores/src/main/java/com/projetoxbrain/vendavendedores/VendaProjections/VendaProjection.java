package com.projetoxbrain.vendavendedores.VendaProjections;

import java.time.LocalDate;

public interface VendaProjection {
	Long getId();
	LocalDate getDataVenda();
	float getValor();
}
