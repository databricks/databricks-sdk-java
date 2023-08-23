// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class RegisteredModelInfo {
  /** List of aliases associated with the registered model */
  @JsonProperty("aliases")
  private Collection<RegisteredModelAlias> aliases;

  /** The name of the catalog where the schema and the registered model reside */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** The comment attached to the registered model */
  @JsonProperty("comment")
  private String comment;

  /** Creation timestamp of the registered model in milliseconds since the Unix epoch */
  @JsonProperty("created_at")
  private Long createdAt;

  /** The identifier of the user who created the registered model */
  @JsonProperty("created_by")
  private String createdBy;

  /** The three-level (fully qualified) name of the registered model */
  @JsonProperty("full_name")
  private String fullName;

  /** The unique identifier of the metastore */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /** The name of the registered model */
  @JsonProperty("name")
  private String name;

  /** The identifier of the user who owns the registered model */
  @JsonProperty("owner")
  private String owner;

  /** The name of the schema where the registered model resides */
  @JsonProperty("schema_name")
  private String schemaName;

  /** The storage location on the cloud under which model version data files are stored */
  @JsonProperty("storage_location")
  private String storageLocation;

  /** Last-update timestamp of the registered model in milliseconds since the Unix epoch */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** The identifier of the user who updated the registered model last time */
  @JsonProperty("updated_by")
  private String updatedBy;

  public RegisteredModelInfo setAliases(Collection<RegisteredModelAlias> aliases) {
    this.aliases = aliases;
    return this;
  }

  public Collection<RegisteredModelAlias> getAliases() {
    return aliases;
  }

  public RegisteredModelInfo setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public RegisteredModelInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public RegisteredModelInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public RegisteredModelInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public RegisteredModelInfo setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public RegisteredModelInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public RegisteredModelInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public RegisteredModelInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public RegisteredModelInfo setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public RegisteredModelInfo setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public RegisteredModelInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public RegisteredModelInfo setUpdatedBy(String updatedBy) {
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
    RegisteredModelInfo that = (RegisteredModelInfo) o;
    return Objects.equals(aliases, that.aliases)
        && Objects.equals(catalogName, that.catalogName)
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
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aliases,
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
        updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(RegisteredModelInfo.class)
        .add("aliases", aliases)
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
        .toString();
  }
}
