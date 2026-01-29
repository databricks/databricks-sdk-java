// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenieSpace {
  /** Description of the Genie Space */
  @JsonProperty("description")
  private String description;

  /**
   * The contents of the Genie Space in serialized string form. This field is excluded in List Genie
   * spaces responses. Use the [Get Genie Space](:method:genie/getspace) API to retrieve an example
   * response, which includes the `serialized_space` field. This field provides the structure of the
   * JSON string that represents the space's layout and components. NOTE: Keep example in sync with:
   * - docs/web/docs/genie/conversation-api.md -
   * data-rooms/data-rooms/test/unit/entities/testdata/documentation_example_serialized_space.json
   * NOTE: The proto example below is a simplified subset of the full JSON testdata file. See the
   * testdata file for a comprehensive example with all fields.
   */
  @JsonProperty("serialized_space")
  private String serializedSpace;

  /** Genie space ID */
  @JsonProperty("space_id")
  private String spaceId;

  /** Title of the Genie Space */
  @JsonProperty("title")
  private String title;

  /** Warehouse associated with the Genie Space */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public GenieSpace setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public GenieSpace setSerializedSpace(String serializedSpace) {
    this.serializedSpace = serializedSpace;
    return this;
  }

  public String getSerializedSpace() {
    return serializedSpace;
  }

  public GenieSpace setSpaceId(String spaceId) {
    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public GenieSpace setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public GenieSpace setWarehouseId(String warehouseId) {
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
    GenieSpace that = (GenieSpace) o;
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
    return new ToStringer(GenieSpace.class)
        .add("description", description)
        .add("serializedSpace", serializedSpace)
        .add("spaceId", spaceId)
        .add("title", title)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
