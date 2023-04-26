// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>VolumeInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class VolumeInfo {
  /** The name of the catalog where the schema and the volume are */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** The comment attached to the volume */
  @JsonProperty("comment")
  private String comment;

  /** */
  @JsonProperty("created_at")
  private Long createdAt;

  /** The identifier of the user who created the volume */
  @JsonProperty("created_by")
  private String createdBy;

  /** The three-level (fully qualified) name of the volume */
  @JsonProperty("full_name")
  private String fullName;

  /** The unique identifier of the metastore */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /** The name of the volume */
  @JsonProperty("name")
  private String name;

  /** The identifier of the user who owns the volume */
  @JsonProperty("owner")
  private String owner;

  /** The name of the schema where the volume is */
  @JsonProperty("schema_name")
  private String schemaName;

  /** The storage location on the cloud */
  @JsonProperty("storage_location")
  private String storageLocation;

  /** */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** The identifier of the user who updated the volume last time */
  @JsonProperty("updated_by")
  private String updatedBy;

  /** The unique identifier of the volume */
  @JsonProperty("volume_id")
  private String volumeId;

  /** */
  @JsonProperty("volume_type")
  private VolumeType volumeType;

  /**
   * <p>Setter for the field <code>catalogName</code>.</p>
   *
   * @param catalogName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.VolumeInfo} object
   */
  public VolumeInfo setCatalogName(String catalogName) {
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
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.VolumeInfo} object
   */
  public VolumeInfo setComment(String comment) {
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
   * @return a {@link com.databricks.sdk.service.catalog.VolumeInfo} object
   */
  public VolumeInfo setCreatedAt(Long createdAt) {
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
   * @return a {@link com.databricks.sdk.service.catalog.VolumeInfo} object
   */
  public VolumeInfo setCreatedBy(String createdBy) {
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
   * <p>Setter for the field <code>fullName</code>.</p>
   *
   * @param fullName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.VolumeInfo} object
   */
  public VolumeInfo setFullName(String fullName) {
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
   * @return a {@link com.databricks.sdk.service.catalog.VolumeInfo} object
   */
  public VolumeInfo setMetastoreId(String metastoreId) {
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
   * @return a {@link com.databricks.sdk.service.catalog.VolumeInfo} object
   */
  public VolumeInfo setName(String name) {
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
   * @return a {@link com.databricks.sdk.service.catalog.VolumeInfo} object
   */
  public VolumeInfo setOwner(String owner) {
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
   * <p>Setter for the field <code>schemaName</code>.</p>
   *
   * @param schemaName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.VolumeInfo} object
   */
  public VolumeInfo setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  /**
   * <p>Getter for the field <code>schemaName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSchemaName() {
    return schemaName;
  }

  /**
   * <p>Setter for the field <code>storageLocation</code>.</p>
   *
   * @param storageLocation a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.VolumeInfo} object
   */
  public VolumeInfo setStorageLocation(String storageLocation) {
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
   * <p>Setter for the field <code>updatedAt</code>.</p>
   *
   * @param updatedAt a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.catalog.VolumeInfo} object
   */
  public VolumeInfo setUpdatedAt(Long updatedAt) {
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
   * @return a {@link com.databricks.sdk.service.catalog.VolumeInfo} object
   */
  public VolumeInfo setUpdatedBy(String updatedBy) {
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

  /**
   * <p>Setter for the field <code>volumeId</code>.</p>
   *
   * @param volumeId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.VolumeInfo} object
   */
  public VolumeInfo setVolumeId(String volumeId) {
    this.volumeId = volumeId;
    return this;
  }

  /**
   * <p>Getter for the field <code>volumeId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getVolumeId() {
    return volumeId;
  }

  /**
   * <p>Setter for the field <code>volumeType</code>.</p>
   *
   * @param volumeType a {@link com.databricks.sdk.service.catalog.VolumeType} object
   * @return a {@link com.databricks.sdk.service.catalog.VolumeInfo} object
   */
  public VolumeInfo setVolumeType(VolumeType volumeType) {
    this.volumeType = volumeType;
    return this;
  }

  /**
   * <p>Getter for the field <code>volumeType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.VolumeType} object
   */
  public VolumeType getVolumeType() {
    return volumeType;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VolumeInfo that = (VolumeInfo) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy)
        && Objects.equals(volumeId, that.volumeId)
        && Objects.equals(volumeType, that.volumeType);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        catalogName,
        comment,
        createdAt,
        createdBy,
        fullName,
        metastoreId,
        name,
        owner,
        schemaName,
        storageLocation,
        updatedAt,
        updatedBy,
        volumeId,
        volumeType);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(VolumeInfo.class)
        .add("catalogName", catalogName)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("fullName", fullName)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
        .add("schemaName", schemaName)
        .add("storageLocation", storageLocation)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .add("volumeId", volumeId)
        .add("volumeType", volumeType)
        .toString();
  }
}
