package br.com.devfast.google.finance.consult;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import br.com.devfast.google.finance.classes.CurrencyQuoteRS;
import br.com.devfast.google.finance.enums.Currency;

public class ConsultGoogleFinance {
	
	private static CurrencyQuoteRS exchangeCurrencyRequest(Currency baseCurrency, Currency quoteCurrency){
		
		try {
			
			String url = "https://finance.google.com/finance/converter?a=1&from=" 
					+ baseCurrency.getCode() + "&to=" 
					+ quoteCurrency.getCode() + "&meta=ei%3D1q4JWuDcKpS6e6DKjOgL";
			
			Document doc = Jsoup.connect(url).get();
			Elements span = doc.select("div[id=currency_converter_result] > span.bld");
			String parsedNumber = span.get(0).ownText().replaceAll("[^0-9.]", "").trim();
			return new CurrencyQuoteRS(baseCurrency, quoteCurrency, Double.parseDouble(parsedNumber));
			
		} catch (Exception e) {
			return null;
		}
		
	}
	
	public static CurrencyQuoteRS exchangeCurrency(Currency baseCurrency){
		return exchangeCurrencyRequest(baseCurrency, Currency.BRL);
	}
	
	public static CurrencyQuoteRS exchangeCurrency(Currency baseCurrency, Currency quoteCurrency){
		return exchangeCurrencyRequest(baseCurrency, quoteCurrency);
	}

}
