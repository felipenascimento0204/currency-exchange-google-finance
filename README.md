# currency-exchange-google-finance
Simple Java Project for currency exchange by Google Finance

# Usage

#### Simple Quote
```java
//execute Google Finance request 
CurrencyQuoteRS quote = ConsultGoogleFinance.exchangeCurrency(Currency.USD, Currency.BRL);
//exchange rate
double baseRate = quote.getBaseRate();
```
#### Print Quote
```java
PrintCurrencyQuote.print(quote);
/*
Result..
BRL 1.0
USD 3.3074
QUOTE DATE: 14/11/2017 17:10
*/
```
