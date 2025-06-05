// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class GenerateTemporaryServiceCredentialRequestPb {
  @JsonProperty("azure_options")
  private GenerateTemporaryServiceCredentialAzureOptions azureOptions;

  @JsonProperty("credential_name")
  private String credentialName;

  @JsonProperty("gcp_options")
  private GenerateTemporaryServiceCredentialGcpOptions gcpOptions;

  public GenerateTemporaryServiceCredentialRequestPb setAzureOptions(
      GenerateTemporaryServiceCredentialAzureOptions azureOptions) {
    this.azureOptions = azureOptions;
    return this;
  }

  public GenerateTemporaryServiceCredentialAzureOptions getAzureOptions() {
    return azureOptions;
  }

  public GenerateTemporaryServiceCredentialRequestPb setCredentialName(String credentialName) {
    this.credentialName = credentialName;
    return this;
  }

  public String getCredentialName() {
    return credentialName;
  }

  public GenerateTemporaryServiceCredentialRequestPb setGcpOptions(
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
    GenerateTemporaryServiceCredentialRequestPb that =
        (GenerateTemporaryServiceCredentialRequestPb) o;
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
    return new ToStringer(GenerateTemporaryServiceCredentialRequestPb.class)
        .add("azureOptions", azureOptions)
        .add("credentialName", credentialName)
        .add("gcpOptions", gcpOptions)
        .toString();
  }
}
