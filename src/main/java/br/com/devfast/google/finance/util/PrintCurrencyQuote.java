package br.com.devfast.google.finance.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.devfast.google.finance.classes.CurrencyQuoteRS;

public class PrintCurrencyQuote {
	
	public static void print(CurrencyQuoteRS quote){
		if(quote != null){
			StringBuilder sb = new StringBuilder();
			sb.append(quote.getQuoteCurrency().getCode() + " " +quote.getQuoteRate()+"\n");
			sb.append(quote.getBaseCurrency().getCode() + " " +quote.getBaseRate()+"\n");
			sb.append("QUOTE DATE: " + formatDate(quote.getDate()) + "\n");
			System.out.println(sb.toString());
		} else {
			System.out.println("não foi possível realizar uma cotação");
		}
	}
	
	private static String formatDate(Date date){
		if(date != null){
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
			return formato.format(date);	
		} else {
			return "---";
		}
	}

}
