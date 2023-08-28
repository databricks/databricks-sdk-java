// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateRegisteredModelRequest {
  /** The name of the catalog where the schema and the registered model reside */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** The comment attached to the registered model */
  @JsonProperty("comment")
  private String comment;

  /** The name of the registered model */
  @JsonProperty("name")
  private String name;

  /** The name of the schema where the registered model resides */
  @JsonProperty("schema_name")
  private String schemaName;

  /** The storage location on the cloud under which model version data files are stored */
  @JsonProperty("storage_location")
  private String storageLocation;

  public CreateRegisteredModelRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public CreateRegisteredModelRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateRegisteredModelRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateRegisteredModelRequest setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public CreateRegisteredModelRequest setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateRegisteredModelRequest that = (CreateRegisteredModelRequest) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(storageLocation, that.storageLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, comment, name, schemaName, storageLocation);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateRegisteredModelRequest.class)
        .add("catalogName", catalogName)
        .add("comment", comment)
        .add("name", name)
        .add("schemaName", schemaName)
        .add("storageLocation", storageLocation)
        .toString();
  }
}
