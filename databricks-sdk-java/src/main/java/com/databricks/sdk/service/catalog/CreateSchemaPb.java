// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
class CreateSchemaPb {
  @JsonProperty("catalog_name")
  private String catalogName;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("name")
  private String name;

  @JsonProperty("properties")
  private Map<String, String> properties;

  @JsonProperty("storage_root")
  private String storageRoot;

  public CreateSchemaPb setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public CreateSchemaPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateSchemaPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateSchemaPb setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public CreateSchemaPb setStorageRoot(String storageRoot) {
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
    CreateSchemaPb that = (CreateSchemaPb) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(properties, that.properties)
        && Objects.equals(storageRoot, that.storageRoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, comment, name, properties, storageRoot);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateSchemaPb.class)
        .add("catalogName", catalogName)
        .add("comment", comment)
        .add("name", name)
        .add("properties", properties)
        .add("storageRoot", storageRoot)
        .toString();
  }
}
