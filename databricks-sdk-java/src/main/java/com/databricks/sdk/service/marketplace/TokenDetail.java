// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TokenDetail {
  /** */
  @JsonProperty("bearerToken")
  private String bearerToken;

  /** */
  @JsonProperty("endpoint")
  private String endpoint;

  /** */
  @JsonProperty("expirationTime")
  private String expirationTime;

  /**
   * These field names must follow the delta sharing protocol. Original message:
   * RetrieveToken.Response in managed-catalog/api/messages/recipient.proto
   */
  @JsonProperty("shareCredentialsVersion")
  private Long shareCredentialsVersion;

  public TokenDetail setBearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
    return this;
  }

  public String getBearerToken() {
    return bearerToken;
  }

  public TokenDetail setEndpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public TokenDetail setExpirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  public String getExpirationTime() {
    return expirationTime;
  }

  public TokenDetail setShareCredentialsVersion(Long shareCredentialsVersion) {
    this.shareCredentialsVersion = shareCredentialsVersion;
    return this;
  }

  public Long getShareCredentialsVersion() {
    return shareCredentialsVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TokenDetail that = (TokenDetail) o;
    return Objects.equals(bearerToken, that.bearerToken)
        && Objects.equals(endpoint, that.endpoint)
        && Objects.equals(expirationTime, that.expirationTime)
        && Objects.equals(shareCredentialsVersion, that.shareCredentialsVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bearerToken, endpoint, expirationTime, shareCredentialsVersion);
  }

  @Override
  public String toString() {
    return new ToStringer(TokenDetail.class)
        .add("bearerToken", bearerToken)
        .add("endpoint", endpoint)
        .add("expirationTime", expirationTime)
        .add("shareCredentialsVersion", shareCredentialsVersion)
        .toString();
  }
}
