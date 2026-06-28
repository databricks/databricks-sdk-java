// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class BatchCreateMaterializedFeaturesResponse {
  /** The created materialized features with assigned IDs. */
  @JsonProperty("materialized_features")
  private Collection<MaterializedFeature> materializedFeatures;

  public BatchCreateMaterializedFeaturesResponse setMaterializedFeatures(
      Collection<MaterializedFeature> materializedFeatures) {
    this.materializedFeatures = materializedFeatures;
    return this;
  }

  public Collection<MaterializedFeature> getMaterializedFeatures() {
    return materializedFeatures;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BatchCreateMaterializedFeaturesResponse that = (BatchCreateMaterializedFeaturesResponse) o;
    return Objects.equals(materializedFeatures, that.materializedFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materializedFeatures);
  }

  @Override
  public String toString() {
    return new ToStringer(BatchCreateMaterializedFeaturesResponse.class)
        .add("materializedFeatures", materializedFeatures)
        .toString();
  }
}
