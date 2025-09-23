// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Feature list wrap all the features for a model version */
@Generated
public class FeatureList {
  /** */
  @JsonProperty("features")
  private Collection<LinkedFeature> features;

  public FeatureList setFeatures(Collection<LinkedFeature> features) {
    this.features = features;
    return this;
  }

  public Collection<LinkedFeature> getFeatures() {
    return features;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FeatureList that = (FeatureList) o;
    return Objects.equals(features, that.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(features);
  }

  @Override
  public String toString() {
    return new ToStringer(FeatureList.class).add("features", features).toString();
  }
}
