// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ModelVersionInfoPb {
  @JsonProperty("aliases")
  private Collection<RegisteredModelAlias> aliases;

  @JsonProperty("browse_only")
  private Boolean browseOnly;

  @JsonProperty("catalog_name")
  private String catalogName;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("created_at")
  private Long createdAt;

  @JsonProperty("created_by")
  private String createdBy;

  @JsonProperty("id")
  private String id;

  @JsonProperty("metastore_id")
  private String metastoreId;

  @JsonProperty("model_name")
  private String modelName;

  @JsonProperty("model_version_dependencies")
  private DependencyList modelVersionDependencies;

  @JsonProperty("run_id")
  private String runId;

  @JsonProperty("run_workspace_id")
  private Long runWorkspaceId;

  @JsonProperty("schema_name")
  private String schemaName;

  @JsonProperty("source")
  private String source;

  @JsonProperty("status")
  private ModelVersionInfoStatus status;

  @JsonProperty("storage_location")
  private String storageLocation;

  @JsonProperty("updated_at")
  private Long updatedAt;

  @JsonProperty("updated_by")
  private String updatedBy;

  @JsonProperty("version")
  private Long version;

  public ModelVersionInfoPb setAliases(Collection<RegisteredModelAlias> aliases) {
    this.aliases = aliases;
    return this;
  }

  public Collection<RegisteredModelAlias> getAliases() {
    return aliases;
  }

  public ModelVersionInfoPb setBrowseOnly(Boolean browseOnly) {
    this.browseOnly = browseOnly;
    return this;
  }

  public Boolean getBrowseOnly() {
    return browseOnly;
  }

  public ModelVersionInfoPb setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public ModelVersionInfoPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public ModelVersionInfoPb setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public ModelVersionInfoPb setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public ModelVersionInfoPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ModelVersionInfoPb setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public ModelVersionInfoPb setModelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  public String getModelName() {
    return modelName;
  }

  public ModelVersionInfoPb setModelVersionDependencies(DependencyList modelVersionDependencies) {
    this.modelVersionDependencies = modelVersionDependencies;
    return this;
  }

  public DependencyList getModelVersionDependencies() {
    return modelVersionDependencies;
  }

  public ModelVersionInfoPb setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public ModelVersionInfoPb setRunWorkspaceId(Long runWorkspaceId) {
    this.runWorkspaceId = runWorkspaceId;
    return this;
  }

  public Long getRunWorkspaceId() {
    return runWorkspaceId;
  }

  public ModelVersionInfoPb setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public ModelVersionInfoPb setSource(String source) {
    this.source = source;
    return this;
  }

  public String getSource() {
    return source;
  }

  public ModelVersionInfoPb setStatus(ModelVersionInfoStatus status) {
    this.status = status;
    return this;
  }

  public ModelVersionInfoStatus getStatus() {
    return status;
  }

  public ModelVersionInfoPb setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public ModelVersionInfoPb setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public ModelVersionInfoPb setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public ModelVersionInfoPb setVersion(Long version) {
    this.version = version;
    return this;
  }

  public Long getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelVersionInfoPb that = (ModelVersionInfoPb) o;
    return Objects.equals(aliases, that.aliases)
        && Objects.equals(browseOnly, that.browseOnly)
        && Objects.equals(catalogName, that.catalogName)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(id, that.id)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(modelName, that.modelName)
        && Objects.equals(modelVersionDependencies, that.modelVersionDependencies)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runWorkspaceId, that.runWorkspaceId)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(source, that.source)
        && Objects.equals(status, that.status)
        && Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aliases,
        browseOnly,
        catalogName,
        comment,
        createdAt,
        createdBy,
        id,
        metastoreId,
        modelName,
        modelVersionDependencies,
        runId,
        runWorkspaceId,
        schemaName,
        source,
        status,
        storageLocation,
        updatedAt,
        updatedBy,
        version);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelVersionInfoPb.class)
        .add("aliases", aliases)
        .add("browseOnly", browseOnly)
        .add("catalogName", catalogName)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("id", id)
        .add("metastoreId", metastoreId)
        .add("modelName", modelName)
        .add("modelVersionDependencies", modelVersionDependencies)
        .add("runId", runId)
        .add("runWorkspaceId", runWorkspaceId)
        .add("schemaName", schemaName)
        .add("source", source)
        .add("status", status)
        .add("storageLocation", storageLocation)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .add("version", version)
        .toString();
  }
}
