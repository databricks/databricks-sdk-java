// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenieUpdateSpaceRequest {
  /** Optional description */
  @JsonProperty("description")
  private String description;

  /** Serialized export model for the space contents (full replacement) */
  @JsonProperty("serialized_space")
  private String serializedSpace;

  /** Genie space ID */
  @JsonIgnore private String spaceId;

  /** Optional title override */
  @JsonProperty("title")
  private String title;

  /** Optional warehouse override */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public GenieUpdateSpaceRequest setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public GenieUpdateSpaceRequest setSerializedSpace(String serializedSpace) {
    this.serializedSpace = serializedSpace;
    return this;
  }

  public String getSerializedSpace() {
    return serializedSpace;
  }

  public GenieUpdateSpaceRequest setSpaceId(String spaceId) {
    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public GenieUpdateSpaceRequest setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public GenieUpdateSpaceRequest setWarehouseId(String warehouseId) {
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
    GenieUpdateSpaceRequest that = (GenieUpdateSpaceRequest) o;
    return Objects.equals(description, that.description)
        && Objects.equals(serializedSpace, that.serializedSpace)
        && Objects.equals(spaceId, that.spaceId)
        && Objects.equals(title, that.title)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, serializedSpace, spaceId, title, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieUpdateSpaceRequest.class)
        .add("description", description)
        .add("serializedSpace", serializedSpace)
        .add("spaceId", spaceId)
        .add("title", title)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
