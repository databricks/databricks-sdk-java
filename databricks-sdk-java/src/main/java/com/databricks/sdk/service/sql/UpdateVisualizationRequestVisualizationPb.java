// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateVisualizationRequestVisualizationPb {
  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("serialized_options")
  private String serializedOptions;

  @JsonProperty("serialized_query_plan")
  private String serializedQueryPlan;

  @JsonProperty("type")
  private String typeValue;

  public UpdateVisualizationRequestVisualizationPb setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public UpdateVisualizationRequestVisualizationPb setSerializedOptions(String serializedOptions) {
    this.serializedOptions = serializedOptions;
    return this;
  }

  public String getSerializedOptions() {
    return serializedOptions;
  }

  public UpdateVisualizationRequestVisualizationPb setSerializedQueryPlan(
      String serializedQueryPlan) {
    this.serializedQueryPlan = serializedQueryPlan;
    return this;
  }

  public String getSerializedQueryPlan() {
    return serializedQueryPlan;
  }

  public UpdateVisualizationRequestVisualizationPb setType(String typeValue) {
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
    UpdateVisualizationRequestVisualizationPb that = (UpdateVisualizationRequestVisualizationPb) o;
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
    return new ToStringer(UpdateVisualizationRequestVisualizationPb.class)
        .add("displayName", displayName)
        .add("serializedOptions", serializedOptions)
        .add("serializedQueryPlan", serializedQueryPlan)
        .add("typeValue", typeValue)
        .toString();
  }
}
