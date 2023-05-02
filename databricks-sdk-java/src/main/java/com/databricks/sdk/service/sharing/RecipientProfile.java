// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class RecipientProfile {
  /** The token used to authorize the recipient. */
  @JsonProperty("bearer_token")
  private String bearerToken;

  /** The endpoint for the share to be used by the recipient. */
  @JsonProperty("endpoint")
  private String endpoint;

  /** The version number of the recipient's credentials on a share. */
  @JsonProperty("share_credentials_version")
  private Long shareCredentialsVersion;

  public RecipientProfile setBearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
    return this;
  }

  public String getBearerToken() {
    return bearerToken;
  }

  public RecipientProfile setEndpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public RecipientProfile setShareCredentialsVersion(Long shareCredentialsVersion) {
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
    RecipientProfile that = (RecipientProfile) o;
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
    return new ToStringer(RecipientProfile.class)
        .add("bearerToken", bearerToken)
        .add("endpoint", endpoint)
        .add("shareCredentialsVersion", shareCredentialsVersion)
        .toString();
  }
}
