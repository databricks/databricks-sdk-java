// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class RetrieveTokenResponse {
  /** The token used to authorize the recipient. */
  @JsonProperty("bearerToken")
  private String bearerToken;

  /** The endpoint for the share to be used by the recipient. */
  @JsonProperty("endpoint")
  private String endpoint;

  /** Expiration timestamp of the token in epoch milliseconds. */
  @JsonProperty("expirationTime")
  private String expirationTime;

  /** These field names must follow the delta sharing protocol. */
  @JsonProperty("shareCredentialsVersion")
  private Long shareCredentialsVersion;

  public RetrieveTokenResponse setBearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
    return this;
  }

  public String getBearerToken() {
    return bearerToken;
  }

  public RetrieveTokenResponse setEndpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public RetrieveTokenResponse setExpirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  public String getExpirationTime() {
    return expirationTime;
  }

  public RetrieveTokenResponse setShareCredentialsVersion(Long shareCredentialsVersion) {
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
    RetrieveTokenResponse that = (RetrieveTokenResponse) o;
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
    return new ToStringer(RetrieveTokenResponse.class)
        .add("bearerToken", bearerToken)
        .add("endpoint", endpoint)
        .add("expirationTime", expirationTime)
        .add("shareCredentialsVersion", shareCredentialsVersion)
        .toString();
  }
}
