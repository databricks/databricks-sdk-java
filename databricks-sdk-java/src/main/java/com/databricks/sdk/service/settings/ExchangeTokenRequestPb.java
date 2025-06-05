// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Exchange a token with the IdP */
@Generated
class ExchangeTokenRequestPb {
  @JsonProperty("partitionId")
  private PartitionId partitionId;

  @JsonProperty("scopes")
  private Collection<String> scopes;

  @JsonProperty("tokenType")
  private Collection<TokenType> tokenType;

  public ExchangeTokenRequestPb setPartitionId(PartitionId partitionId) {
    this.partitionId = partitionId;
    return this;
  }

  public PartitionId getPartitionId() {
    return partitionId;
  }

  public ExchangeTokenRequestPb setScopes(Collection<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public Collection<String> getScopes() {
    return scopes;
  }

  public ExchangeTokenRequestPb setTokenType(Collection<TokenType> tokenType) {
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
    ExchangeTokenRequestPb that = (ExchangeTokenRequestPb) o;
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
    return new ToStringer(ExchangeTokenRequestPb.class)
        .add("partitionId", partitionId)
        .add("scopes", scopes)
        .add("tokenType", tokenType)
        .toString();
  }
}
