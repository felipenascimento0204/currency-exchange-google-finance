package br.com.devfast.google.finance.enums;

import java.text.NumberFormat;
import java.util.Locale;

public enum Currency {
	
	ARS (0, "AR$", "AR$", new Locale("es", "AR"), "ARS", "ARS"),
	BRL (1, "R$", "R$", new Locale("pt", "BR"), "R$", "BRL"),
	USD (2, "$", "US$", new Locale("en", "US"), "USD", "USD"),
	NUC (3, "NUC", "NUC", new Locale("pt", "BR"), "NUC", "NUC"),
	EUR (4, "€", "&euro;",  new Locale("en", "GB"), "EUR", "EUR"),
	GBP (5, "£", "£", new Locale("en", "GB"), "GBP", "GBP"),	
	JPY (6, "¥", "¥", new Locale("ja", "JP"), "JPY", "JPY"),
	CNY (7, "¥", "¥", new Locale("zh", "CN"), "CNY", "CNY"),
	KHR (8, "¥", "¥", new Locale("km", "KH"), "KHR", "KHR"),
	PLN (9, "zł", "zł", new Locale("pl", "PL"), "PLN", "PLN"),
	CAD (10, "C$", "C$", new Locale("en", "CA"), "CAD", "CAD"),
	MXN (11, "$", "$", new Locale("es", "MX"), "MXN", "MXN"),
	COP (12, "$", "$", new Locale("es", "CO"), "COP", "COP"),
	AFA (13, "$", "$", new Locale("es", "AF"), "AFA", "AFA"),
	PEN (14, "$", "$", new Locale("es", "PE"), "PEN", "PEN");
	
	private final String symbol;
	private final String htmlSymbol;
	private final Locale locale;
	private final int id;
	private final String displaySymbol;
	private final String code;
	
	private Currency(int id, String symbol, String htmlSymbol, Locale locale, String displaySymbol, String code) {
		this.id = id;
		this.symbol = symbol;
		this.locale = locale;
		this.htmlSymbol = htmlSymbol;
		this.displaySymbol = displaySymbol;
		this.code = code;
	}
	
	public Locale getLocale() {
		return locale;
	}
	
	public NumberFormat getFormatter() {
		return NumberFormat.getCurrencyInstance(locale);
	}

	public String getSymbol() {
		return symbol;
	}

	public String getHtmlSymbol() {
		return htmlSymbol;
	}

	public String getDisplaySymbol() {
		return displaySymbol;
	}

	public static Currency fromCod(String simbolo) {
        for (Currency m: Currency.values()) {
            if (m.symbol.equals(simbolo)) {
                return m;
            }
        }
        throw new IllegalArgumentException(simbolo);
    }
	
	public static Currency getMoedaByCodigo(String simbolo) {
        for (Currency m: Currency.values()) {
            if (m.toString().equals(simbolo)) {
                return m;
            }
        }
        throw new IllegalArgumentException(simbolo);
    }
	
	public int getId() {
		return this.id;
	}

	public String getCode() {
		return code;
	}

	public static Currency byId(int id) {
		for (Currency e : values()) {
			if (e.getId() == id)
				return e;
		}
		throw new IllegalArgumentException("Id not found in EnumMoeda");
	}
}
