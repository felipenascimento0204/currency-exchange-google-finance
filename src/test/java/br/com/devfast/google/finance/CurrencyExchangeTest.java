package br.com.devfast.google.finance;

import org.junit.Assert;
import org.junit.Test;

import br.com.devfast.google.finance.classes.CurrencyQuoteRS;
import br.com.devfast.google.finance.consult.ConsultGoogleFinance;
import br.com.devfast.google.finance.enums.Currency;
import br.com.devfast.google.finance.util.PrintCurrencyQuote;
public class CurrencyExchangeTest {
	
	@Test
	public void currencyExchangeTest(){
		CurrencyQuoteRS quote = ConsultGoogleFinance.exchangeCurrency(Currency.USD, Currency.BRL);
		Assert.assertNotNull(quote);
		PrintCurrencyQuote.print(quote);
	}
	
	@Test
	public void currencyExchangeQuoteAmountTest(){
		CurrencyQuoteRS quote = ConsultGoogleFinance.exchangeCurrency(Currency.USD, Currency.BRL, 10.00);
		Assert.assertNotNull(quote);
		PrintCurrencyQuote.print(quote);
	}

}
