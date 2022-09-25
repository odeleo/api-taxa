package br.com.model;

public class TaxaDeServicoBrasil implements TaxaDeServico {

	public Double taxa(double quantia) {
		if (quantia <= 100.00) {
			return quantia * 0.2;
		}
		else {
			return quantia * 0.15;
		}
	}
}
