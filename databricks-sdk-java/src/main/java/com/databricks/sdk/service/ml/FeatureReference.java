// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A reference to one registered upstream Feature. A message rather than a bare name so an upstream
 * can later be pinned more precisely (e.g. by version) without a breaking type change.
 */
@Generated
public class FeatureReference {
  /** The three-part full name of the upstream Feature. */
  @JsonProperty("feature")
  private String feature;

  public FeatureReference setFeature(String feature) {
    this.feature = feature;
    return this;
  }

  public String getFeature() {
    return feature;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FeatureReference that = (FeatureReference) o;
    return Objects.equals(feature, that.feature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feature);
  }

  @Override
  public String toString() {
    return new ToStringer(FeatureReference.class).add("feature", feature).toString();
  }
}
