// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenerateTemporaryServiceCredentialRequest {
  /** The Azure cloud options to customize the requested temporary credential */
  @JsonProperty("azure_options")
  private GenerateTemporaryServiceCredentialAzureOptions azureOptions;

  /** The name of the service credential used to generate a temporary credential */
  @JsonProperty("credential_name")
  private String credentialName;

  /** The GCP cloud options to customize the requested temporary credential */
  @JsonProperty("gcp_options")
  private GenerateTemporaryServiceCredentialGcpOptions gcpOptions;

  public GenerateTemporaryServiceCredentialRequest setAzureOptions(
      GenerateTemporaryServiceCredentialAzureOptions azureOptions) {
    this.azureOptions = azureOptions;
    return this;
  }

  public GenerateTemporaryServiceCredentialAzureOptions getAzureOptions() {
    return azureOptions;
  }

  public GenerateTemporaryServiceCredentialRequest setCredentialName(String credentialName) {
    this.credentialName = credentialName;
    return this;
  }

  public String getCredentialName() {
    return credentialName;
  }

  public GenerateTemporaryServiceCredentialRequest setGcpOptions(
      GenerateTemporaryServiceCredentialGcpOptions gcpOptions) {
    this.gcpOptions = gcpOptions;
    return this;
  }

  public GenerateTemporaryServiceCredentialGcpOptions getGcpOptions() {
    return gcpOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenerateTemporaryServiceCredentialRequest that = (GenerateTemporaryServiceCredentialRequest) o;
    return Objects.equals(azureOptions, that.azureOptions)
        && Objects.equals(credentialName, that.credentialName)
        && Objects.equals(gcpOptions, that.gcpOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureOptions, credentialName, gcpOptions);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateTemporaryServiceCredentialRequest.class)
        .add("azureOptions", azureOptions)
        .add("credentialName", credentialName)
        .add("gcpOptions", gcpOptions)
        .toString();
  }
}
