// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/**
 * <p>CreateSchema class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateSchema {
  /** Name of parent catalog. */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Name of schema, relative to parent catalog. */
  @JsonProperty("name")
  private String name;

  /** A map of key-value properties attached to the securable. */
  @JsonProperty("properties")
  private Map<String, String> properties;

  /** Storage root URL for managed tables within schema. */
  @JsonProperty("storage_root")
  private String storageRoot;

  /**
   * <p>Setter for the field <code>catalogName</code>.</p>
   *
   * @param catalogName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateSchema} object
   */
  public CreateSchema setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  /**
   * <p>Getter for the field <code>catalogName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCatalogName() {
    return catalogName;
  }

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateSchema} object
   */
  public CreateSchema setComment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * <p>Getter for the field <code>comment</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getComment() {
    return comment;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateSchema} object
   */
  public CreateSchema setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>properties</code>.</p>
   *
   * @param properties a {@link java.util.Map} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateSchema} object
   */
  public CreateSchema setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  /**
   * <p>Getter for the field <code>properties</code>.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getProperties() {
    return properties;
  }

  /**
   * <p>Setter for the field <code>storageRoot</code>.</p>
   *
   * @param storageRoot a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateSchema} object
   */
  public CreateSchema setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  /**
   * <p>Getter for the field <code>storageRoot</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStorageRoot() {
    return storageRoot;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateSchema that = (CreateSchema) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(properties, that.properties)
        && Objects.equals(storageRoot, that.storageRoot);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(catalogName, comment, name, properties, storageRoot);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateSchema.class)
        .add("catalogName", catalogName)
        .add("comment", comment)
        .add("name", name)
        .add("properties", properties)
        .add("storageRoot", storageRoot)
        .toString();
  }
}
