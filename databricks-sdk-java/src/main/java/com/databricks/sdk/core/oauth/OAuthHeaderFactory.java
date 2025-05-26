package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.HeaderFactory;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Factory interface for creating OAuth authentication headers.
 * This interface combines the functionality of {@link HeaderFactory} and {@link TokenSource}.
 */
public interface OAuthHeaderFactory extends HeaderFactory, TokenSource {
  /**
   * Creates an OAuthHeaderFactory from separate token and header suppliers. This allows for custom
   * header generation beyond just the Authorization header.
   *
   * @param tokenSupplier A supplier that provides OAuth tokens
   * @param headerSupplier A supplier that provides a map of header name-value pairs
   * @return A new OAuthHeaderFactory instance that uses the provided suppliers
   */
  static OAuthHeaderFactory fromSuppliers(
      Supplier<Token> tokenSupplier, Supplier<Map<String, String>> headerSupplier) {
    return new OAuthHeaderFactoryFromSuppliers(tokenSupplier, headerSupplier);
  }

  /**
   * Creates an OAuthHeaderFactory from a TokenSource. This is a convenience method for the common
   * case where headers are derived from the token.
   *
   * @param tokenSource The source of OAuth tokens
   * @return A new OAuthHeaderFactory instance that uses the provided token source
   */
  static OAuthHeaderFactory fromTokenSource(TokenSource tokenSource) {
    return new OAuthHeaderFactoryFromTokenSource(tokenSource);
  }
}
