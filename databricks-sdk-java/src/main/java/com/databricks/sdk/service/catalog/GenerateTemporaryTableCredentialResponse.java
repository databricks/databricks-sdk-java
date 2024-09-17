// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenerateTemporaryTableCredentialResponse {
  /**
   * AWS temporary credentials for API authentication. Read more at
   * https://docs.aws.amazon.com/STS/latest/APIReference/API_Credentials.html.
   */
  @JsonProperty("aws_temp_credentials")
  private AwsCredentials awsTempCredentials;

  /**
   * Azure temporary credentials for API authentication. Read more at
   * https://docs.microsoft.com/en-us/rest/api/storageservices/create-user-delegation-sas
   */
  @JsonProperty("azure_user_delegation_sas")
  private AzureUserDelegationSas azureUserDelegationSas;

  /**
   * Server time when the credential will expire, in unix epoch milliseconds since January 1, 1970
   * at 00:00:00 UTC. The API client is advised to cache the credential given this expiration time.
   */
  @JsonProperty("expiration_time")
  private Long expirationTime;

  /**
   * GCP temporary credentials for API authentication. Read more at
   * https://developers.google.com/identity/protocols/oauth2/service-account
   */
  @JsonProperty("gcp_oauth_token")
  private GcpOauthToken gcpOauthToken;

  /**
   * R2 temporary credentials for API authentication. Read more at
   * https://developers.cloudflare.com/r2/api/s3/tokens/.
   */
  @JsonProperty("r2_temp_credentials")
  private R2Credentials r2TempCredentials;

  /** The URL of the storage path accessible by the temporary credential. */
  @JsonProperty("url")
  private String url;

  public GenerateTemporaryTableCredentialResponse setAwsTempCredentials(
      AwsCredentials awsTempCredentials) {
    this.awsTempCredentials = awsTempCredentials;
    return this;
  }

  public AwsCredentials getAwsTempCredentials() {
    return awsTempCredentials;
  }

  public GenerateTemporaryTableCredentialResponse setAzureUserDelegationSas(
      AzureUserDelegationSas azureUserDelegationSas) {
    this.azureUserDelegationSas = azureUserDelegationSas;
    return this;
  }

  public AzureUserDelegationSas getAzureUserDelegationSas() {
    return azureUserDelegationSas;
  }

  public GenerateTemporaryTableCredentialResponse setExpirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  public Long getExpirationTime() {
    return expirationTime;
  }

  public GenerateTemporaryTableCredentialResponse setGcpOauthToken(GcpOauthToken gcpOauthToken) {
    this.gcpOauthToken = gcpOauthToken;
    return this;
  }

  public GcpOauthToken getGcpOauthToken() {
    return gcpOauthToken;
  }

  public GenerateTemporaryTableCredentialResponse setR2TempCredentials(
      R2Credentials r2TempCredentials) {
    this.r2TempCredentials = r2TempCredentials;
    return this;
  }

  public R2Credentials getR2TempCredentials() {
    return r2TempCredentials;
  }

  public GenerateTemporaryTableCredentialResponse setUrl(String url) {
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
    GenerateTemporaryTableCredentialResponse that = (GenerateTemporaryTableCredentialResponse) o;
    return Objects.equals(awsTempCredentials, that.awsTempCredentials)
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
        azureUserDelegationSas,
        expirationTime,
        gcpOauthToken,
        r2TempCredentials,
        url);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateTemporaryTableCredentialResponse.class)
        .add("awsTempCredentials", awsTempCredentials)
        .add("azureUserDelegationSas", azureUserDelegationSas)
        .add("expirationTime", expirationTime)
        .add("gcpOauthToken", gcpOauthToken)
        .add("r2TempCredentials", r2TempCredentials)
        .add("url", url)
        .toString();
  }
}
