// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateFeatureRequest {
  /** Feature to create. */
  @JsonProperty("feature")
  private Feature feature;

  public CreateFeatureRequest setFeature(Feature feature) {
    this.feature = feature;
    return this;
  }

  public Feature getFeature() {
    return feature;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateFeatureRequest that = (CreateFeatureRequest) o;
    return Objects.equals(feature, that.feature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feature);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateFeatureRequest.class).add("feature", feature).toString();
  }
}
