// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateFeatureRequest {
  /** Feature to update. */
  @JsonProperty("feature")
  private Feature feature;

  /** The full three-part name (catalog, schema, name) of the feature. */
  @JsonIgnore private String fullName;

  /** The list of fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateFeatureRequest setFeature(Feature feature) {
    this.feature = feature;
    return this;
  }

  public Feature getFeature() {
    return feature;
  }

  public UpdateFeatureRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public UpdateFeatureRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateFeatureRequest that = (UpdateFeatureRequest) o;
    return Objects.equals(feature, that.feature)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feature, fullName, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateFeatureRequest.class)
        .add("feature", feature)
        .add("fullName", fullName)
        .add("updateMask", updateMask)
        .toString();
  }
}
