// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Exchange a token with the IdP */
@Generated
public class ExchangeTokenRequest {
  /** The partition of Credentials store */
  @JsonProperty("partitionId")
  private PartitionId partitionId;

  /** Array of scopes for the token request. */
  @JsonProperty("scopes")
  private Collection<String> scopes;

  /** A list of token types being requested */
  @JsonProperty("tokenType")
  private Collection<TokenType> tokenType;

  public ExchangeTokenRequest setPartitionId(PartitionId partitionId) {
    this.partitionId = partitionId;
    return this;
  }

  public PartitionId getPartitionId() {
    return partitionId;
  }

  public ExchangeTokenRequest setScopes(Collection<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public Collection<String> getScopes() {
    return scopes;
  }

  public ExchangeTokenRequest setTokenType(Collection<TokenType> tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  public Collection<TokenType> getTokenType() {
    return tokenType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeTokenRequest that = (ExchangeTokenRequest) o;
    return Objects.equals(partitionId, that.partitionId)
        && Objects.equals(scopes, that.scopes)
        && Objects.equals(tokenType, that.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partitionId, scopes, tokenType);
  }

  @Override
  public String toString() {
    return new ToStringer(ExchangeTokenRequest.class)
        .add("partitionId", partitionId)
        .add("scopes", scopes)
        .add("tokenType", tokenType)
        .toString();
  }
}
