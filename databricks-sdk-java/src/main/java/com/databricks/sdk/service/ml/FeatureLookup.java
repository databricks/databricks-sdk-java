// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Collection;
import java.util.Objects;

/** Features to look up from a feature table. */
@Generated
public class FeatureLookup {
  /**
   * Default values for features. Order is not significant, and GetFeatureSpec can return them in a
   * different order.
   */
  @JsonProperty("default_values")
  private Collection<DefaultValue> defaultValues;

  /** Names of the features to look up, or empty to look up every feature in the table. */
  @JsonProperty("feature_names")
  private Collection<String> featureNames;

  /** Lookback window to use when performing point-in-time lookup. */
  @JsonProperty("lookback_window")
  private Duration lookbackWindow;

  /** Keys to use when joining with the feature table. */
  @JsonProperty("lookup_keys")
  private Collection<String> lookupKeys;

  /**
   * Output names for features, in place of their names in the feature table. Order is not
   * significant, and GetFeatureSpec can return them in a different order.
   */
  @JsonProperty("rename_outputs")
  private Collection<RenameOutput> renameOutputs;

  /** Three-part name of the feature table. */
  @JsonProperty("table")
  private String table;

  /** Keys to use when performing point-in-time lookup. */
  @JsonProperty("timestamp_lookup_keys")
  private Collection<String> timestampLookupKeys;

  public FeatureLookup setDefaultValues(Collection<DefaultValue> defaultValues) {
    this.defaultValues = defaultValues;
    return this;
  }

  public Collection<DefaultValue> getDefaultValues() {
    return defaultValues;
  }

  public FeatureLookup setFeatureNames(Collection<String> featureNames) {
    this.featureNames = featureNames;
    return this;
  }

  public Collection<String> getFeatureNames() {
    return featureNames;
  }

  public FeatureLookup setLookbackWindow(Duration lookbackWindow) {
    this.lookbackWindow = lookbackWindow;
    return this;
  }

  public Duration getLookbackWindow() {
    return lookbackWindow;
  }

  public FeatureLookup setLookupKeys(Collection<String> lookupKeys) {
    this.lookupKeys = lookupKeys;
    return this;
  }

  public Collection<String> getLookupKeys() {
    return lookupKeys;
  }

  public FeatureLookup setRenameOutputs(Collection<RenameOutput> renameOutputs) {
    this.renameOutputs = renameOutputs;
    return this;
  }

  public Collection<RenameOutput> getRenameOutputs() {
    return renameOutputs;
  }

  public FeatureLookup setTable(String table) {
    this.table = table;
    return this;
  }

  public String getTable() {
    return table;
  }

  public FeatureLookup setTimestampLookupKeys(Collection<String> timestampLookupKeys) {
    this.timestampLookupKeys = timestampLookupKeys;
    return this;
  }

  public Collection<String> getTimestampLookupKeys() {
    return timestampLookupKeys;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FeatureLookup that = (FeatureLookup) o;
    return Objects.equals(defaultValues, that.defaultValues)
        && Objects.equals(featureNames, that.featureNames)
        && Objects.equals(lookbackWindow, that.lookbackWindow)
        && Objects.equals(lookupKeys, that.lookupKeys)
        && Objects.equals(renameOutputs, that.renameOutputs)
        && Objects.equals(table, that.table)
        && Objects.equals(timestampLookupKeys, that.timestampLookupKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        defaultValues,
        featureNames,
        lookbackWindow,
        lookupKeys,
        renameOutputs,
        table,
        timestampLookupKeys);
  }

  @Override
  public String toString() {
    return new ToStringer(FeatureLookup.class)
        .add("defaultValues", defaultValues)
        .add("featureNames", featureNames)
        .add("lookbackWindow", lookbackWindow)
        .add("lookupKeys", lookupKeys)
        .add("renameOutputs", renameOutputs)
        .add("table", table)
        .add("timestampLookupKeys", timestampLookupKeys)
        .toString();
  }
}
