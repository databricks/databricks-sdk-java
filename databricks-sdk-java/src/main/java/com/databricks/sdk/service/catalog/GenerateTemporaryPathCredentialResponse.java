// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenerateTemporaryPathCredentialResponse {
  /** */
  @JsonProperty("aws_temp_credentials")
  private AwsCredentials awsTempCredentials;

  /** */
  @JsonProperty("azure_aad")
  private AzureActiveDirectoryToken azureAad;

  /** */
  @JsonProperty("azure_user_delegation_sas")
  private AzureUserDelegationSas azureUserDelegationSas;

  /**
   * Server time when the credential will expire, in epoch milliseconds. The API client is advised
   * to cache the credential given this expiration time.
   */
  @JsonProperty("expiration_time")
  private Long expirationTime;

  /** */
  @JsonProperty("gcp_oauth_token")
  private GcpOauthToken gcpOauthToken;

  /** */
  @JsonProperty("r2_temp_credentials")
  private R2Credentials r2TempCredentials;

  /** The URL of the storage path accessible by the temporary credential. */
  @JsonProperty("url")
  private String url;

  public GenerateTemporaryPathCredentialResponse setAwsTempCredentials(
      AwsCredentials awsTempCredentials) {
    this.awsTempCredentials = awsTempCredentials;
    return this;
  }

  public AwsCredentials getAwsTempCredentials() {
    return awsTempCredentials;
  }

  public GenerateTemporaryPathCredentialResponse setAzureAad(AzureActiveDirectoryToken azureAad) {
    this.azureAad = azureAad;
    return this;
  }

  public AzureActiveDirectoryToken getAzureAad() {
    return azureAad;
  }

  public GenerateTemporaryPathCredentialResponse setAzureUserDelegationSas(
      AzureUserDelegationSas azureUserDelegationSas) {
    this.azureUserDelegationSas = azureUserDelegationSas;
    return this;
  }

  public AzureUserDelegationSas getAzureUserDelegationSas() {
    return azureUserDelegationSas;
  }

  public GenerateTemporaryPathCredentialResponse setExpirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  public Long getExpirationTime() {
    return expirationTime;
  }

  public GenerateTemporaryPathCredentialResponse setGcpOauthToken(GcpOauthToken gcpOauthToken) {
    this.gcpOauthToken = gcpOauthToken;
    return this;
  }

  public GcpOauthToken getGcpOauthToken() {
    return gcpOauthToken;
  }

  public GenerateTemporaryPathCredentialResponse setR2TempCredentials(
      R2Credentials r2TempCredentials) {
    this.r2TempCredentials = r2TempCredentials;
    return this;
  }

  public R2Credentials getR2TempCredentials() {
    return r2TempCredentials;
  }

  public GenerateTemporaryPathCredentialResponse setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenerateTemporaryPathCredentialResponse that = (GenerateTemporaryPathCredentialResponse) o;
    return Objects.equals(awsTempCredentials, that.awsTempCredentials)
        && Objects.equals(azureAad, that.azureAad)
        && Objects.equals(azureUserDelegationSas, that.azureUserDelegationSas)
        && Objects.equals(expirationTime, that.expirationTime)
        && Objects.equals(gcpOauthToken, that.gcpOauthToken)
        && Objects.equals(r2TempCredentials, that.r2TempCredentials)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        awsTempCredentials,
        azureAad,
        azureUserDelegationSas,
        expirationTime,
        gcpOauthToken,
        r2TempCredentials,
        url);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateTemporaryPathCredentialResponse.class)
        .add("awsTempCredentials", awsTempCredentials)
        .add("azureAad", azureAad)
        .add("azureUserDelegationSas", azureUserDelegationSas)
        .add("expirationTime", expirationTime)
        .add("gcpOauthToken", gcpOauthToken)
        .add("r2TempCredentials", r2TempCredentials)
        .add("url", url)
        .toString();
  }
}
