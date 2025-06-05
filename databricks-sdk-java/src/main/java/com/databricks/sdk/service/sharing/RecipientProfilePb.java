// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class RecipientProfilePb {
  @JsonProperty("bearer_token")
  private String bearerToken;

  @JsonProperty("endpoint")
  private String endpoint;

  @JsonProperty("share_credentials_version")
  private Long shareCredentialsVersion;

  public RecipientProfilePb setBearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
    return this;
  }

  public String getBearerToken() {
    return bearerToken;
  }

  public RecipientProfilePb setEndpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public RecipientProfilePb setShareCredentialsVersion(Long shareCredentialsVersion) {
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
    RecipientProfilePb that = (RecipientProfilePb) o;
    return Objects.equals(bearerToken, that.bearerToken)
        && Objects.equals(endpoint, that.endpoint)
        && Objects.equals(shareCredentialsVersion, that.shareCredentialsVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bearerToken, endpoint, shareCredentialsVersion);
  }

  @Override
  public String toString() {
    return new ToStringer(RecipientProfilePb.class)
        .add("bearerToken", bearerToken)
        .add("endpoint", endpoint)
        .add("shareCredentialsVersion", shareCredentialsVersion)
        .toString();
  }
}
