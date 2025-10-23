// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateMaterializedFeatureRequest {
  /** The materialized feature to create. */
  @JsonProperty("materialized_feature")
  private MaterializedFeature materializedFeature;

  public CreateMaterializedFeatureRequest setMaterializedFeature(
      MaterializedFeature materializedFeature) {
    this.materializedFeature = materializedFeature;
    return this;
  }

  public MaterializedFeature getMaterializedFeature() {
    return materializedFeature;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateMaterializedFeatureRequest that = (CreateMaterializedFeatureRequest) o;
    return Objects.equals(materializedFeature, that.materializedFeature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materializedFeature);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateMaterializedFeatureRequest.class)
        .add("materializedFeature", materializedFeature)
        .toString();
  }
}
