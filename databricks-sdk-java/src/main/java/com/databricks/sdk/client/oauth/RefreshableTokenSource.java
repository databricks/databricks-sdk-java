package com.databricks.sdk.client.oauth;

public abstract class RefreshableTokenSource implements TokenSource {
  private Token token;

  abstract Token refresh();

  @Override
  public synchronized Token getToken() {
    if (token != null && !token.isValid()) {
      token = refresh();
    }
    return token;
  }
}
