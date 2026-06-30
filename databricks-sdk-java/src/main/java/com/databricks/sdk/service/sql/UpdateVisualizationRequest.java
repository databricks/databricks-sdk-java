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
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   *
   * <p>A field mask of `*` indicates full replacement. It’s recommended to always explicitly list
   * the fields being updated and avoid using `*` wildcards, as it can lead to unintended results if
   * the API changes in the future.
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
