// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A default value for a looked-up feature. */
@Generated
public class DefaultValue {
  /** Default value for the feature. */
  @JsonProperty("default_value")
  private String defaultValue;

  /**
   * Name of the feature: its output name if it is renamed, otherwise its name in the feature table.
   */
  @JsonProperty("feature")
  private String feature;

  public DefaultValue setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  public String getDefaultValue() {
    return defaultValue;
  }

  public DefaultValue setFeature(String feature) {
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
    DefaultValue that = (DefaultValue) o;
    return Objects.equals(defaultValue, that.defaultValue) && Objects.equals(feature, that.feature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, feature);
  }

  @Override
  public String toString() {
    return new ToStringer(DefaultValue.class)
        .add("defaultValue", defaultValue)
        .add("feature", feature)
        .toString();
  }
}
