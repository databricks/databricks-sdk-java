// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Visualization {
  /** The timestamp indicating when the visualization was created. */
  @JsonProperty("create_time")
  private String createTime;

  /** The display name of the visualization. */
  @JsonProperty("display_name")
  private String displayName;

  /** UUID identifying the visualization. */
  @JsonProperty("id")
  private String id;

  /** UUID of the query that the visualization is attached to. */
  @JsonProperty("query_id")
  private String queryId;

  /**
   * The visualization options varies widely from one visualization type to the next and is
   * unsupported. Databricks does not recommend modifying visualization options directly.
   */
  @JsonProperty("serialized_options")
  private String serializedOptions;

  /**
   * The visualization query plan varies widely from one visualization type to the next and is
   * unsupported. Databricks does not recommend modifying the visualization query plan directly.
   */
  @JsonProperty("serialized_query_plan")
  private String serializedQueryPlan;

  /** The type of visualization: counter, table, funnel, and so on. */
  @JsonProperty("type")
  private String typeValue;

  /** The timestamp indicating when the visualization was updated. */
  @JsonProperty("update_time")
  private String updateTime;

  public Visualization setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public Visualization setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public Visualization setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Visualization setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public Visualization setSerializedOptions(String serializedOptions) {
    this.serializedOptions = serializedOptions;
    return this;
  }

  public String getSerializedOptions() {
    return serializedOptions;
  }

  public Visualization setSerializedQueryPlan(String serializedQueryPlan) {
    this.serializedQueryPlan = serializedQueryPlan;
    return this;
  }

  public String getSerializedQueryPlan() {
    return serializedQueryPlan;
  }

  public Visualization setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public String getType() {
    return typeValue;
  }

  public Visualization setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Visualization that = (Visualization) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(id, that.id)
        && Objects.equals(queryId, that.queryId)
        && Objects.equals(serializedOptions, that.serializedOptions)
        && Objects.equals(serializedQueryPlan, that.serializedQueryPlan)
        && Objects.equals(typeValue, that.typeValue)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        displayName,
        id,
        queryId,
        serializedOptions,
        serializedQueryPlan,
        typeValue,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Visualization.class)
        .add("createTime", createTime)
        .add("displayName", displayName)
        .add("id", id)
        .add("queryId", queryId)
        .add("serializedOptions", serializedOptions)
        .add("serializedQueryPlan", serializedQueryPlan)
        .add("typeValue", typeValue)
        .add("updateTime", updateTime)
        .toString();
  }
}
