package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.HeaderFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Factory interface for creating OAuth authentication headers. This interface combines the
 * functionality of {@link HeaderFactory} and {@link TokenSource}.
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
    return new OAuthHeaderFactory() {
      @Override
      public Map<String, String> headers() {
        return headerSupplier.get();
      }

      @Override
      public Token getToken() {
        return tokenSupplier.get();
      }
    };
  }

  /**
   * Creates an OAuthHeaderFactory from a TokenSource. This is a convenience method for the common
   * case where headers are derived from the token.
   *
   * @param tokenSource The source of OAuth tokens
   * @return A new OAuthHeaderFactory instance that uses the provided token source
   */
  static OAuthHeaderFactory fromTokenSource(TokenSource tokenSource) {
    return new OAuthHeaderFactory() {
      @Override
      public Token getToken() {
        return tokenSource.getToken();
      }

      @Override
      public Map<String, String> headers() {
        Token token = tokenSource.getToken();
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", token.getTokenType() + " " + token.getAccessToken());
        return headers;
      }
    };
  }
}
