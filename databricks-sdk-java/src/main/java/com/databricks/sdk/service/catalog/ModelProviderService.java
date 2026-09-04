// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * A Unity Catalog securable that stores authentication and request configuration for an external
 * model provider, such as OpenAI, Azure OpenAI, or Amazon Bedrock. Model service destinations
 * reference it to send requests to that provider.
 *
 * <p>A model provider service can be referenced by multiple model services. A model service can
 * route across multiple model provider services for traffic splitting or failover.
 */
@Generated
public class ModelProviderService {
  /** User-provided description. */
  @JsonProperty("comment")
  private String comment;

  /**
   * Provider authentication, exposed models, request-forwarding controls, rate limits, and payload
   * logging. Required on Create. On Update, it is required only when `config` or one of its
   * subpaths appears in `update_mask`.
   */
  @JsonProperty("config")
  private ModelProviderServiceConfig config;

  /** Time the provider service was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Creator identity. */
  @JsonProperty("created_by")
  private String createdBy;

  /** Owner of the model provider service. */
  @JsonProperty("effective_owner")
  private String effectiveOwner;

  /**
   * Optimistic concurrency token returned on every read. To make an Update or Delete conditional,
   * pass the last-read value in that request's `etag` field. In REST responses, this value is a
   * base64 string; URL-encode it when setting the `etag` query parameter.
   */
  @JsonProperty("etag")
  private String etag;

  /** Metastore hosting the provider service. */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /**
   * Resource name of the provider service. Format:
   * `model-provider-services/{catalog}.{schema}.{model_provider_service}`. Each `{...}` component
   * is capped at 255 characters individually. Server-derived on Create from `parent` +
   * `model_provider_service_id`; required and immutable on Update/Get/Delete.
   */
  @JsonProperty("name")
  private String name;

  /** Time the provider service was last modified. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  /** Identity of the last updater. */
  @JsonProperty("updated_by")
  private String updatedBy;

  public ModelProviderService setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public ModelProviderService setConfig(ModelProviderServiceConfig config) {
    this.config = config;
    return this;
  }

  public ModelProviderServiceConfig getConfig() {
    return config;
  }

  public ModelProviderService setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public ModelProviderService setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public ModelProviderService setEffectiveOwner(String effectiveOwner) {
    this.effectiveOwner = effectiveOwner;
    return this;
  }

  public String getEffectiveOwner() {
    return effectiveOwner;
  }

  public ModelProviderService setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public ModelProviderService setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public ModelProviderService setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ModelProviderService setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public ModelProviderService setUpdatedBy(String updatedBy) {
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
    ModelProviderService that = (ModelProviderService) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(config, that.config)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(effectiveOwner, that.effectiveOwner)
        && Objects.equals(etag, that.etag)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
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
        updateTime,
        updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderService.class)
        .add("comment", comment)
        .add("config", config)
        .add("createTime", createTime)
        .add("createdBy", createdBy)
        .add("effectiveOwner", effectiveOwner)
        .add("etag", etag)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("updateTime", updateTime)
        .add("updatedBy", updatedBy)
        .toString();
  }
}
