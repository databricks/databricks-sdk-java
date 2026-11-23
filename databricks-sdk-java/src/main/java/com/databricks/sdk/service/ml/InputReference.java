// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The input that supplies a value. A value from the request comes from a Feature whose source is a
 * RequestSource.
 */
@Generated
public class InputReference {
  /** Specifies another Feature whose output supplies the value. */
  @JsonProperty("feature")
  private FeatureReference feature;

  public InputReference setFeature(FeatureReference feature) {
    this.feature = feature;
    return this;
  }

  public FeatureReference getFeature() {
    return feature;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InputReference that = (InputReference) o;
    return Objects.equals(feature, that.feature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feature);
  }

  @Override
  public String toString() {
    return new ToStringer(InputReference.class).add("feature", feature).toString();
  }
}
