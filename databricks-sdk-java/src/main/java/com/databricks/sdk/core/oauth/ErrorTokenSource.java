package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.DatabricksException;
import java.util.Objects;

/**
 * A TokenSource implementation that always throws an error when attempting to get a token. This is
 * used when the header factory is not an OAuthHeaderFactory.
 */
public class ErrorTokenSource implements TokenSource {
  private final String errorMessage;

  /**
   * Constructs a new ErrorTokenSource with the specified error message.
   *
   * @param errorMessage The error message that will be thrown when attempting to get a token
   * @throws NullPointerException if errorMessage is null
   */
  public ErrorTokenSource(String errorMessage) {
    this.errorMessage = Objects.requireNonNull(errorMessage, "errorMessage cannot be null");
  }

  /**
   * Always throws a DatabricksException with the configured error message.
   *
   * @return never returns normally, always throws an exception
   * @throws DatabricksException with the configured error message
   */
  @Override
  public Token getToken() {
    throw new DatabricksException(errorMessage);
  }
}
