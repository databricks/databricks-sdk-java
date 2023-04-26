// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/**
 * <p>SchemaInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SchemaInfo {
  /** Name of parent catalog. */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** The type of the parent catalog. */
  @JsonProperty("catalog_type")
  private String catalogType;

  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Time at which this schema was created, in epoch milliseconds. */
  @JsonProperty("created_at")
  private Long createdAt;

  /** Username of schema creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /** */
  @JsonProperty("effective_auto_maintenance_flag")
  private EffectiveAutoMaintenanceFlag effectiveAutoMaintenanceFlag;

  /** Whether auto maintenance should be enabled for this object and objects under it. */
  @JsonProperty("enable_auto_maintenance")
  private EnableAutoMaintenance enableAutoMaintenance;

  /** Full name of schema, in form of __catalog_name__.__schema_name__. */
  @JsonProperty("full_name")
  private String fullName;

  /** Unique identifier of parent metastore. */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /** Name of schema, relative to parent catalog. */
  @JsonProperty("name")
  private String name;

  /** Username of current owner of schema. */
  @JsonProperty("owner")
  private String owner;

  /** A map of key-value properties attached to the securable. */
  @JsonProperty("properties")
  private Map<String, String> properties;

  /** Storage location for managed tables within schema. */
  @JsonProperty("storage_location")
  private String storageLocation;

  /** Storage root URL for managed tables within schema. */
  @JsonProperty("storage_root")
  private String storageRoot;

  /** Time at which this schema was created, in epoch milliseconds. */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** Username of user who last modified schema. */
  @JsonProperty("updated_by")
  private String updatedBy;

  /**
   * <p>Setter for the field <code>catalogName</code>.</p>
   *
   * @param catalogName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.SchemaInfo} object
   */
  public SchemaInfo setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  /**
   * <p>Getter for the field <code>catalogName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCatalogName() {
    return catalogName;
  }

  /**
   * <p>Setter for the field <code>catalogType</code>.</p>
   *
   * @param catalogType a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.SchemaInfo} object
   */
  public SchemaInfo setCatalogType(String catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * <p>Getter for the field <code>catalogType</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCatalogType() {
    return catalogType;
  }

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.SchemaInfo} object
   */
  public SchemaInfo setComment(String comment) {
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
   * @return a {@link com.databricks.sdk.service.catalog.SchemaInfo} object
   */
  public SchemaInfo setCreatedAt(Long createdAt) {
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
   * @return a {@link com.databricks.sdk.service.catalog.SchemaInfo} object
   */
  public SchemaInfo setCreatedBy(String createdBy) {
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
   * @return a {@link com.databricks.sdk.service.catalog.SchemaInfo} object
   */
  public SchemaInfo setEffectiveAutoMaintenanceFlag(
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
   * @return a {@link com.databricks.sdk.service.catalog.SchemaInfo} object
   */
  public SchemaInfo setEnableAutoMaintenance(EnableAutoMaintenance enableAutoMaintenance) {
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
   * <p>Setter for the field <code>fullName</code>.</p>
   *
   * @param fullName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.SchemaInfo} object
   */
  public SchemaInfo setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * <p>Getter for the field <code>fullName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getFullName() {
    return fullName;
  }

  /**
   * <p>Setter for the field <code>metastoreId</code>.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.SchemaInfo} object
   */
  public SchemaInfo setMetastoreId(String metastoreId) {
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
   * @return a {@link com.databricks.sdk.service.catalog.SchemaInfo} object
   */
  public SchemaInfo setName(String name) {
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
   * @return a {@link com.databricks.sdk.service.catalog.SchemaInfo} object
   */
  public SchemaInfo setOwner(String owner) {
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
   * @return a {@link com.databricks.sdk.service.catalog.SchemaInfo} object
   */
  public SchemaInfo setProperties(Map<String, String> properties) {
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
   * <p>Setter for the field <code>storageLocation</code>.</p>
   *
   * @param storageLocation a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.SchemaInfo} object
   */
  public SchemaInfo setStorageLocation(String storageLocation) {
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
   * @return a {@link com.databricks.sdk.service.catalog.SchemaInfo} object
   */
  public SchemaInfo setStorageRoot(String storageRoot) {
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
   * @return a {@link com.databricks.sdk.service.catalog.SchemaInfo} object
   */
  public SchemaInfo setUpdatedAt(Long updatedAt) {
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
   * @return a {@link com.databricks.sdk.service.catalog.SchemaInfo} object
   */
  public SchemaInfo setUpdatedBy(String updatedBy) {
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
    SchemaInfo that = (SchemaInfo) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(catalogType, that.catalogType)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(effectiveAutoMaintenanceFlag, that.effectiveAutoMaintenanceFlag)
        && Objects.equals(enableAutoMaintenance, that.enableAutoMaintenance)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(properties, that.properties)
        && Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(storageRoot, that.storageRoot)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        catalogName,
        catalogType,
        comment,
        createdAt,
        createdBy,
        effectiveAutoMaintenanceFlag,
        enableAutoMaintenance,
        fullName,
        metastoreId,
        name,
        owner,
        properties,
        storageLocation,
        storageRoot,
        updatedAt,
        updatedBy);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SchemaInfo.class)
        .add("catalogName", catalogName)
        .add("catalogType", catalogType)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("effectiveAutoMaintenanceFlag", effectiveAutoMaintenanceFlag)
        .add("enableAutoMaintenance", enableAutoMaintenance)
        .add("fullName", fullName)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
        .add("properties", properties)
        .add("storageLocation", storageLocation)
        .add("storageRoot", storageRoot)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }
}
