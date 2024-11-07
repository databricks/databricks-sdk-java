// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenerateTemporaryServiceCredentialRequest {
  /** Options to customize the requested temporary credential */
  @JsonProperty("azure_options")
  private GenerateTemporaryServiceCredentialAzureOptions azureOptions;

  /** The name of the service credential used to generate a temporary credential */
  @JsonProperty("credential_name")
  private String credentialName;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenerateTemporaryServiceCredentialRequest that = (GenerateTemporaryServiceCredentialRequest) o;
    return Objects.equals(azureOptions, that.azureOptions)
        && Objects.equals(credentialName, that.credentialName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureOptions, credentialName);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateTemporaryServiceCredentialRequest.class)
        .add("azureOptions", azureOptions)
        .add("credentialName", credentialName)
        .toString();
  }
}
