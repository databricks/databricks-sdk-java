// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class CreateSchema {
  /** Name of parent catalog. */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /**
   * Dropped objects in the schema remain recoverable for this number of hours before they are
   * permanently purged. The value must be 0 or within the range allowed for the metastore. Schemas
   * that do not set their own value inherit the parent catalog's value.
   */
  @JsonProperty("custom_max_retention_hours")
  private Long customMaxRetentionHours;

  /** Name of schema, relative to parent catalog. */
  @JsonProperty("name")
  private String name;

  /** A map of key-value properties attached to the securable. */
  @JsonProperty("properties")
  private Map<String, String> properties;

  /**
   * Managed tables and volumes in the schema are stored under this storage root URL. The path must
   * be inside an external location on which the caller has the CREATE MANAGED STORAGE privilege. If
   * omitted, managed data is stored under the parent catalog's storage root, or under the
   * metastore's root storage location when the catalog has none. Schemas in Delta Sharing catalogs
   * cannot have a storage root, and schemas in a federated Hive metastore catalog must set one.
   */
  @JsonProperty("storage_root")
  private String storageRoot;

  public CreateSchema setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public CreateSchema setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateSchema setCustomMaxRetentionHours(Long customMaxRetentionHours) {
    this.customMaxRetentionHours = customMaxRetentionHours;
    return this;
  }

  public Long getCustomMaxRetentionHours() {
    return customMaxRetentionHours;
  }

  public CreateSchema setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateSchema setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public CreateSchema setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  public String getStorageRoot() {
    return storageRoot;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateSchema that = (CreateSchema) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(comment, that.comment)
        && Objects.equals(customMaxRetentionHours, that.customMaxRetentionHours)
        && Objects.equals(name, that.name)
        && Objects.equals(properties, that.properties)
        && Objects.equals(storageRoot, that.storageRoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        catalogName, comment, customMaxRetentionHours, name, properties, storageRoot);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateSchema.class)
        .add("catalogName", catalogName)
        .add("comment", comment)
        .add("customMaxRetentionHours", customMaxRetentionHours)
        .add("name", name)
        .add("properties", properties)
        .add("storageRoot", storageRoot)
        .toString();
  }
}
