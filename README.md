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
