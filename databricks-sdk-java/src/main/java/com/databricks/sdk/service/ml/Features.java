// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** One entry of a feature spec: a Feature, a feature table lookup, or a feature function. */
@Generated
public class Features {
  /** A Feature, referenced by its three-part Unity Catalog name. */
  @JsonProperty("declarative_feature")
  private DeclarativeFeature declarativeFeature;

  /** A feature function. */
  @JsonProperty("feature_function")
  private FeatureFunction featureFunction;

  /** A feature table lookup. */
  @JsonProperty("feature_lookup")
  private FeatureLookup featureLookup;

  public Features setDeclarativeFeature(DeclarativeFeature declarativeFeature) {
    this.declarativeFeature = declarativeFeature;
    return this;
  }

  public DeclarativeFeature getDeclarativeFeature() {
    return declarativeFeature;
  }

  public Features setFeatureFunction(FeatureFunction featureFunction) {
    this.featureFunction = featureFunction;
    return this;
  }

  public FeatureFunction getFeatureFunction() {
    return featureFunction;
  }

  public Features setFeatureLookup(FeatureLookup featureLookup) {
    this.featureLookup = featureLookup;
    return this;
  }

  public FeatureLookup getFeatureLookup() {
    return featureLookup;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Features that = (Features) o;
    return Objects.equals(declarativeFeature, that.declarativeFeature)
        && Objects.equals(featureFunction, that.featureFunction)
        && Objects.equals(featureLookup, that.featureLookup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(declarativeFeature, featureFunction, featureLookup);
  }

  @Override
  public String toString() {
    return new ToStringer(Features.class)
        .add("declarativeFeature", declarativeFeature)
        .add("featureFunction", featureFunction)
        .add("featureLookup", featureLookup)
        .toString();
  }
}
