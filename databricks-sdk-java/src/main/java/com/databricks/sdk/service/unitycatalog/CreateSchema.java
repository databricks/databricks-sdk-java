// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

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
}
