package com.example.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight interface - defines the common operations in a flyweight object
 */
interface CurrencySymbol {
  void display(String country);
}

/**
 * Concrete Flyweight - implements the flyweight interface and stores the state
 */
class CurrencySymbolImpl implements CurrencySymbol {

  private final String symbol;

  public CurrencySymbolImpl(String symbol) {
    this.symbol = symbol;
    System.out.println("Currency Symbol: " + symbol + " created.");
  }

  @Override
  public void display(String country) {
    System.out.println("Symbol: " + symbol + ", Country: " + country);
  }
}

/**
 * Flyweight factory - Manages the flyweight objects and ensures shared
 * instances are reused.
 */
class CurrencySymbolFactory {
  private final Map<String, CurrencySymbol> symbols = new HashMap<>();

  public CurrencySymbol getCurrencySymbol(String symbol) {
    symbols.computeIfAbsent(symbol, CurrencySymbolImpl::new);
    return symbols.get(symbol);
  }
}

/**
 * Flyweight client - uses flyweight objects.
 */
public class FlyweightPattern {

  public static void main(String[] args) {
    CurrencySymbolFactory factory = new CurrencySymbolFactory();

    CurrencySymbol dollar = factory.getCurrencySymbol("$");
    CurrencySymbol euro = factory.getCurrencySymbol("€");
    CurrencySymbol ukPound = factory.getCurrencySymbol("£");

    dollar.display("USA");
    euro.display("Spain");
    ukPound.display("United Kingdom");

    CurrencySymbol canadaDollar = factory.getCurrencySymbol("$");
    canadaDollar.display("Canada");

    System.out.println(dollar == canadaDollar);
  }

}
