// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A reference to a Feature. */
@Generated
public class DeclarativeFeature {
  /** Three-part Unity Catalog name (catalog.schema.feature) of the Feature. */
  @JsonProperty("feature")
  private String feature;

  public DeclarativeFeature setFeature(String feature) {
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
    DeclarativeFeature that = (DeclarativeFeature) o;
    return Objects.equals(feature, that.feature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feature);
  }

  @Override
  public String toString() {
    return new ToStringer(DeclarativeFeature.class).add("feature", feature).toString();
  }
}
