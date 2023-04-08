// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
