// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateVisualizationRequestVisualization {
  /** The display name of the visualization. */
  @JsonProperty("display_name")
  private String displayName;

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

  public CreateVisualizationRequestVisualization setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public CreateVisualizationRequestVisualization setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public CreateVisualizationRequestVisualization setSerializedOptions(String serializedOptions) {
    this.serializedOptions = serializedOptions;
    return this;
  }

  public String getSerializedOptions() {
    return serializedOptions;
  }

  public CreateVisualizationRequestVisualization setSerializedQueryPlan(
      String serializedQueryPlan) {
    this.serializedQueryPlan = serializedQueryPlan;
    return this;
  }

  public String getSerializedQueryPlan() {
    return serializedQueryPlan;
  }

  public CreateVisualizationRequestVisualization setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public String getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateVisualizationRequestVisualization that = (CreateVisualizationRequestVisualization) o;
    return Objects.equals(displayName, that.displayName)
        && Objects.equals(queryId, that.queryId)
        && Objects.equals(serializedOptions, that.serializedOptions)
        && Objects.equals(serializedQueryPlan, that.serializedQueryPlan)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, queryId, serializedOptions, serializedQueryPlan, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateVisualizationRequestVisualization.class)
        .add("displayName", displayName)
        .add("queryId", queryId)
        .add("serializedOptions", serializedOptions)
        .add("serializedQueryPlan", serializedQueryPlan)
        .add("typeValue", typeValue)
        .toString();
  }
}
