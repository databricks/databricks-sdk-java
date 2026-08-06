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
 * model destinations (for example a foundation model or an external LLM reached through a
 * ModelProviderService). Applies centralized access control, rate limits, guardrails, and auditing
 * to the traffic it serves.
 */
@Generated
public class ModelService {
  /** User-provided description. */
  @JsonProperty("comment")
  private String comment;

  /**
   * Operational configuration: destinations, routing, rate limits, inference table. Required on
   * CreateModelService; on UpdateModelService it is required only when `config` (or a `config.*`
   * subpath) appears in `update_mask`.
   */
  @JsonProperty("config")
  private ModelServiceConfig config;

  /** When the model service was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Creator identity. */
  @JsonProperty("created_by")
  private String createdBy;

  /**
   * The resolved owner of the ModelService. Falls back to the caller's identity when `owner` is not
   * explicitly set on creation.
   */
  @JsonProperty("effective_owner")
  private String effectiveOwner;

  /**
   * Optimistic concurrency control token. Server-generated from the entity's state and returned on
   * every read. To use it as an if-match precondition on a mutation, echo the last-read value back
   * via the dedicated `etag` field on the Update / Delete request; the server rejects the mutation
   * if the stored etag differs.
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

  /** The owner of the model service. Write-only; read owner via effective_owner. */
  @JsonProperty("owner")
  private String owner;

  /**
   * Unified API types this endpoint supports (e.g. "chat", "embeddings", "completions"). Derived
   * from the destinations' backing models / providers at read time.
   */
  @JsonProperty("supported_api_types")
  private Collection<String> supportedApiTypes;

  /** When the model service was last modified. */
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

  public ModelService setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
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
        && Objects.equals(owner, that.owner)
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
        owner,
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
        .add("owner", owner)
        .add("supportedApiTypes", supportedApiTypes)
        .add("updateTime", updateTime)
        .add("updatedBy", updatedBy)
        .toString();
  }
}
