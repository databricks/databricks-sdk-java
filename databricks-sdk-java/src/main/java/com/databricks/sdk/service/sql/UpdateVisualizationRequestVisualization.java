// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateVisualizationRequestVisualization {
  /** The display name of the visualization. */
  @JsonProperty("display_name")
  private String displayName;

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

  public UpdateVisualizationRequestVisualization setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public UpdateVisualizationRequestVisualization setSerializedOptions(String serializedOptions) {
    this.serializedOptions = serializedOptions;
    return this;
  }

  public String getSerializedOptions() {
    return serializedOptions;
  }

  public UpdateVisualizationRequestVisualization setSerializedQueryPlan(
      String serializedQueryPlan) {
    this.serializedQueryPlan = serializedQueryPlan;
    return this;
  }

  public String getSerializedQueryPlan() {
    return serializedQueryPlan;
  }

  public UpdateVisualizationRequestVisualization setType(String typeValue) {
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
    UpdateVisualizationRequestVisualization that = (UpdateVisualizationRequestVisualization) o;
    return Objects.equals(displayName, that.displayName)
        && Objects.equals(serializedOptions, that.serializedOptions)
        && Objects.equals(serializedQueryPlan, that.serializedQueryPlan)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, serializedOptions, serializedQueryPlan, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateVisualizationRequestVisualization.class)
        .add("displayName", displayName)
        .add("serializedOptions", serializedOptions)
        .add("serializedQueryPlan", serializedQueryPlan)
        .add("typeValue", typeValue)
        .toString();
  }
}
