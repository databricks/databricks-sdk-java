// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class FeatureLineage {
  /** List of feature specs that contain this feature. */
  @JsonProperty("feature_specs")
  private Collection<FeatureLineageFeatureSpec> featureSpecs;

  /** List of Unity Catalog models that were trained on this feature. */
  @JsonProperty("models")
  private Collection<FeatureLineageModel> models;

  /** List of online features that use this feature as source. */
  @JsonProperty("online_features")
  private Collection<FeatureLineageOnlineFeature> onlineFeatures;

  public FeatureLineage setFeatureSpecs(Collection<FeatureLineageFeatureSpec> featureSpecs) {
    this.featureSpecs = featureSpecs;
    return this;
  }

  public Collection<FeatureLineageFeatureSpec> getFeatureSpecs() {
    return featureSpecs;
  }

  public FeatureLineage setModels(Collection<FeatureLineageModel> models) {
    this.models = models;
    return this;
  }

  public Collection<FeatureLineageModel> getModels() {
    return models;
  }

  public FeatureLineage setOnlineFeatures(Collection<FeatureLineageOnlineFeature> onlineFeatures) {
    this.onlineFeatures = onlineFeatures;
    return this;
  }

  public Collection<FeatureLineageOnlineFeature> getOnlineFeatures() {
    return onlineFeatures;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FeatureLineage that = (FeatureLineage) o;
    return Objects.equals(featureSpecs, that.featureSpecs)
        && Objects.equals(models, that.models)
        && Objects.equals(onlineFeatures, that.onlineFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureSpecs, models, onlineFeatures);
  }

  @Override
  public String toString() {
    return new ToStringer(FeatureLineage.class)
        .add("featureSpecs", featureSpecs)
        .add("models", models)
        .add("onlineFeatures", onlineFeatures)
        .toString();
  }
}
