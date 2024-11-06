// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateVisualizationRequest {
  /** */
  @JsonIgnore private String id;

  /**
   * Field mask is required to be passed into the PATCH request. Field mask specifies which fields
   * of the setting payload will be updated. The field mask needs to be supplied as single string.
   * To specify multiple fields in the field mask, use comma as the separator (no space).
   */
  @JsonProperty("update_mask")
  private String updateMask;

  /** */
  @JsonProperty("visualization")
  private UpdateVisualizationRequestVisualization visualization;

  public UpdateVisualizationRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateVisualizationRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  public UpdateVisualizationRequest setVisualization(
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
    UpdateVisualizationRequest that = (UpdateVisualizationRequest) o;
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
    return new ToStringer(UpdateVisualizationRequest.class)
        .add("id", id)
        .add("updateMask", updateMask)
        .add("visualization", visualization)
        .toString();
  }
}
