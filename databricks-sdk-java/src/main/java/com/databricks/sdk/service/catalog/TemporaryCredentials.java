// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TemporaryCredentials {
  /**
   * AWS temporary credentials for API authentication. Read more at
   * https://docs.aws.amazon.com/STS/latest/APIReference/API_Credentials.html.
   */
  @JsonProperty("aws_temp_credentials")
  private AwsCredentials awsTempCredentials;

  /**
   * Azure Active Directory token, essentially the Oauth token for Azure Service Principal or
   * Managed Identity. Read more at
   * https://learn.microsoft.com/en-us/azure/databricks/dev-tools/api/latest/aad/service-prin-aad-token
   */
  @JsonProperty("azure_aad")
  private AzureActiveDirectoryToken azureAad;

  /**
   * Server time when the credential will expire, in epoch milliseconds. The API client is advised
   * to cache the credential given this expiration time.
   */
  @JsonProperty("expiration_time")
  private Long expirationTime;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TemporaryCredentials that = (TemporaryCredentials) o;
    return Objects.equals(awsTempCredentials, that.awsTempCredentials)
        && Objects.equals(azureAad, that.azureAad)
        && Objects.equals(expirationTime, that.expirationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsTempCredentials, azureAad, expirationTime);
  }

  @Override
  public String toString() {
    return new ToStringer(TemporaryCredentials.class)
        .add("awsTempCredentials", awsTempCredentials)
        .add("azureAad", azureAad)
        .add("expirationTime", expirationTime)
        .toString();
  }
}
