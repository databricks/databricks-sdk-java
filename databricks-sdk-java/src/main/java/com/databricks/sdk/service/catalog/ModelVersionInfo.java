// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ModelVersionInfo {
  /** The name of the catalog containing the model version */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** The comment attached to the model version */
  @JsonProperty("comment")
  private String comment;

  /** */
  @JsonProperty("created_at")
  private Long createdAt;

  /** The identifier of the user who created the model version */
  @JsonProperty("created_by")
  private String createdBy;

  /** The unique identifier of the model version */
  @JsonProperty("id")
  private String id;

  /** The unique identifier of the metastore containing the model version */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /** The name of the parent registered model of the model version, relative to parent schema */
  @JsonProperty("model_name")
  private String modelName;

  /** Model version dependencies, for feature-store packaged models */
  @JsonProperty("model_version_dependencies")
  private Collection<Dependency> modelVersionDependencies;

  /**
   * MLflow run ID used when creating the model version, if ``source`` was generated by an
   * experiment run stored in an MLflow tracking server
   */
  @JsonProperty("run_id")
  private String runId;

  /**
   * ID of the Databricks workspace containing the MLflow run that generated this model version, if
   * applicable
   */
  @JsonProperty("run_workspace_id")
  private Long runWorkspaceId;

  /** The name of the schema containing the model version, relative to parent catalog */
  @JsonProperty("schema_name")
  private String schemaName;

  /** URI indicating the location of the source artifacts (files) for the model version */
  @JsonProperty("source")
  private String source;

  /**
   * Current status of the model version. Newly created model versions start in PENDING_REGISTRATION
   * status, then move to READY status once the model version files are uploaded and the model
   * version is finalized. Only model versions in READY status can be loaded for inference or
   * served.
   */
  @JsonProperty("status")
  private ModelVersionInfoStatus status;

  /** The storage location on the cloud under which model version data files are stored */
  @JsonProperty("storage_location")
  private String storageLocation;

  /** */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** The identifier of the user who updated the model version last time */
  @JsonProperty("updated_by")
  private String updatedBy;

  /** Integer model version number, used to reference the model version in API requests. */
  @JsonProperty("version")
  private Long version;

  public ModelVersionInfo setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public ModelVersionInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public ModelVersionInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public ModelVersionInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public ModelVersionInfo setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ModelVersionInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public ModelVersionInfo setModelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  public String getModelName() {
    return modelName;
  }

  public ModelVersionInfo setModelVersionDependencies(
      Collection<Dependency> modelVersionDependencies) {
    this.modelVersionDependencies = modelVersionDependencies;
    return this;
  }

  public Collection<Dependency> getModelVersionDependencies() {
    return modelVersionDependencies;
  }

  public ModelVersionInfo setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public ModelVersionInfo setRunWorkspaceId(Long runWorkspaceId) {
    this.runWorkspaceId = runWorkspaceId;
    return this;
  }

  public Long getRunWorkspaceId() {
    return runWorkspaceId;
  }

  public ModelVersionInfo setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public ModelVersionInfo setSource(String source) {
    this.source = source;
    return this;
  }

  public String getSource() {
    return source;
  }

  public ModelVersionInfo setStatus(ModelVersionInfoStatus status) {
    this.status = status;
    return this;
  }

  public ModelVersionInfoStatus getStatus() {
    return status;
  }

  public ModelVersionInfo setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public ModelVersionInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public ModelVersionInfo setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public ModelVersionInfo setVersion(Long version) {
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
    ModelVersionInfo that = (ModelVersionInfo) o;
    return Objects.equals(catalogName, that.catalogName)
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
    return new ToStringer(ModelVersionInfo.class)
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
