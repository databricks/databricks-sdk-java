// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

public class CatalogInfo {
  /** The type of the catalog. */
  @JsonProperty("catalog_type")
  private CatalogType catalogType;

  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Time at which this catalog was created, in epoch milliseconds. */
  @JsonProperty("created_at")
  private Long createdAt;

  /** Username of catalog creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /** */
  @JsonProperty("effective_auto_maintenance_flag")
  private EffectiveAutoMaintenanceFlag effectiveAutoMaintenanceFlag;

  /** Whether auto maintenance should be enabled for this object and objects under it. */
  @JsonProperty("enable_auto_maintenance")
  private EnableAutoMaintenance enableAutoMaintenance;

  /** Unique identifier of parent metastore. */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /** Name of catalog. */
  @JsonProperty("name")
  private String name;

  /** Username of current owner of catalog. */
  @JsonProperty("owner")
  private String owner;

  /** A map of key-value properties attached to the securable. */
  @JsonProperty("properties")
  private Map<String, String> properties;

  /**
   * The name of delta sharing provider.
   *
   * <p>A Delta Sharing catalog is a catalog that is based on a Delta share on a remote sharing
   * server.
   */
  @JsonProperty("provider_name")
  private String providerName;

  /** The name of the share under the share provider. */
  @JsonProperty("share_name")
  private String shareName;

  /** Storage Location URL (full path) for managed tables within catalog. */
  @JsonProperty("storage_location")
  private String storageLocation;

  /** Storage root URL for managed tables within catalog. */
  @JsonProperty("storage_root")
  private String storageRoot;

  /** Time at which this catalog was last modified, in epoch milliseconds. */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** Username of user who last modified catalog. */
  @JsonProperty("updated_by")
  private String updatedBy;

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

  public CatalogInfo setEffectiveAutoMaintenanceFlag(
      EffectiveAutoMaintenanceFlag effectiveAutoMaintenanceFlag) {
    this.effectiveAutoMaintenanceFlag = effectiveAutoMaintenanceFlag;
    return this;
  }

  public EffectiveAutoMaintenanceFlag getEffectiveAutoMaintenanceFlag() {
    return effectiveAutoMaintenanceFlag;
  }

  public CatalogInfo setEnableAutoMaintenance(EnableAutoMaintenance enableAutoMaintenance) {
    this.enableAutoMaintenance = enableAutoMaintenance;
    return this;
  }

  public EnableAutoMaintenance getEnableAutoMaintenance() {
    return enableAutoMaintenance;
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
}
