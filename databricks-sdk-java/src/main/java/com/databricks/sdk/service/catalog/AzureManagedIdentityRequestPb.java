// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AzureManagedIdentityRequestPb {
  @JsonProperty("access_connector_id")
  private String accessConnectorId;

  @JsonProperty("managed_identity_id")
  private String managedIdentityId;

  public AzureManagedIdentityRequestPb setAccessConnectorId(String accessConnectorId) {
    this.accessConnectorId = accessConnectorId;
    return this;
  }

  public String getAccessConnectorId() {
    return accessConnectorId;
  }

  public AzureManagedIdentityRequestPb setManagedIdentityId(String managedIdentityId) {
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
    AzureManagedIdentityRequestPb that = (AzureManagedIdentityRequestPb) o;
    return Objects.equals(accessConnectorId, that.accessConnectorId)
        && Objects.equals(managedIdentityId, that.managedIdentityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessConnectorId, managedIdentityId);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureManagedIdentityRequestPb.class)
        .add("accessConnectorId", accessConnectorId)
        .add("managedIdentityId", managedIdentityId)
        .toString();
  }
}
