// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenieCreateSpaceRequest {
  /** Optional description */
  @JsonProperty("description")
  private String description;

  /** Parent folder path where the space will be registered */
  @JsonProperty("parent_path")
  private String parentPath;

  /** Serialized export model for the space contents */
  @JsonProperty("serialized_space")
  private String serializedSpace;

  /** Optional title override */
  @JsonProperty("title")
  private String title;

  /** Warehouse to associate with the new space */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public GenieCreateSpaceRequest setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public GenieCreateSpaceRequest setParentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

  public String getParentPath() {
    return parentPath;
  }

  public GenieCreateSpaceRequest setSerializedSpace(String serializedSpace) {
    this.serializedSpace = serializedSpace;
    return this;
  }

  public String getSerializedSpace() {
    return serializedSpace;
  }

  public GenieCreateSpaceRequest setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public GenieCreateSpaceRequest setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieCreateSpaceRequest that = (GenieCreateSpaceRequest) o;
    return Objects.equals(description, that.description)
        && Objects.equals(parentPath, that.parentPath)
        && Objects.equals(serializedSpace, that.serializedSpace)
        && Objects.equals(title, that.title)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, parentPath, serializedSpace, title, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieCreateSpaceRequest.class)
        .add("description", description)
        .add("parentPath", parentPath)
        .add("serializedSpace", serializedSpace)
        .add("title", title)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
