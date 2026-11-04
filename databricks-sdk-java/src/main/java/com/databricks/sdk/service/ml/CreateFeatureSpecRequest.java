// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateFeatureSpecRequest {
  /** The feature spec to create. */
  @JsonProperty("feature_spec")
  private FeatureSpec featureSpec;

  public CreateFeatureSpecRequest setFeatureSpec(FeatureSpec featureSpec) {
    this.featureSpec = featureSpec;
    return this;
  }

  public FeatureSpec getFeatureSpec() {
    return featureSpec;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateFeatureSpecRequest that = (CreateFeatureSpecRequest) o;
    return Objects.equals(featureSpec, that.featureSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureSpec);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateFeatureSpecRequest.class)
        .add("featureSpec", featureSpec)
        .toString();
  }
}
