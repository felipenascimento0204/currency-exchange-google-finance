package br.com.devfast.google.finance.classes;

import java.util.Date;

import br.com.devfast.google.finance.enums.Currency;

public class CurrencyQuoteRS {
	
	private Currency baseCurreny;
	private Currency quoteCurrency;
	private double baseRate;
	private double quoteRate;
	private Date date;
	
	public CurrencyQuoteRS(Currency baseCurreny, Currency quoteCurrency, double baseRate) {
		this.baseCurreny = baseCurreny;
		this.quoteCurrency = quoteCurrency;
		this.baseRate = baseRate;
		this.quoteRate = 1.0;
		this.date = new Date();
	}

	public Currency getBaseCurrency() {
		return baseCurreny;
	}

	public Currency getQuoteCurrency() {
		return quoteCurrency;
	}

	public double getBaseRate() {
		return baseRate;
	}

	public double getQuoteRate() {
		return quoteRate;
	}

	public Date getDate() {
		return date;
	}

}
