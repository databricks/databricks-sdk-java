// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class CreateCatalog {
  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /**
   * Naming a connection to an external data source creates a foreign catalog that mirrors a
   * database in that source, which requires ownership of or the CREATE FOREIGN CATALOG privilege on
   * the connection. Connection-specific settings, such as the database to mirror, go in options.
   * The connection cannot be changed after creation.
   */
  @JsonProperty("connection_name")
  private String connectionName;

  /**
   * Dropped objects in the catalog remain recoverable for this number of hours before they are
   * permanently purged. The value applies to standard catalogs only, must be 0 or within the range
   * allowed for the metastore, and is inherited by schemas and tables that do not set their own
   * value.
   */
  @JsonProperty("custom_max_retention_hours")
  private Long customMaxRetentionHours;

  /**
   * Customer-managed key (CMK) settings control the encryption at rest of the catalog's managed
   * data.
   */
  @JsonProperty("managed_encryption_settings")
  private EncryptionSettings managedEncryptionSettings;

  /**
   * The name of the catalog is stored in lowercase, can be at most 255 characters long, and cannot
   * contain periods, spaces, forward slashes, or control characters.
   */
  @JsonProperty("name")
  private String name;

  /** A map of key-value properties attached to the securable. */
  @JsonProperty("options")
  private Map<String, String> options;

  /** A map of key-value properties attached to the securable. */
  @JsonProperty("properties")
  private Map<String, String> properties;

  /**
   * The Delta Sharing provider that owns the share must be named here, together with share_name, to
   * create a Delta Sharing catalog that exposes the data of the share on a remote sharing server.
   * The provider cannot be changed after creation.
   */
  @JsonProperty("provider_name")
  private String providerName;

  /**
   * The share under the Delta Sharing provider must be named here, together with provider_name, to
   * create a Delta Sharing catalog. The share cannot be changed after creation.
   */
  @JsonProperty("share_name")
  private String shareName;

  /**
   * Managed tables and volumes in the catalog are stored under this storage root URL. The path must
   * be inside an external location on which the caller has the CREATE MANAGED STORAGE privilege. If
   * omitted, managed data is stored under the metastore's root storage location, which must then be
   * configured. Delta Sharing catalogs cannot have a storage root.
   */
  @JsonProperty("storage_root")
  private String storageRoot;

  public CreateCatalog setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateCatalog setConnectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

  public String getConnectionName() {
    return connectionName;
  }

  public CreateCatalog setCustomMaxRetentionHours(Long customMaxRetentionHours) {
    this.customMaxRetentionHours = customMaxRetentionHours;
    return this;
  }

  public Long getCustomMaxRetentionHours() {
    return customMaxRetentionHours;
  }

  public CreateCatalog setManagedEncryptionSettings(EncryptionSettings managedEncryptionSettings) {
    this.managedEncryptionSettings = managedEncryptionSettings;
    return this;
  }

  public EncryptionSettings getManagedEncryptionSettings() {
    return managedEncryptionSettings;
  }

  public CreateCatalog setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateCatalog setOptions(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Map<String, String> getOptions() {
    return options;
  }

  public CreateCatalog setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public CreateCatalog setProviderName(String providerName) {
    this.providerName = providerName;
    return this;
  }

  public String getProviderName() {
    return providerName;
  }

  public CreateCatalog setShareName(String shareName) {
    this.shareName = shareName;
    return this;
  }

  public String getShareName() {
    return shareName;
  }

  public CreateCatalog setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  public String getStorageRoot() {
    return storageRoot;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCatalog that = (CreateCatalog) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(connectionName, that.connectionName)
        && Objects.equals(customMaxRetentionHours, that.customMaxRetentionHours)
        && Objects.equals(managedEncryptionSettings, that.managedEncryptionSettings)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(properties, that.properties)
        && Objects.equals(providerName, that.providerName)
        && Objects.equals(shareName, that.shareName)
        && Objects.equals(storageRoot, that.storageRoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comment,
        connectionName,
        customMaxRetentionHours,
        managedEncryptionSettings,
        name,
        options,
        properties,
        providerName,
        shareName,
        storageRoot);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCatalog.class)
        .add("comment", comment)
        .add("connectionName", connectionName)
        .add("customMaxRetentionHours", customMaxRetentionHours)
        .add("managedEncryptionSettings", managedEncryptionSettings)
        .add("name", name)
        .add("options", options)
        .add("properties", properties)
        .add("providerName", providerName)
        .add("shareName", shareName)
        .add("storageRoot", storageRoot)
        .toString();
  }
}
