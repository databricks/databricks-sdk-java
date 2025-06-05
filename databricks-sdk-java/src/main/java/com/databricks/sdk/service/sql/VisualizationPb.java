// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class VisualizationPb {
  @JsonProperty("create_time")
  private String createTime;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("id")
  private String id;

  @JsonProperty("query_id")
  private String queryId;

  @JsonProperty("serialized_options")
  private String serializedOptions;

  @JsonProperty("serialized_query_plan")
  private String serializedQueryPlan;

  @JsonProperty("type")
  private String typeValue;

  @JsonProperty("update_time")
  private String updateTime;

  public VisualizationPb setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public VisualizationPb setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public VisualizationPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public VisualizationPb setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public VisualizationPb setSerializedOptions(String serializedOptions) {
    this.serializedOptions = serializedOptions;
    return this;
  }

  public String getSerializedOptions() {
    return serializedOptions;
  }

  public VisualizationPb setSerializedQueryPlan(String serializedQueryPlan) {
    this.serializedQueryPlan = serializedQueryPlan;
    return this;
  }

  public String getSerializedQueryPlan() {
    return serializedQueryPlan;
  }

  public VisualizationPb setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public String getType() {
    return typeValue;
  }

  public VisualizationPb setUpdateTime(String updateTime) {
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
    VisualizationPb that = (VisualizationPb) o;
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
    return new ToStringer(VisualizationPb.class)
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
