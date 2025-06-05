// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateVisualizationRequestPb {
  @JsonIgnore private String id;

  @JsonProperty("update_mask")
  private String updateMask;

  @JsonProperty("visualization")
  private UpdateVisualizationRequestVisualization visualization;

  public UpdateVisualizationRequestPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateVisualizationRequestPb setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  public UpdateVisualizationRequestPb setVisualization(
      UpdateVisualizationRequestVisualization visualization) {
    this.visualization = visualization;
    return this;
  }

  public UpdateVisualizationRequestVisualization getVisualization() {
    return visualization;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateVisualizationRequestPb that = (UpdateVisualizationRequestPb) o;
    return Objects.equals(id, that.id)
        && Objects.equals(updateMask, that.updateMask)
        && Objects.equals(visualization, that.visualization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, updateMask, visualization);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateVisualizationRequestPb.class)
        .add("id", id)
        .add("updateMask", updateMask)
        .add("visualization", visualization)
        .toString();
  }
}
