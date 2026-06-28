// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Encryption Settings are used to carry metadata for securable encryption at rest. Currently used
 * for catalogs, we can use the information supplied here to interact with a CMK.
 */
@Generated
public class EncryptionSettings {
  /** optional Azure settings - only required if an Azure CMK is used. */
  @JsonProperty("azure_encryption_settings")
  private AzureEncryptionSettings azureEncryptionSettings;

  /** the AKV URL in Azure, null otherwise. */
  @JsonProperty("azure_key_vault_key_id")
  private String azureKeyVaultKeyId;

  /** the CMK uuid in AWS and GCP, null otherwise. */
  @JsonProperty("customer_managed_key_id")
  private String customerManagedKeyId;

  public EncryptionSettings setAzureEncryptionSettings(
      AzureEncryptionSettings azureEncryptionSettings) {
    this.azureEncryptionSettings = azureEncryptionSettings;
    return this;
  }

  public AzureEncryptionSettings getAzureEncryptionSettings() {
    return azureEncryptionSettings;
  }

  public EncryptionSettings setAzureKeyVaultKeyId(String azureKeyVaultKeyId) {
    this.azureKeyVaultKeyId = azureKeyVaultKeyId;
    return this;
  }

  public String getAzureKeyVaultKeyId() {
    return azureKeyVaultKeyId;
  }

  public EncryptionSettings setCustomerManagedKeyId(String customerManagedKeyId) {
    this.customerManagedKeyId = customerManagedKeyId;
    return this;
  }

  public String getCustomerManagedKeyId() {
    return customerManagedKeyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EncryptionSettings that = (EncryptionSettings) o;
    return Objects.equals(azureEncryptionSettings, that.azureEncryptionSettings)
        && Objects.equals(azureKeyVaultKeyId, that.azureKeyVaultKeyId)
        && Objects.equals(customerManagedKeyId, that.customerManagedKeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureEncryptionSettings, azureKeyVaultKeyId, customerManagedKeyId);
  }

  @Override
  public String toString() {
    return new ToStringer(EncryptionSettings.class)
        .add("azureEncryptionSettings", azureEncryptionSettings)
        .add("azureKeyVaultKeyId", azureKeyVaultKeyId)
        .add("customerManagedKeyId", customerManagedKeyId)
        .toString();
  }
}
