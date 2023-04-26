// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/**
 * <p>CatalogInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>catalogType</code>.</p>
   *
   * @param catalogType a {@link com.databricks.sdk.service.catalog.CatalogType} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
   */
  public CatalogInfo setCatalogType(CatalogType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * <p>Getter for the field <code>catalogType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.CatalogType} object
   */
  public CatalogType getCatalogType() {
    return catalogType;
  }

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
   */
  public CatalogInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * <p>Getter for the field <code>comment</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getComment() {
    return comment;
  }

  /**
   * <p>Setter for the field <code>createdAt</code>.</p>
   *
   * @param createdAt a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
   */
  public CatalogInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdAt</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreatedAt() {
    return createdAt;
  }

  /**
   * <p>Setter for the field <code>createdBy</code>.</p>
   *
   * @param createdBy a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
   */
  public CatalogInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdBy</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * <p>Setter for the field <code>effectiveAutoMaintenanceFlag</code>.</p>
   *
   * @param effectiveAutoMaintenanceFlag a {@link com.databricks.sdk.service.catalog.EffectiveAutoMaintenanceFlag} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
   */
  public CatalogInfo setEffectiveAutoMaintenanceFlag(
      EffectiveAutoMaintenanceFlag effectiveAutoMaintenanceFlag) {
    this.effectiveAutoMaintenanceFlag = effectiveAutoMaintenanceFlag;
    return this;
  }

  /**
   * <p>Getter for the field <code>effectiveAutoMaintenanceFlag</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.EffectiveAutoMaintenanceFlag} object
   */
  public EffectiveAutoMaintenanceFlag getEffectiveAutoMaintenanceFlag() {
    return effectiveAutoMaintenanceFlag;
  }

  /**
   * <p>Setter for the field <code>enableAutoMaintenance</code>.</p>
   *
   * @param enableAutoMaintenance a {@link com.databricks.sdk.service.catalog.EnableAutoMaintenance} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
   */
  public CatalogInfo setEnableAutoMaintenance(EnableAutoMaintenance enableAutoMaintenance) {
    this.enableAutoMaintenance = enableAutoMaintenance;
    return this;
  }

  /**
   * <p>Getter for the field <code>enableAutoMaintenance</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.EnableAutoMaintenance} object
   */
  public EnableAutoMaintenance getEnableAutoMaintenance() {
    return enableAutoMaintenance;
  }

  /**
   * <p>Setter for the field <code>metastoreId</code>.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
   */
  public CatalogInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  /**
   * <p>Getter for the field <code>metastoreId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getMetastoreId() {
    return metastoreId;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
   */
  public CatalogInfo setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>owner</code>.</p>
   *
   * @param owner a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
   */
  public CatalogInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * <p>Getter for the field <code>owner</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getOwner() {
    return owner;
  }

  /**
   * <p>Setter for the field <code>properties</code>.</p>
   *
   * @param properties a {@link java.util.Map} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
   */
  public CatalogInfo setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  /**
   * <p>Getter for the field <code>properties</code>.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getProperties() {
    return properties;
  }

  /**
   * <p>Setter for the field <code>providerName</code>.</p>
   *
   * @param providerName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
   */
  public CatalogInfo setProviderName(String providerName) {
    this.providerName = providerName;
    return this;
  }

  /**
   * <p>Getter for the field <code>providerName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getProviderName() {
    return providerName;
  }

  /**
   * <p>Setter for the field <code>shareName</code>.</p>
   *
   * @param shareName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
   */
  public CatalogInfo setShareName(String shareName) {
    this.shareName = shareName;
    return this;
  }

  /**
   * <p>Getter for the field <code>shareName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getShareName() {
    return shareName;
  }

  /**
   * <p>Setter for the field <code>storageLocation</code>.</p>
   *
   * @param storageLocation a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
   */
  public CatalogInfo setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  /**
   * <p>Getter for the field <code>storageLocation</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStorageLocation() {
    return storageLocation;
  }

  /**
   * <p>Setter for the field <code>storageRoot</code>.</p>
   *
   * @param storageRoot a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
   */
  public CatalogInfo setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  /**
   * <p>Getter for the field <code>storageRoot</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStorageRoot() {
    return storageRoot;
  }

  /**
   * <p>Setter for the field <code>updatedAt</code>.</p>
   *
   * @param updatedAt a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
   */
  public CatalogInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>updatedAt</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getUpdatedAt() {
    return updatedAt;
  }

  /**
   * <p>Setter for the field <code>updatedBy</code>.</p>
   *
   * @param updatedBy a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CatalogInfo} object
   */
  public CatalogInfo setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * <p>Getter for the field <code>updatedBy</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUpdatedBy() {
    return updatedBy;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CatalogInfo that = (CatalogInfo) o;
    return Objects.equals(catalogType, that.catalogType)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(effectiveAutoMaintenanceFlag, that.effectiveAutoMaintenanceFlag)
        && Objects.equals(enableAutoMaintenance, that.enableAutoMaintenance)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(properties, that.properties)
        && Objects.equals(providerName, that.providerName)
        && Objects.equals(shareName, that.shareName)
        && Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(storageRoot, that.storageRoot)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        catalogType,
        comment,
        createdAt,
        createdBy,
        effectiveAutoMaintenanceFlag,
        enableAutoMaintenance,
        metastoreId,
        name,
        owner,
        properties,
        providerName,
        shareName,
        storageLocation,
        storageRoot,
        updatedAt,
        updatedBy);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CatalogInfo.class)
        .add("catalogType", catalogType)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("effectiveAutoMaintenanceFlag", effectiveAutoMaintenanceFlag)
        .add("enableAutoMaintenance", enableAutoMaintenance)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
        .add("properties", properties)
        .add("providerName", providerName)
        .add("shareName", shareName)
        .add("storageLocation", storageLocation)
        .add("storageRoot", storageRoot)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }
}
