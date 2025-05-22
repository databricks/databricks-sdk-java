package com.databricks.sdk.core.oauth;

import java.util.Map;
import java.util.function.Supplier;

/**
 * A concrete implementation of OAuthHeaderFactory that uses suppliers for both token and header
 * generation. This allows for custom header generation beyond just the Authorization header.
 */
public class OAuthHeaderFactoryFromSuppliers implements OAuthHeaderFactory {
  private final Supplier<Token> tokenSupplier;
  private final Supplier<Map<String, String>> headerSupplier;

  public OAuthHeaderFactoryFromSuppliers(
      Supplier<Token> tokenSupplier, Supplier<Map<String, String>> headerSupplier) {
    this.tokenSupplier = tokenSupplier;
    this.headerSupplier = headerSupplier;
  }

  @Override
  public Map<String, String> headers() {
    return headerSupplier.get();
  }

  @Override
  public Token getToken() {
    return tokenSupplier.get();
  }
}
