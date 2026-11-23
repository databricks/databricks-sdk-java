// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Returns the values of one entity column that an upstream Feature has stored for the request's
 * other entity columns, as an array. For example, given a Feature with entities (user_id, ad_id),
 * returns the ad_ids stored for the requested user_id. The Feature's source must be a
 * FeatureViewSource that includes `feature`.
 */
@Generated
public class SecondaryKeys {
  /** The upstream Feature whose stored keys are selected. */
  @JsonProperty("feature")
  private FeatureReference feature;

  /**
   * The entity column of the upstream Feature to return values for. It is not supplied by the
   * request.
   */
  @JsonProperty("key")
  private String key;

  /**
   * Maximum number of keys to return per entity, in primary key order. Must not exceed the
   * workspace limit.
   */
  @JsonProperty("max_keys")
  private Long maxKeys;

  public SecondaryKeys setFeature(FeatureReference feature) {
    this.feature = feature;
    return this;
  }

  public FeatureReference getFeature() {
    return feature;
  }

  public SecondaryKeys setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public SecondaryKeys setMaxKeys(Long maxKeys) {
    this.maxKeys = maxKeys;
    return this;
  }

  public Long getMaxKeys() {
    return maxKeys;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SecondaryKeys that = (SecondaryKeys) o;
    return Objects.equals(feature, that.feature)
        && Objects.equals(key, that.key)
        && Objects.equals(maxKeys, that.maxKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feature, key, maxKeys);
  }

  @Override
  public String toString() {
    return new ToStringer(SecondaryKeys.class)
        .add("feature", feature)
        .add("key", key)
        .add("maxKeys", maxKeys)
        .toString();
  }
}
