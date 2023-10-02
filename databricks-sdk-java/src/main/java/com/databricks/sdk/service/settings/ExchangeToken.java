// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ExchangeToken {
  /** The requested token. */
  @JsonProperty("credential")
  private String credential;

  /** The end-of-life timestamp of the token. The value is in milliseconds since the Unix epoch. */
  @JsonProperty("credentialEolTime")
  private Long credentialEolTime;

  /** User ID of the user that owns this token. */
  @JsonProperty("ownerId")
  private Long ownerId;

  /** The scopes of access granted in the token. */
  @JsonProperty("scopes")
  private Collection<String> scopes;

  /** The type of token request. As of now, only `AZURE_ACTIVE_DIRECTORY_TOKEN` is supported. */
  @JsonProperty("tokenType")
  private TokenType tokenType;

  public ExchangeToken setCredential(String credential) {
    this.credential = credential;
    return this;
  }

  public String getCredential() {
    return credential;
  }

  public ExchangeToken setCredentialEolTime(Long credentialEolTime) {
    this.credentialEolTime = credentialEolTime;
    return this;
  }

  public Long getCredentialEolTime() {
    return credentialEolTime;
  }

  public ExchangeToken setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  public Long getOwnerId() {
    return ownerId;
  }

  public ExchangeToken setScopes(Collection<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public Collection<String> getScopes() {
    return scopes;
  }

  public ExchangeToken setTokenType(TokenType tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  public TokenType getTokenType() {
    return tokenType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeToken that = (ExchangeToken) o;
    return Objects.equals(credential, that.credential)
        && Objects.equals(credentialEolTime, that.credentialEolTime)
        && Objects.equals(ownerId, that.ownerId)
        && Objects.equals(scopes, that.scopes)
        && Objects.equals(tokenType, that.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credential, credentialEolTime, ownerId, scopes, tokenType);
  }

  @Override
  public String toString() {
    return new ToStringer(ExchangeToken.class)
        .add("credential", credential)
        .add("credentialEolTime", credentialEolTime)
        .add("ownerId", ownerId)
        .add("scopes", scopes)
        .add("tokenType", tokenType)
        .toString();
  }
}
