// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Collection;
import java.util.Objects;

/**
 * A governed AI Gateway endpoint in Unity Catalog that routes inference requests to one or more
 * destinations, such as a Databricks foundation model or an external model reached through a model
 * provider service. Applies centralized access control, rate limits, and auditing to its traffic.
 */
@Generated
public class ModelService {
  /** User-provided description. */
  @JsonProperty("comment")
  private String comment;

  /**
   * Destinations, routing, rate limits, and payload logging configuration. Required on Create. On
   * Update, provide this field when `update_mask` contains `config` or one of its subpaths.
   */
  @JsonProperty("config")
  private ModelServiceConfig config;

  /** Time the model service was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Creator identity. */
  @JsonProperty("created_by")
  private String createdBy;

  /** Owner of the model service. */
  @JsonProperty("effective_owner")
  private String effectiveOwner;

  /**
   * Optimistic concurrency token returned on every read. To make an Update or Delete conditional,
   * pass the last-read value in that request's `etag` field. In REST responses, this value is a
   * base64 string; URL-encode it when setting the `etag` query parameter.
   */
  @JsonProperty("etag")
  private String etag;

  /** Metastore hosting the model service. */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /**
   * Resource name of the model service. Format:
   * `model-services/{catalog}.{schema}.{model_service}`. Each `{...}` component is capped at 255
   * characters individually. Server-derived on Create from `parent` + `model_service_id`; required
   * and immutable on Update/Get/Delete.
   */
  @JsonProperty("name")
  private String name;

  /**
   * API types supported across this service's destinations, such as `openai/v1/chat/completions`,
   * `openai/v1/embeddings`, and `mlflow/v1/chat/completions`. Derived from the backing models and
   * providers at read time.
   */
  @JsonProperty("supported_api_types")
  private Collection<String> supportedApiTypes;

  /** Time the model service was last modified. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  /** Identity of the last updater. */
  @JsonProperty("updated_by")
  private String updatedBy;

  public ModelService setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public ModelService setConfig(ModelServiceConfig config) {
    this.config = config;
    return this;
  }

  public ModelServiceConfig getConfig() {
    return config;
  }

  public ModelService setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public ModelService setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public ModelService setEffectiveOwner(String effectiveOwner) {
    this.effectiveOwner = effectiveOwner;
    return this;
  }

  public String getEffectiveOwner() {
    return effectiveOwner;
  }

  public ModelService setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public ModelService setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public ModelService setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ModelService setSupportedApiTypes(Collection<String> supportedApiTypes) {
    this.supportedApiTypes = supportedApiTypes;
    return this;
  }

  public Collection<String> getSupportedApiTypes() {
    return supportedApiTypes;
  }

  public ModelService setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public ModelService setUpdatedBy(String updatedBy) {
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
    ModelService that = (ModelService) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(config, that.config)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(effectiveOwner, that.effectiveOwner)
        && Objects.equals(etag, that.etag)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(supportedApiTypes, that.supportedApiTypes)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comment,
        config,
        createTime,
        createdBy,
        effectiveOwner,
        etag,
        metastoreId,
        name,
        supportedApiTypes,
        updateTime,
        updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelService.class)
        .add("comment", comment)
        .add("config", config)
        .add("createTime", createTime)
        .add("createdBy", createdBy)
        .add("effectiveOwner", effectiveOwner)
        .add("etag", etag)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("supportedApiTypes", supportedApiTypes)
        .add("updateTime", updateTime)
        .add("updatedBy", updatedBy)
        .toString();
  }
}
