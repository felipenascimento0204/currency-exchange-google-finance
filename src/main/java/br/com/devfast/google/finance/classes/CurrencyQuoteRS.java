package br.com.devfast.google.finance.classes;

import java.util.Date;

import br.com.devfast.google.finance.enums.Currency;

public class CurrencyQuoteRS {
	
	private Currency baseCurreny;
	private Currency quoteCurrency;
	private double baseAmount;
	private double quoteAmount;
	private Date date;
	
	public CurrencyQuoteRS(Currency baseCurreny, Currency quoteCurrency, double quoteAmount, double baseAmount) {
		this.baseCurreny = baseCurreny;
		this.quoteCurrency = quoteCurrency;
		this.baseAmount = baseAmount;
		this.quoteAmount = quoteAmount;
		this.date = new Date();
	}

	public Currency getBaseCurrency() {
		return baseCurreny;
	}

	public Currency getQuoteCurrency() {
		return quoteCurrency;
	}

	public double getBaseAmount() {
		return baseAmount;
	}

	public double getQuoteAmount() {
		return quoteAmount;
	}

	public Date getDate() {
		return date;
	}
	
	public double getExchangeRate(){
		return (quoteAmount/baseAmount);
	}

}
