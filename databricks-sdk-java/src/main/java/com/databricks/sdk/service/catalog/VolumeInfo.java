// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  public VolumeInfo setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public VolumeInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public VolumeInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public VolumeInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public VolumeInfo setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public VolumeInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public VolumeInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public VolumeInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public VolumeInfo setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public VolumeInfo setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public VolumeInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public VolumeInfo setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public VolumeInfo setVolumeId(String volumeId) {
    this.volumeId = volumeId;
    return this;
  }

  public String getVolumeId() {
    return volumeId;
  }

  public VolumeInfo setVolumeType(VolumeType volumeType) {
    this.volumeType = volumeType;
    return this;
  }

  public VolumeType getVolumeType() {
    return volumeType;
  }

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
