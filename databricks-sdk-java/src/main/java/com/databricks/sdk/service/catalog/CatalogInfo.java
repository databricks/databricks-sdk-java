// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/**
 * A catalog is the first layer of Unity Catalog's three-level namespace and groups the schemas,
 * tables, volumes, and other data assets under it. Catalogs created through this API are standard
 * catalogs, Delta Sharing catalogs created from a share, or foreign catalogs that mirror a database
 * behind a connection to an external data source.
 */
@Generated
public class CatalogInfo {
  /**
   * Indicates whether the principal is limited to retrieving metadata for the associated object
   * through the BROWSE privilege when include_browse is enabled in the request.
   */
  @JsonProperty("browse_only")
  private Boolean browseOnly;

  /**
   * The server sets the catalog type from the create request. Catalogs created through this API are
   * MANAGED_CATALOG (standard catalogs), DELTASHARING_CATALOG when created from a share with
   * provider_name and share_name, or FOREIGN_CATALOG when created from a connection with
   * connection_name. The remaining types are provisioned by Databricks.
   */
  @JsonProperty("catalog_type")
  private CatalogType catalogType;

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

  /** Time at which this catalog was created, in epoch milliseconds. */
  @JsonProperty("created_at")
  private Long createdAt;

  /** Username of catalog creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /**
   * Dropped objects in the catalog remain recoverable for this number of hours before they are
   * permanently purged. The value applies to standard catalogs only, must be 0 or within the range
   * allowed for the metastore, and is inherited by schemas and tables that do not set their own
   * value.
   */
  @JsonProperty("custom_max_retention_hours")
  private Long customMaxRetentionHours;

  /**
   * Indicates the predictive optimization setting that is in effect for the catalog once inherited
   * values are resolved.
   */
  @JsonProperty("effective_predictive_optimization_flag")
  private EffectivePredictiveOptimizationFlag effectivePredictiveOptimizationFlag;

  /**
   * Whether predictive optimization is enabled for this catalog and the objects under it. Valid
   * values are ENABLE, DISABLE, and INHERIT, where INHERIT applies the account-level setting.
   * Standard catalogs start as INHERIT and other catalog types as DISABLE. It cannot be set when
   * creating a catalog; use the update method instead.
   */
  @JsonProperty("enable_predictive_optimization")
  private EnablePredictiveOptimization enablePredictiveOptimization;

  /** The full name of the catalog. Corresponds with the name field. */
  @JsonProperty("full_name")
  private String fullName;

  /**
   * Whether the catalog is accessible from all workspaces attached to the metastore (OPEN) or only
   * from the workspaces bound to it (ISOLATED). It cannot be set when creating a catalog; change it
   * with the update method and manage the bound workspaces with the workspace bindings API. See
   * [Workspace-catalog binding].
   *
   * <p>[Workspace-catalog binding]: https://docs.databricks.com/aws/en/catalogs/binding
   */
  @JsonProperty("isolation_mode")
  private CatalogIsolationMode isolationMode;

  /**
   * Customer-managed key (CMK) settings control the encryption at rest of the catalog's managed
   * data.
   */
  @JsonProperty("managed_encryption_settings")
  private EncryptionSettings managedEncryptionSettings;

  /** Unique identifier of parent metastore. */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /**
   * The name of the catalog is stored in lowercase, can be at most 255 characters long, and cannot
   * contain periods, spaces, forward slashes, or control characters.
   */
  @JsonProperty("name")
  private String name;

  /** A map of key-value properties attached to the securable. */
  @JsonProperty("options")
  private Map<String, String> options;

  /** Username of current owner of catalog. */
  @JsonProperty("owner")
  private String owner;

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
   * Indicates the provisioning status of the catalog. It is present only for catalogs that are
   * provisioned asynchronously.
   */
  @JsonProperty("provisioning_info")
  private ProvisioningInfo provisioningInfo;

  /** The securable type is always CATALOG for a catalog. */
  @JsonProperty("securable_type")
  private SecurableType securableType;

  /**
   * The share under the Delta Sharing provider must be named here, together with provider_name, to
   * create a Delta Sharing catalog. The share cannot be changed after creation.
   */
  @JsonProperty("share_name")
  private String shareName;

  /**
   * The server derives this full storage location URL for managed tables and volumes within the
   * catalog from storage_root and the catalog ID.
   */
  @JsonProperty("storage_location")
  private String storageLocation;

  /**
   * Managed tables and volumes in the catalog are stored under this storage root URL. The path must
   * be inside an external location on which the caller has the CREATE MANAGED STORAGE privilege. If
   * omitted, managed data is stored under the metastore's root storage location, which must then be
   * configured. Delta Sharing catalogs cannot have a storage root.
   */
  @JsonProperty("storage_root")
  private String storageRoot;

  /** Time at which this catalog was last modified, in epoch milliseconds. */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** Username of user who last modified catalog. */
  @JsonProperty("updated_by")
  private String updatedBy;

  public CatalogInfo setBrowseOnly(Boolean browseOnly) {
    this.browseOnly = browseOnly;
    return this;
  }

  public Boolean getBrowseOnly() {
    return browseOnly;
  }

  public CatalogInfo setCatalogType(CatalogType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  public CatalogType getCatalogType() {
    return catalogType;
  }

  public CatalogInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CatalogInfo setConnectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

  public String getConnectionName() {
    return connectionName;
  }

  public CatalogInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public CatalogInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public CatalogInfo setCustomMaxRetentionHours(Long customMaxRetentionHours) {
    this.customMaxRetentionHours = customMaxRetentionHours;
    return this;
  }

  public Long getCustomMaxRetentionHours() {
    return customMaxRetentionHours;
  }

  public CatalogInfo setEffectivePredictiveOptimizationFlag(
      EffectivePredictiveOptimizationFlag effectivePredictiveOptimizationFlag) {
    this.effectivePredictiveOptimizationFlag = effectivePredictiveOptimizationFlag;
    return this;
  }

  public EffectivePredictiveOptimizationFlag getEffectivePredictiveOptimizationFlag() {
    return effectivePredictiveOptimizationFlag;
  }

  public CatalogInfo setEnablePredictiveOptimization(
      EnablePredictiveOptimization enablePredictiveOptimization) {
    this.enablePredictiveOptimization = enablePredictiveOptimization;
    return this;
  }

  public EnablePredictiveOptimization getEnablePredictiveOptimization() {
    return enablePredictiveOptimization;
  }

  public CatalogInfo setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public CatalogInfo setIsolationMode(CatalogIsolationMode isolationMode) {
    this.isolationMode = isolationMode;
    return this;
  }

  public CatalogIsolationMode getIsolationMode() {
    return isolationMode;
  }

  public CatalogInfo setManagedEncryptionSettings(EncryptionSettings managedEncryptionSettings) {
    this.managedEncryptionSettings = managedEncryptionSettings;
    return this;
  }

  public EncryptionSettings getManagedEncryptionSettings() {
    return managedEncryptionSettings;
  }

  public CatalogInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public CatalogInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CatalogInfo setOptions(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Map<String, String> getOptions() {
    return options;
  }

  public CatalogInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public CatalogInfo setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public CatalogInfo setProviderName(String providerName) {
    this.providerName = providerName;
    return this;
  }

  public String getProviderName() {
    return providerName;
  }

  public CatalogInfo setProvisioningInfo(ProvisioningInfo provisioningInfo) {
    this.provisioningInfo = provisioningInfo;
    return this;
  }

  public ProvisioningInfo getProvisioningInfo() {
    return provisioningInfo;
  }

  public CatalogInfo setSecurableType(SecurableType securableType) {
    this.securableType = securableType;
    return this;
  }

  public SecurableType getSecurableType() {
    return securableType;
  }

  public CatalogInfo setShareName(String shareName) {
    this.shareName = shareName;
    return this;
  }

  public String getShareName() {
    return shareName;
  }

  public CatalogInfo setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public CatalogInfo setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  public String getStorageRoot() {
    return storageRoot;
  }

  public CatalogInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public CatalogInfo setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CatalogInfo that = (CatalogInfo) o;
    return Objects.equals(browseOnly, that.browseOnly)
        && Objects.equals(catalogType, that.catalogType)
        && Objects.equals(comment, that.comment)
        && Objects.equals(connectionName, that.connectionName)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(customMaxRetentionHours, that.customMaxRetentionHours)
        && Objects.equals(
            effectivePredictiveOptimizationFlag, that.effectivePredictiveOptimizationFlag)
        && Objects.equals(enablePredictiveOptimization, that.enablePredictiveOptimization)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(isolationMode, that.isolationMode)
        && Objects.equals(managedEncryptionSettings, that.managedEncryptionSettings)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(options, that.options)
        && Objects.equals(owner, that.owner)
        && Objects.equals(properties, that.properties)
        && Objects.equals(providerName, that.providerName)
        && Objects.equals(provisioningInfo, that.provisioningInfo)
        && Objects.equals(securableType, that.securableType)
        && Objects.equals(shareName, that.shareName)
        && Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(storageRoot, that.storageRoot)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        browseOnly,
        catalogType,
        comment,
        connectionName,
        createdAt,
        createdBy,
        customMaxRetentionHours,
        effectivePredictiveOptimizationFlag,
        enablePredictiveOptimization,
        fullName,
        isolationMode,
        managedEncryptionSettings,
        metastoreId,
        name,
        options,
        owner,
        properties,
        providerName,
        provisioningInfo,
        securableType,
        shareName,
        storageLocation,
        storageRoot,
        updatedAt,
        updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(CatalogInfo.class)
        .add("browseOnly", browseOnly)
        .add("catalogType", catalogType)
        .add("comment", comment)
        .add("connectionName", connectionName)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("customMaxRetentionHours", customMaxRetentionHours)
        .add("effectivePredictiveOptimizationFlag", effectivePredictiveOptimizationFlag)
        .add("enablePredictiveOptimization", enablePredictiveOptimization)
        .add("fullName", fullName)
        .add("isolationMode", isolationMode)
        .add("managedEncryptionSettings", managedEncryptionSettings)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("options", options)
        .add("owner", owner)
        .add("properties", properties)
        .add("providerName", providerName)
        .add("provisioningInfo", provisioningInfo)
        .add("securableType", securableType)
        .add("shareName", shareName)
        .add("storageLocation", storageLocation)
        .add("storageRoot", storageRoot)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }
}
