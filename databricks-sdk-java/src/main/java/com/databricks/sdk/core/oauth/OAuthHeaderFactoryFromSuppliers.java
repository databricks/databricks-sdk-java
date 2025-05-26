package com.databricks.sdk.core.oauth;

import java.util.Map;
import java.util.function.Supplier;

/**
 * Implementation of {@link OAuthHeaderFactory} that uses separate suppliers for token and header
 * generation.
 */
public class OAuthHeaderFactoryFromSuppliers implements OAuthHeaderFactory {
  private final Supplier<Token> tokenSupplier;
  private final Supplier<Map<String, String>> headerSupplier;

  /**
   * Creates a new instance with the specified token and header suppliers.
   *
   * @param tokenSupplier Supplier for OAuth tokens.
   * @param headerSupplier Supplier for headers.
   */
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
