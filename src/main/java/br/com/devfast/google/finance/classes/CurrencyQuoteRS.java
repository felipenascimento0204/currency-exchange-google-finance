package br.com.devfast.google.finance.classes;

import br.com.devfast.google.finance.enums.Currency;

public class CurrencyQuoteRS {
	
	private Currency moedaBase;
	private Currency moedaCotacao;
	private double taxaCambioBase;
	private double taxaCambioCotacao;
	
	public CurrencyQuoteRS(Currency moedaBase, Currency moedaCotacao, double taxaCambioBase) {
		this.moedaBase = moedaBase;
		this.moedaCotacao = moedaCotacao;
		this.taxaCambioBase = taxaCambioBase;
		this.taxaCambioCotacao = 1.0;
	}

	public Currency getMoedaBase() {
		return moedaBase;
	}

	public Currency getMoedaCotacao() {
		return moedaCotacao;
	}

	public double getTaxaCambioBase() {
		return taxaCambioBase;
	}

	public double getTaxaCambioCotacao() {
		return taxaCambioCotacao;
	}

}
