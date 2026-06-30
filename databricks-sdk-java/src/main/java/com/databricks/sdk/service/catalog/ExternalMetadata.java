// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
public class ExternalMetadata {
  /** List of columns associated with the external metadata object. */
  @JsonProperty("columns")
  private Collection<String> columns;

  /** Time at which this external metadata object was created. */
  @JsonProperty("create_time")
  private String createTime;

  /** Username of external metadata object creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /** User-provided free-form text description. */
  @JsonProperty("description")
  private String description;

  /** Type of entity within the external system. */
  @JsonProperty("entity_type")
  private String entityType;

  /** Unique identifier of the external metadata object. */
  @JsonProperty("id")
  private String id;

  /** Unique identifier of parent metastore. */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /** Name of the external metadata object. */
  @JsonProperty("name")
  private String name;

  /** Owner of the external metadata object. */
  @JsonProperty("owner")
  private String owner;

  /** A map of key-value properties attached to the external metadata object. */
  @JsonProperty("properties")
  private Map<String, String> properties;

  /** Type of external system. */
  @JsonProperty("system_type")
  private SystemType systemType;

  /** Time at which this external metadata object was last modified. */
  @JsonProperty("update_time")
  private String updateTime;

  /** Username of user who last modified external metadata object. */
  @JsonProperty("updated_by")
  private String updatedBy;

  /** URL associated with the external metadata object. */
  @JsonProperty("url")
  private String url;

  public ExternalMetadata setColumns(Collection<String> columns) {
    this.columns = columns;
    return this;
  }

  public Collection<String> getColumns() {
    return columns;
  }

  public ExternalMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public ExternalMetadata setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public ExternalMetadata setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ExternalMetadata setEntityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  public String getEntityType() {
    return entityType;
  }

  public ExternalMetadata setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ExternalMetadata setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public ExternalMetadata setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ExternalMetadata setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public ExternalMetadata setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public ExternalMetadata setSystemType(SystemType systemType) {
    this.systemType = systemType;
    return this;
  }

  public SystemType getSystemType() {
    return systemType;
  }

  public ExternalMetadata setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public ExternalMetadata setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public ExternalMetadata setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalMetadata that = (ExternalMetadata) o;
    return Objects.equals(columns, that.columns)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(description, that.description)
        && Objects.equals(entityType, that.entityType)
        && Objects.equals(id, that.id)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(properties, that.properties)
        && Objects.equals(systemType, that.systemType)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(updatedBy, that.updatedBy)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        columns,
        createTime,
        createdBy,
        description,
        entityType,
        id,
        metastoreId,
        name,
        owner,
        properties,
        systemType,
        updateTime,
        updatedBy,
        url);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalMetadata.class)
        .add("columns", columns)
        .add("createTime", createTime)
        .add("createdBy", createdBy)
        .add("description", description)
        .add("entityType", entityType)
        .add("id", id)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
        .add("properties", properties)
        .add("systemType", systemType)
        .add("updateTime", updateTime)
        .add("updatedBy", updatedBy)
        .add("url", url)
        .toString();
  }
}
