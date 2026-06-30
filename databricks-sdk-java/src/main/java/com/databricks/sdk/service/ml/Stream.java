// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * A Stream is a governed UC entity representing an external streaming data source. The
 * source_config oneof determines the streaming platform source (e.g. Kafka, Kinesis, etc.).
 */
@Generated
public class Stream {
  /**
   * Indicates whether the principal is limited to retrieving metadata for the associated object
   * through the BROWSE privilege when include_browse is enabled in the request.
   */
  @JsonProperty("browse_only")
  private Boolean browseOnly;

  /** Specifies how to connect and authenticate to the stream platform. */
  @JsonProperty("connection_config")
  private StreamConnectionConfig connectionConfig;

  /** Time at which this Stream was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Username of the Stream creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /** User-provided description. */
  @JsonProperty("description")
  private String description;

  /**
   * Configuration for streaming data ingestion: the managed table storing an offline copy of
   * forward fill data and optional historical backfill.
   */
  @JsonProperty("ingestion_config")
  private IngestionConfig ingestionConfig;

  /** Full three-part (catalog.schema.stream) name of the stream. */
  @JsonProperty("name")
  private String name;

  /**
   * Schema definitions for the stream. Currently only direct schemas are supported. In a future
   * milestone, we will support schema registries through a UC Connection.
   */
  @JsonProperty("schema_config")
  private StreamSchemaConfig schemaConfig;

  /** Source-specific configuration. Determines the streaming platform source. */
  @JsonProperty("source_config")
  private StreamSourceConfig sourceConfig;

  /** Time at which this Stream was last modified. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  /** Username of user who last modified the Stream. */
  @JsonProperty("updated_by")
  private String updatedBy;

  public Stream setBrowseOnly(Boolean browseOnly) {
    this.browseOnly = browseOnly;
    return this;
  }

  public Boolean getBrowseOnly() {
    return browseOnly;
  }

  public Stream setConnectionConfig(StreamConnectionConfig connectionConfig) {
    this.connectionConfig = connectionConfig;
    return this;
  }

  public StreamConnectionConfig getConnectionConfig() {
    return connectionConfig;
  }

  public Stream setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Stream setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public Stream setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Stream setIngestionConfig(IngestionConfig ingestionConfig) {
    this.ingestionConfig = ingestionConfig;
    return this;
  }

  public IngestionConfig getIngestionConfig() {
    return ingestionConfig;
  }

  public Stream setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Stream setSchemaConfig(StreamSchemaConfig schemaConfig) {
    this.schemaConfig = schemaConfig;
    return this;
  }

  public StreamSchemaConfig getSchemaConfig() {
    return schemaConfig;
  }

  public Stream setSourceConfig(StreamSourceConfig sourceConfig) {
    this.sourceConfig = sourceConfig;
    return this;
  }

  public StreamSourceConfig getSourceConfig() {
    return sourceConfig;
  }

  public Stream setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public Stream setUpdatedBy(String updatedBy) {
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
    Stream that = (Stream) o;
    return Objects.equals(browseOnly, that.browseOnly)
        && Objects.equals(connectionConfig, that.connectionConfig)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(description, that.description)
        && Objects.equals(ingestionConfig, that.ingestionConfig)
        && Objects.equals(name, that.name)
        && Objects.equals(schemaConfig, that.schemaConfig)
        && Objects.equals(sourceConfig, that.sourceConfig)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        browseOnly,
        connectionConfig,
        createTime,
        createdBy,
        description,
        ingestionConfig,
        name,
        schemaConfig,
        sourceConfig,
        updateTime,
        updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(Stream.class)
        .add("browseOnly", browseOnly)
        .add("connectionConfig", connectionConfig)
        .add("createTime", createTime)
        .add("createdBy", createdBy)
        .add("description", description)
        .add("ingestionConfig", ingestionConfig)
        .add("name", name)
        .add("schemaConfig", schemaConfig)
        .add("sourceConfig", sourceConfig)
        .add("updateTime", updateTime)
        .add("updatedBy", updatedBy)
        .toString();
  }
}
