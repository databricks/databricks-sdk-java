// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The Azure service principal configuration. Only applicable when purpose is **STORAGE**. */
@Generated
class AzureServicePrincipalPb {
  @JsonProperty("application_id")
  private String applicationId;

  @JsonProperty("client_secret")
  private String clientSecret;

  @JsonProperty("directory_id")
  private String directoryId;

  public AzureServicePrincipalPb setApplicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  public String getApplicationId() {
    return applicationId;
  }

  public AzureServicePrincipalPb setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  public String getClientSecret() {
    return clientSecret;
  }

  public AzureServicePrincipalPb setDirectoryId(String directoryId) {
    this.directoryId = directoryId;
    return this;
  }

  public String getDirectoryId() {
    return directoryId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AzureServicePrincipalPb that = (AzureServicePrincipalPb) o;
    return Objects.equals(applicationId, that.applicationId)
        && Objects.equals(clientSecret, that.clientSecret)
        && Objects.equals(directoryId, that.directoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, clientSecret, directoryId);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureServicePrincipalPb.class)
        .add("applicationId", applicationId)
        .add("clientSecret", clientSecret)
        .add("directoryId", directoryId)
        .toString();
  }
}
