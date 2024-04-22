// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class SchemaInfo {
  /**
   * Indicates whether the principal is limited to retrieving metadata for the associated object
   * through the BROWSE privilege when include_browse is enabled in the request.
   */
  @JsonProperty("browse_only")
  private Boolean browseOnly;

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
  @JsonProperty("effective_predictive_optimization_flag")
  private EffectivePredictiveOptimizationFlag effectivePredictiveOptimizationFlag;

  /** Whether predictive optimization should be enabled for this object and objects under it. */
  @JsonProperty("enable_predictive_optimization")
  private EnablePredictiveOptimization enablePredictiveOptimization;

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

  /** The unique identifier of the schema. */
  @JsonProperty("schema_id")
  private String schemaId;

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

  public SchemaInfo setBrowseOnly(Boolean browseOnly) {
    this.browseOnly = browseOnly;
    return this;
  }

  public Boolean getBrowseOnly() {
    return browseOnly;
  }

  public SchemaInfo setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public SchemaInfo setCatalogType(String catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  public String getCatalogType() {
    return catalogType;
  }

  public SchemaInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public SchemaInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public SchemaInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public SchemaInfo setEffectivePredictiveOptimizationFlag(
      EffectivePredictiveOptimizationFlag effectivePredictiveOptimizationFlag) {
    this.effectivePredictiveOptimizationFlag = effectivePredictiveOptimizationFlag;
    return this;
  }

  public EffectivePredictiveOptimizationFlag getEffectivePredictiveOptimizationFlag() {
    return effectivePredictiveOptimizationFlag;
  }

  public SchemaInfo setEnablePredictiveOptimization(
      EnablePredictiveOptimization enablePredictiveOptimization) {
    this.enablePredictiveOptimization = enablePredictiveOptimization;
    return this;
  }

  public EnablePredictiveOptimization getEnablePredictiveOptimization() {
    return enablePredictiveOptimization;
  }

  public SchemaInfo setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public SchemaInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public SchemaInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public SchemaInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public SchemaInfo setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public SchemaInfo setSchemaId(String schemaId) {
    this.schemaId = schemaId;
    return this;
  }

  public String getSchemaId() {
    return schemaId;
  }

  public SchemaInfo setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public SchemaInfo setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  public String getStorageRoot() {
    return storageRoot;
  }

  public SchemaInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public SchemaInfo setUpdatedBy(String updatedBy) {
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
    SchemaInfo that = (SchemaInfo) o;
    return Objects.equals(browseOnly, that.browseOnly)
        && Objects.equals(catalogName, that.catalogName)
        && Objects.equals(catalogType, that.catalogType)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(
            effectivePredictiveOptimizationFlag, that.effectivePredictiveOptimizationFlag)
        && Objects.equals(enablePredictiveOptimization, that.enablePredictiveOptimization)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(properties, that.properties)
        && Objects.equals(schemaId, that.schemaId)
        && Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(storageRoot, that.storageRoot)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        browseOnly,
        catalogName,
        catalogType,
        comment,
        createdAt,
        createdBy,
        effectivePredictiveOptimizationFlag,
        enablePredictiveOptimization,
        fullName,
        metastoreId,
        name,
        owner,
        properties,
        schemaId,
        storageLocation,
        storageRoot,
        updatedAt,
        updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(SchemaInfo.class)
        .add("browseOnly", browseOnly)
        .add("catalogName", catalogName)
        .add("catalogType", catalogType)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("effectivePredictiveOptimizationFlag", effectivePredictiveOptimizationFlag)
        .add("enablePredictiveOptimization", enablePredictiveOptimization)
        .add("fullName", fullName)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
        .add("properties", properties)
        .add("schemaId", schemaId)
        .add("storageLocation", storageLocation)
        .add("storageRoot", storageRoot)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }
}
