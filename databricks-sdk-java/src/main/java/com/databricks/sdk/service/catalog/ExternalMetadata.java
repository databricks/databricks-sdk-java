// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * Metadata about an object that lives outside of Databricks, such as a Kafka topic, a Tableau
 * dashboard, or a Salesforce table. An external metadata object is a Unity Catalog securable that
 * can be the source or the target of external lineage relationships, so that data flows into and
 * out of Databricks appear in the Unity Catalog lineage graph. See [External lineage].
 *
 * <p>[External lineage]:
 * https://docs.databricks.com/aws/en/data-governance/unity-catalog/external-lineage
 */
@Generated
public class ExternalMetadata {
  /**
   * Names of the columns of the object, used for column-level mappings in external lineage
   * relationships. Column names must be unique within the list, and the combined size of all column
   * names is limited.
   */
  @JsonProperty("columns")
  private Collection<String> columns;

  /** Time at which this external metadata object was created. */
  @JsonProperty("create_time")
  private String createTime;

  /** Username of external metadata object creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /**
   * User-provided free-form text description of the object. The description must not exceed 5000
   * characters.
   */
  @JsonProperty("description")
  private String description;

  /**
   * Type of the object within the external system, such as a table, a report, or a dashboard. The
   * value is free-form text of at most 255 characters.
   */
  @JsonProperty("entity_type")
  private String entityType;

  /**
   * Unique identifier of the external metadata object. The ID is a UUID that the system assigns on
   * creation.
   */
  @JsonProperty("id")
  private String id;

  /** Unique identifier of parent metastore. */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /**
   * Name of the external metadata object. The name is unique within the metastore, must follow the
   * [Unity Catalog naming requirements], and is stored in lowercase. It cannot be changed after
   * creation, and external lineage relationships refer to the object by this name.
   *
   * <p>[Unity Catalog naming requirements]:
   * https://docs.databricks.com/aws/en/data-governance/unity-catalog/requirements#naming-requirements
   */
  @JsonProperty("name")
  private String name;

  /**
   * Owner of the external metadata object. Defaults to the creator. To change the owner, send an
   * update whose update mask includes `owner`.
   */
  @JsonProperty("owner")
  private String owner;

  /**
   * Key-value properties attached to the object. Keys and values must be non-empty, and the
   * combined length of all keys and values must not exceed 5000 characters.
   */
  @JsonProperty("properties")
  private Map<String, String> properties;

  /**
   * Type of the external system that holds the object. Use `OTHER` for a system that is not in the
   * list.
   */
  @JsonProperty("system_type")
  private SystemType systemType;

  /** Time at which this external metadata object was last modified. */
  @JsonProperty("update_time")
  private String updateTime;

  /** Username of user who last modified external metadata object. */
  @JsonProperty("updated_by")
  private String updatedBy;

  /**
   * URL of the object in the external system. When set, lineage graph viewers can follow it to the
   * external asset. The URL must not exceed 2048 characters.
   */
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
