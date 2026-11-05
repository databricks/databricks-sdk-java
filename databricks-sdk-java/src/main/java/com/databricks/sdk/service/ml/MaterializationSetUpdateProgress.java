// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Progress and outcomes of an `UpdateMaterializationSet` operation. */
@Generated
public class MaterializationSetUpdateProgress {
  /** IDs of materialized features that were deleted. */
  @JsonProperty("deleted_materialized_feature_ids")
  private Collection<String> deletedMaterializedFeatureIds;

  /** Materialized features that could not be updated or deleted, one entry each. */
  @JsonProperty("failed_materialized_features")
  private Collection<MaterializedFeatureChangeFailure> failedMaterializedFeatures;

  /** IDs of materialized features whose mutable state was updated. */
  @JsonProperty("updated_materialized_feature_ids")
  private Collection<String> updatedMaterializedFeatureIds;

  public MaterializationSetUpdateProgress setDeletedMaterializedFeatureIds(
      Collection<String> deletedMaterializedFeatureIds) {
    this.deletedMaterializedFeatureIds = deletedMaterializedFeatureIds;
    return this;
  }

  public Collection<String> getDeletedMaterializedFeatureIds() {
    return deletedMaterializedFeatureIds;
  }

  public MaterializationSetUpdateProgress setFailedMaterializedFeatures(
      Collection<MaterializedFeatureChangeFailure> failedMaterializedFeatures) {
    this.failedMaterializedFeatures = failedMaterializedFeatures;
    return this;
  }

  public Collection<MaterializedFeatureChangeFailure> getFailedMaterializedFeatures() {
    return failedMaterializedFeatures;
  }

  public MaterializationSetUpdateProgress setUpdatedMaterializedFeatureIds(
      Collection<String> updatedMaterializedFeatureIds) {
    this.updatedMaterializedFeatureIds = updatedMaterializedFeatureIds;
    return this;
  }

  public Collection<String> getUpdatedMaterializedFeatureIds() {
    return updatedMaterializedFeatureIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MaterializationSetUpdateProgress that = (MaterializationSetUpdateProgress) o;
    return Objects.equals(deletedMaterializedFeatureIds, that.deletedMaterializedFeatureIds)
        && Objects.equals(failedMaterializedFeatures, that.failedMaterializedFeatures)
        && Objects.equals(updatedMaterializedFeatureIds, that.updatedMaterializedFeatureIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        deletedMaterializedFeatureIds, failedMaterializedFeatures, updatedMaterializedFeatureIds);
  }

  @Override
  public String toString() {
    return new ToStringer(MaterializationSetUpdateProgress.class)
        .add("deletedMaterializedFeatureIds", deletedMaterializedFeatureIds)
        .add("failedMaterializedFeatures", failedMaterializedFeatures)
        .add("updatedMaterializedFeatureIds", updatedMaterializedFeatureIds)
        .toString();
  }
}
