// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TemporaryCredentials {
  /** */
  @JsonProperty("aws_temp_credentials")
  private AwsCredentials awsTempCredentials;

  /** */
  @JsonProperty("azure_aad")
  private AzureActiveDirectoryToken azureAad;

  /**
   * Server time when the credential will expire, in epoch milliseconds. The API client is advised
   * to cache the credential given this expiration time.
   */
  @JsonProperty("expiration_time")
  private Long expirationTime;

  /** */
  @JsonProperty("gcp_oauth_token")
  private GcpOauthToken gcpOauthToken;

  public TemporaryCredentials setAwsTempCredentials(AwsCredentials awsTempCredentials) {
    this.awsTempCredentials = awsTempCredentials;
    return this;
  }

  public AwsCredentials getAwsTempCredentials() {
    return awsTempCredentials;
  }

  public TemporaryCredentials setAzureAad(AzureActiveDirectoryToken azureAad) {
    this.azureAad = azureAad;
    return this;
  }

  public AzureActiveDirectoryToken getAzureAad() {
    return azureAad;
  }

  public TemporaryCredentials setExpirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  public Long getExpirationTime() {
    return expirationTime;
  }

  public TemporaryCredentials setGcpOauthToken(GcpOauthToken gcpOauthToken) {
    this.gcpOauthToken = gcpOauthToken;
    return this;
  }

  public GcpOauthToken getGcpOauthToken() {
    return gcpOauthToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TemporaryCredentials that = (TemporaryCredentials) o;
    return Objects.equals(awsTempCredentials, that.awsTempCredentials)
        && Objects.equals(azureAad, that.azureAad)
        && Objects.equals(expirationTime, that.expirationTime)
        && Objects.equals(gcpOauthToken, that.gcpOauthToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsTempCredentials, azureAad, expirationTime, gcpOauthToken);
  }

  @Override
  public String toString() {
    return new ToStringer(TemporaryCredentials.class)
        .add("awsTempCredentials", awsTempCredentials)
        .add("azureAad", azureAad)
        .add("expirationTime", expirationTime)
        .add("gcpOauthToken", gcpOauthToken)
        .toString();
  }
}
