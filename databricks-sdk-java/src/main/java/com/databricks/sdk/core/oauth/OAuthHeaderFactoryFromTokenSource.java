package com.databricks.sdk.core.oauth;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of {@link OAuthHeaderFactory} that generates Authorization headers from a token source.
 */
public class OAuthHeaderFactoryFromTokenSource implements OAuthHeaderFactory {
  private final TokenSource tokenSource;

  /**
   * Creates a new instance with the specified token source.
   *
   * @param tokenSource Source of OAuth tokens.
   */
  public OAuthHeaderFactoryFromTokenSource(TokenSource tokenSource) {
    this.tokenSource = tokenSource;
  }

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
}
