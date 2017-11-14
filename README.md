# currency-exchange-google-finance
Simple Java Project for currency exchange by Google Finance

* Projeto Java simples para cotação de moedas atravé do Google Finance

# Usage

#### Simple Quote
```java
//execute Google Finance simple request 
CurrencyQuoteRS quote = ConsultGoogleFinance.exchangeCurrency(Currency.USD, Currency.BRL);
```

#### Amount Quote
```java
//execute Google Finance amount request 
CurrencyQuoteRS amountQuote = ConsultGoogleFinance.exchangeCurrency(Currency.USD, Currency.BRL, 10.00);
```

#### Print Quote
```java
PrintCurrencyQuote.print(quote);
/*
Result..
BRL 3.3092
USD 1.0
EXCHANGE RATE: 3.3092
QUOTE DATE: 14/11/2017 17:51
*/
```
