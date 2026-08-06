// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * A governed MCP server registration in Unity Catalog. Acts as a container securable that
 * references an MCP server -- customer-external via a UC Connection, or Databricks-hosted via an
 * internal server -- and exposes its tools for discovery, authorization, and invocation.
 */
@Generated
public class McpService {
  /** User-provided description. */
  @JsonProperty("comment")
  private String comment;

  /**
   * Operational configuration: connection, tool selectors, rate limit. Required on
   * CreateMcpService; on UpdateMcpService it is required only when `config` (or a `config.*`
   * subpath) appears in `update_mask`.
   */
  @JsonProperty("config")
  private McpServiceConfig config;

  /** When the MCP service was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Creator identity. */
  @JsonProperty("created_by")
  private String createdBy;

  /**
   * The resolved owner of the MCP service. Falls back to the caller's identity when `owner` is not
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

  /** Metastore hosting the MCP service. */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /**
   * Resource name of the MCP service. Format: `mcp-services/{catalog}.{schema}.{mcp_service}`. Each
   * `{...}` component is capped at 255 characters individually. Server-derived on Create from
   * `parent` + `mcp_service_id`; required and immutable on Update/Get/Delete.
   */
  @JsonProperty("name")
  private String name;

  /** The owner of the MCP service. Write-only; read owner via effective_owner. */
  @JsonProperty("owner")
  private String owner;

  /** When the MCP service was last modified. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  /** Identity of the last updater. */
  @JsonProperty("updated_by")
  private String updatedBy;

  public McpService setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public McpService setConfig(McpServiceConfig config) {
    this.config = config;
    return this;
  }

  public McpServiceConfig getConfig() {
    return config;
  }

  public McpService setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public McpService setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public McpService setEffectiveOwner(String effectiveOwner) {
    this.effectiveOwner = effectiveOwner;
    return this;
  }

  public String getEffectiveOwner() {
    return effectiveOwner;
  }

  public McpService setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public McpService setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public McpService setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public McpService setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public McpService setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public McpService setUpdatedBy(String updatedBy) {
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
    McpService that = (McpService) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(config, that.config)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(effectiveOwner, that.effectiveOwner)
        && Objects.equals(etag, that.etag)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
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
        updateTime,
        updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(McpService.class)
        .add("comment", comment)
        .add("config", config)
        .add("createTime", createTime)
        .add("createdBy", createdBy)
        .add("effectiveOwner", effectiveOwner)
        .add("etag", etag)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
        .add("updateTime", updateTime)
        .add("updatedBy", updatedBy)
        .toString();
  }
}
