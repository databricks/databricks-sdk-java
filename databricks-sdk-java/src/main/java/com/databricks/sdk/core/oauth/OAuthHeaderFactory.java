package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.HeaderFactory;
import java.util.HashMap;
import java.util.Map;

public class OAuthHeaderFactory implements HeaderFactory, TokenSource {
  private final TokenSource tokenSource;

  public OAuthHeaderFactory(TokenSource tokenSource) {
    this.tokenSource = tokenSource;
  }

  @Override
  public Token getToken() {
    return tokenSource.getToken();
  }

  @Override
  public Map<String, String> headers() {
    Map<String, String> headers = new HashMap<>();
    headers.put("Authorization", "Bearer " + tokenSource.getToken().getAccessToken());
    return headers;
  }
}
