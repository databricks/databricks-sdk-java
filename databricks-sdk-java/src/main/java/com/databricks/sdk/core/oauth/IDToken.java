package com.databricks.sdk.core.oauth;

/**
 * Represents an ID Token provided by an identity provider from an OAuth flow. This token can later
 * be exchanged for an access token.
 */
public class IDToken {
  // The string value of the ID Token
  private final String value;

  /**
   * Constructs an IDToken with a value.
   *
   * @param value The ID Token string.
   */
  public IDToken(String value) {
    if (value == null || value.isEmpty()) {
        throw new IllegalArgumentException("ID Token value cannot be null or empty");
    }
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
