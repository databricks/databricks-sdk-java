// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AzureKeyInfo {
  /**
   * The Disk Encryption Set id that is used to represent the key info used for Managed Disk BYOK
   * use case
   */
  @JsonProperty("disk_encryption_set_id")
  private String diskEncryptionSetId;

  /**
   * The structure to store key access credential This is set if the Managed Identity is being used
   * to access the Azure Key Vault key.
   */
  @JsonProperty("key_access_configuration")
  private KeyAccessConfiguration keyAccessConfiguration;

  /** The name of the key in KeyVault. */
  @JsonProperty("key_name")
  private String keyName;

  /** The base URI of the KeyVault. */
  @JsonProperty("key_vault_uri")
  private String keyVaultUri;

  /** The tenant id where the KeyVault lives. */
  @JsonProperty("tenant_id")
  private String tenantId;

  /** The current key version. */
  @JsonProperty("version")
  private String version;

  public AzureKeyInfo setDiskEncryptionSetId(String diskEncryptionSetId) {
    this.diskEncryptionSetId = diskEncryptionSetId;
    return this;
  }

  public String getDiskEncryptionSetId() {
    return diskEncryptionSetId;
  }

  public AzureKeyInfo setKeyAccessConfiguration(KeyAccessConfiguration keyAccessConfiguration) {
    this.keyAccessConfiguration = keyAccessConfiguration;
    return this;
  }

  public KeyAccessConfiguration getKeyAccessConfiguration() {
    return keyAccessConfiguration;
  }

  public AzureKeyInfo setKeyName(String keyName) {
    this.keyName = keyName;
    return this;
  }

  public String getKeyName() {
    return keyName;
  }

  public AzureKeyInfo setKeyVaultUri(String keyVaultUri) {
    this.keyVaultUri = keyVaultUri;
    return this;
  }

  public String getKeyVaultUri() {
    return keyVaultUri;
  }

  public AzureKeyInfo setTenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  public String getTenantId() {
    return tenantId;
  }

  public AzureKeyInfo setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AzureKeyInfo that = (AzureKeyInfo) o;
    return Objects.equals(diskEncryptionSetId, that.diskEncryptionSetId)
        && Objects.equals(keyAccessConfiguration, that.keyAccessConfiguration)
        && Objects.equals(keyName, that.keyName)
        && Objects.equals(keyVaultUri, that.keyVaultUri)
        && Objects.equals(tenantId, that.tenantId)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        diskEncryptionSetId, keyAccessConfiguration, keyName, keyVaultUri, tenantId, version);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureKeyInfo.class)
        .add("diskEncryptionSetId", diskEncryptionSetId)
        .add("keyAccessConfiguration", keyAccessConfiguration)
        .add("keyName", keyName)
        .add("keyVaultUri", keyVaultUri)
        .add("tenantId", tenantId)
        .add("version", version)
        .toString();
  }
}
