// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AzureEncryptionSettings {
  /** */
  @JsonProperty("azure_cmk_access_connector_id")
  private String azureCmkAccessConnectorId;

  /** */
  @JsonProperty("azure_cmk_managed_identity_id")
  private String azureCmkManagedIdentityId;

  /** */
  @JsonProperty("azure_tenant_id")
  private String azureTenantId;

  public AzureEncryptionSettings setAzureCmkAccessConnectorId(String azureCmkAccessConnectorId) {
    this.azureCmkAccessConnectorId = azureCmkAccessConnectorId;
    return this;
  }

  public String getAzureCmkAccessConnectorId() {
    return azureCmkAccessConnectorId;
  }

  public AzureEncryptionSettings setAzureCmkManagedIdentityId(String azureCmkManagedIdentityId) {
    this.azureCmkManagedIdentityId = azureCmkManagedIdentityId;
    return this;
  }

  public String getAzureCmkManagedIdentityId() {
    return azureCmkManagedIdentityId;
  }

  public AzureEncryptionSettings setAzureTenantId(String azureTenantId) {
    this.azureTenantId = azureTenantId;
    return this;
  }

  public String getAzureTenantId() {
    return azureTenantId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AzureEncryptionSettings that = (AzureEncryptionSettings) o;
    return Objects.equals(azureCmkAccessConnectorId, that.azureCmkAccessConnectorId)
        && Objects.equals(azureCmkManagedIdentityId, that.azureCmkManagedIdentityId)
        && Objects.equals(azureTenantId, that.azureTenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureCmkAccessConnectorId, azureCmkManagedIdentityId, azureTenantId);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureEncryptionSettings.class)
        .add("azureCmkAccessConnectorId", azureCmkAccessConnectorId)
        .add("azureCmkManagedIdentityId", azureCmkManagedIdentityId)
        .add("azureTenantId", azureTenantId)
        .toString();
  }
}
