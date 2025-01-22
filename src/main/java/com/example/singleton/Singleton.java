package com.example.singleton;

/**
 * Singleton class
 * 1. Private constructor
 * 2. Static instance
 * 3. Global access method
 */
public class Singleton {

  // 2
  private static Singleton singleton;

  // 1
  private Singleton() {

  }

  // 3
  public static Singleton getInstance() {
    if (singleton == null) {
      return new Singleton();
    }
    return singleton;
  }
}
