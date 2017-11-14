package br.com.devfast.google.finance.util;

import br.com.devfast.google.finance.classes.CurrencyQuoteRS;

public class PrintCurrencyQuote {
	
	public static void print(CurrencyQuoteRS quote){
		if(quote != null){
			StringBuilder sb = new StringBuilder();
			sb.append(quote.getQuoteCurrency().getCode() + " " +quote.getQuoteRate()+"\n");
			sb.append(quote.getBaseCurrency().getCode() + " " +quote.getBaseRate()+"\n");
			System.out.println(sb.toString());
		} else {
			System.out.println("não foi possível realizar uma cotação");
		}
	}

}
