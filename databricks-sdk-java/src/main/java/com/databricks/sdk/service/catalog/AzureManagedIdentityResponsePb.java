// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AzureManagedIdentityResponsePb {
  @JsonProperty("access_connector_id")
  private String accessConnectorId;

  @JsonProperty("credential_id")
  private String credentialId;

  @JsonProperty("managed_identity_id")
  private String managedIdentityId;

  public AzureManagedIdentityResponsePb setAccessConnectorId(String accessConnectorId) {
    this.accessConnectorId = accessConnectorId;
    return this;
  }

  public String getAccessConnectorId() {
    return accessConnectorId;
  }

  public AzureManagedIdentityResponsePb setCredentialId(String credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  public String getCredentialId() {
    return credentialId;
  }

  public AzureManagedIdentityResponsePb setManagedIdentityId(String managedIdentityId) {
    this.managedIdentityId = managedIdentityId;
    return this;
  }

  public String getManagedIdentityId() {
    return managedIdentityId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AzureManagedIdentityResponsePb that = (AzureManagedIdentityResponsePb) o;
    return Objects.equals(accessConnectorId, that.accessConnectorId)
        && Objects.equals(credentialId, that.credentialId)
        && Objects.equals(managedIdentityId, that.managedIdentityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessConnectorId, credentialId, managedIdentityId);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureManagedIdentityResponsePb.class)
        .add("accessConnectorId", accessConnectorId)
        .add("credentialId", credentialId)
        .add("managedIdentityId", managedIdentityId)
        .toString();
  }
}
