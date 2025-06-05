// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The exchange token is the result of the token exchange with the IdP */
@Generated
class ExchangeTokenPb {
  @JsonProperty("credential")
  private String credential;

  @JsonProperty("credentialEolTime")
  private Long credentialEolTime;

  @JsonProperty("ownerId")
  private Long ownerId;

  @JsonProperty("scopes")
  private Collection<String> scopes;

  @JsonProperty("tokenType")
  private TokenType tokenType;

  public ExchangeTokenPb setCredential(String credential) {
    this.credential = credential;
    return this;
  }

  public String getCredential() {
    return credential;
  }

  public ExchangeTokenPb setCredentialEolTime(Long credentialEolTime) {
    this.credentialEolTime = credentialEolTime;
    return this;
  }

  public Long getCredentialEolTime() {
    return credentialEolTime;
  }

  public ExchangeTokenPb setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  public Long getOwnerId() {
    return ownerId;
  }

  public ExchangeTokenPb setScopes(Collection<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public Collection<String> getScopes() {
    return scopes;
  }

  public ExchangeTokenPb setTokenType(TokenType tokenType) {
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
    ExchangeTokenPb that = (ExchangeTokenPb) o;
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
    return new ToStringer(ExchangeTokenPb.class)
        .add("credential", credential)
        .add("credentialEolTime", credentialEolTime)
        .add("ownerId", ownerId)
        .add("scopes", scopes)
        .add("tokenType", tokenType)
        .toString();
  }
}
