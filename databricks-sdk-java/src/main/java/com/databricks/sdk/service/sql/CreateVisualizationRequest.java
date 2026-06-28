// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateVisualizationRequest {
  /** */
  @JsonProperty("visualization")
  private CreateVisualizationRequestVisualization visualization;

  public CreateVisualizationRequest setVisualization(
      CreateVisualizationRequestVisualization visualization) {
    this.visualization = visualization;
    return this;
  }

  public CreateVisualizationRequestVisualization getVisualization() {
    return visualization;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateVisualizationRequest that = (CreateVisualizationRequest) o;
    return Objects.equals(visualization, that.visualization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visualization);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateVisualizationRequest.class)
        .add("visualization", visualization)
        .toString();
  }
}
