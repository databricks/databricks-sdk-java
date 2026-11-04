// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A named set of features to serve, stored as a Unity Catalog function. */
@Generated
public class FeatureSpec {
  /** Output names of columns to leave out of the feature spec. */
  @JsonProperty("exclude_columns")
  private Collection<String> excludeColumns;

  /**
   * Extra pip requirements to install in the serving container, in addition to the defaults and
   * those resolved from the features.
   */
  @JsonProperty("extra_pip_requirements")
  private PipRequirements extraPipRequirements;

  /**
   * The Features (either a declarative one, or a lookup from a feature table, or a feature
   * function) to serve. A declarative feature (`DeclarativeFeature`) cannot be combined with
   * lookups (`FeatureLookup`) and functions (`FeatureFunction`) in one feature spec.
   */
  @JsonProperty("features")
  private Collection<Features> features;

  /** Three-part name (catalog.schema.feature_spec) of the feature spec. */
  @JsonProperty("name")
  private String name;

  public FeatureSpec setExcludeColumns(Collection<String> excludeColumns) {
    this.excludeColumns = excludeColumns;
    return this;
  }

  public Collection<String> getExcludeColumns() {
    return excludeColumns;
  }

  public FeatureSpec setExtraPipRequirements(PipRequirements extraPipRequirements) {
    this.extraPipRequirements = extraPipRequirements;
    return this;
  }

  public PipRequirements getExtraPipRequirements() {
    return extraPipRequirements;
  }

  public FeatureSpec setFeatures(Collection<Features> features) {
    this.features = features;
    return this;
  }

  public Collection<Features> getFeatures() {
    return features;
  }

  public FeatureSpec setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FeatureSpec that = (FeatureSpec) o;
    return Objects.equals(excludeColumns, that.excludeColumns)
        && Objects.equals(extraPipRequirements, that.extraPipRequirements)
        && Objects.equals(features, that.features)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludeColumns, extraPipRequirements, features, name);
  }

  @Override
  public String toString() {
    return new ToStringer(FeatureSpec.class)
        .add("excludeColumns", excludeColumns)
        .add("extraPipRequirements", extraPipRequirements)
        .add("features", features)
        .add("name", name)
        .toString();
  }
}
