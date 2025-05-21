package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.DatabricksException;

/**
 * A TokenSource implementation that always throws an error when attempting to get a token. This is
 * used when the header factory is not an OAuthHeaderFactory.
 */
public class ErrorTokenSource implements TokenSource {
  private final String errorMessage;

  public ErrorTokenSource(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  @Override
  public Token getToken() {
    throw new DatabricksException(errorMessage);
  }
}
