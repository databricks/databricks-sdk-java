// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateMaterializedFeatureRequest {
  /** The materialized feature to update. */
  @JsonProperty("materialized_feature")
  private MaterializedFeature materializedFeature;

  /** Unique identifier for the materialized feature. */
  @JsonIgnore private String materializedFeatureId;

  /**
   * Provide the materialization feature fields which should be updated. Currently, only the
   * pipeline_state field can be updated.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateMaterializedFeatureRequest setMaterializedFeature(
      MaterializedFeature materializedFeature) {
    this.materializedFeature = materializedFeature;
    return this;
  }

  public MaterializedFeature getMaterializedFeature() {
    return materializedFeature;
  }

  public UpdateMaterializedFeatureRequest setMaterializedFeatureId(String materializedFeatureId) {
    this.materializedFeatureId = materializedFeatureId;
    return this;
  }

  public String getMaterializedFeatureId() {
    return materializedFeatureId;
  }

  public UpdateMaterializedFeatureRequest setUpdateMask(String updateMask) {
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
    UpdateMaterializedFeatureRequest that = (UpdateMaterializedFeatureRequest) o;
    return Objects.equals(materializedFeature, that.materializedFeature)
        && Objects.equals(materializedFeatureId, that.materializedFeatureId)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materializedFeature, materializedFeatureId, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateMaterializedFeatureRequest.class)
        .add("materializedFeature", materializedFeature)
        .add("materializedFeatureId", materializedFeatureId)
        .add("updateMask", updateMask)
        .toString();
  }
}
