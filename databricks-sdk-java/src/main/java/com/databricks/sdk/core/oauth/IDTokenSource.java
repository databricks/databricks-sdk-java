package com.databricks.sdk.core.oauth;

/** IDTokenSource is anything that returns an IDToken given an audience. */
public interface IDTokenSource {
  /**
   * Retrieves an ID Token for the specified audience.
   *
   * @param audience The intended recipient of the ID Token.
   * @return An {@link IDToken} containing the token value.
   */
  IDToken getIDToken(String audience);
}
