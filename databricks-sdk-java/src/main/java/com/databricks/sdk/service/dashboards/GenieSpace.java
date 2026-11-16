// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * A Genie space that business users query in natural language. Its configuration (data sources,
 * instructions, sample questions and benchmarks) travels as a JSON string in `serialized_space`;
 * the other fields are metadata about the space.
 */
@Generated
public class GenieSpace {
  /** Time when the Genie space was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Description of the Genie Space */
  @JsonProperty("description")
  private String description;

  /**
   * ETag for this space. Pass this value back in the update request to prevent overwriting
   * concurrent changes.
   */
  @JsonProperty("etag")
  private String etag;

  /** Path of the workspace folder that contains the space. */
  @JsonProperty("parent_path")
  private String parentPath;

  /**
   * Configuration of the space (data sources, instructions, sample questions and benchmarks) as a
   * JSON string. [Get Genie Space](:method:genie/getspace) returns it only when
   * `include_serialized_space` is true, and List Genie spaces never returns it. For the JSON format
   * and its validation rules, see https://docs.databricks.com/aws/en/genie-agents/conversation-api.
   */
  @JsonProperty("serialized_space")
  private String serializedSpace;

  /** Genie space ID */
  @JsonProperty("space_id")
  private String spaceId;

  /** Title of the Genie Space */
  @JsonProperty("title")
  private String title;

  /**
   * Time when the Genie space was last modified, matching the value shown in the Genie Agent UI.
   */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  /** ID of the SQL warehouse that runs the queries Genie generates for this space. */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public GenieSpace setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public GenieSpace setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public GenieSpace setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public GenieSpace setParentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

  public String getParentPath() {
    return parentPath;
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

  public GenieSpace setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
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
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(description, that.description)
        && Objects.equals(etag, that.etag)
        && Objects.equals(parentPath, that.parentPath)
        && Objects.equals(serializedSpace, that.serializedSpace)
        && Objects.equals(spaceId, that.spaceId)
        && Objects.equals(title, that.title)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        description,
        etag,
        parentPath,
        serializedSpace,
        spaceId,
        title,
        updateTime,
        warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieSpace.class)
        .add("createTime", createTime)
        .add("description", description)
        .add("etag", etag)
        .add("parentPath", parentPath)
        .add("serializedSpace", serializedSpace)
        .add("spaceId", spaceId)
        .add("title", title)
        .add("updateTime", updateTime)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
