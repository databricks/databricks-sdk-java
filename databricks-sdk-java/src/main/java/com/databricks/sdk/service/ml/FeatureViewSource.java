// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A data source composed from registered upstream Features. */
@Generated
public class FeatureViewSource {
  /** The upstream Features this source reads. Must include at least one feature. */
  @JsonProperty("feature_references")
  private Collection<FeatureReference> featureReferences;

  public FeatureViewSource setFeatureReferences(Collection<FeatureReference> featureReferences) {
    this.featureReferences = featureReferences;
    return this;
  }

  public Collection<FeatureReference> getFeatureReferences() {
    return featureReferences;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FeatureViewSource that = (FeatureViewSource) o;
    return Objects.equals(featureReferences, that.featureReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureReferences);
  }

  @Override
  public String toString() {
    return new ToStringer(FeatureViewSource.class)
        .add("featureReferences", featureReferences)
        .toString();
  }
}
