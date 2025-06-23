// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The Azure managed identity configuration. */
@Generated
public class AzureManagedIdentity {
  /**
   * The Azure resource ID of the Azure Databricks Access Connector. Use the format
   * `/subscriptions/{guid}/resourceGroups/{rg-name}/providers/Microsoft.Databricks/accessConnectors/{connector-name}`.
   */
  @JsonProperty("access_connector_id")
  private String accessConnectorId;

  /** The Databricks internal ID that represents this managed identity. */
  @JsonProperty("credential_id")
  private String credentialId;

  /**
   * The Azure resource ID of the managed identity. Use the format,
   * `/subscriptions/{guid}/resourceGroups/{rg-name}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identity-name}`
   * This is only available for user-assgined identities. For system-assigned identities, the
   * access_connector_id is used to identify the identity. If this field is not provided, then we
   * assume the AzureManagedIdentity is using the system-assigned identity.
   */
  @JsonProperty("managed_identity_id")
  private String managedIdentityId;

  public AzureManagedIdentity setAccessConnectorId(String accessConnectorId) {
    this.accessConnectorId = accessConnectorId;
    return this;
  }

  public String getAccessConnectorId() {
    return accessConnectorId;
  }

  public AzureManagedIdentity setCredentialId(String credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  public String getCredentialId() {
    return credentialId;
  }

  public AzureManagedIdentity setManagedIdentityId(String managedIdentityId) {
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
    AzureManagedIdentity that = (AzureManagedIdentity) o;
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
    return new ToStringer(AzureManagedIdentity.class)
        .add("accessConnectorId", accessConnectorId)
        .add("credentialId", credentialId)
        .add("managedIdentityId", managedIdentityId)
        .toString();
  }
}
