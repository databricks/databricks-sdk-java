// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * What a partly failed DeleteMaterializationSet got through, attached to the error so a caller can
 * tell which materialized feature members are gone and which ones still need attention. The set
 * itself is left in place whenever any member failed, so a retry can still find the members.
 */
@Generated
public class MaterializationSetDeletionProgress {
  /** Members that are no longer materialized, including any that were already gone. */
  @JsonProperty("deleted_materialized_feature_ids")
  private Collection<String> deletedMaterializedFeatureIds;

  /** Members that could not be deleted, one entry each. */
  @JsonProperty("failed_materialized_features")
  private Collection<MaterializedFeatureChangeFailure> failedMaterializedFeatures;

  public MaterializationSetDeletionProgress setDeletedMaterializedFeatureIds(
      Collection<String> deletedMaterializedFeatureIds) {
    this.deletedMaterializedFeatureIds = deletedMaterializedFeatureIds;
    return this;
  }

  public Collection<String> getDeletedMaterializedFeatureIds() {
    return deletedMaterializedFeatureIds;
  }

  public MaterializationSetDeletionProgress setFailedMaterializedFeatures(
      Collection<MaterializedFeatureChangeFailure> failedMaterializedFeatures) {
    this.failedMaterializedFeatures = failedMaterializedFeatures;
    return this;
  }

  public Collection<MaterializedFeatureChangeFailure> getFailedMaterializedFeatures() {
    return failedMaterializedFeatures;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MaterializationSetDeletionProgress that = (MaterializationSetDeletionProgress) o;
    return Objects.equals(deletedMaterializedFeatureIds, that.deletedMaterializedFeatureIds)
        && Objects.equals(failedMaterializedFeatures, that.failedMaterializedFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedMaterializedFeatureIds, failedMaterializedFeatures);
  }

  @Override
  public String toString() {
    return new ToStringer(MaterializationSetDeletionProgress.class)
        .add("deletedMaterializedFeatureIds", deletedMaterializedFeatureIds)
        .add("failedMaterializedFeatures", failedMaterializedFeatures)
        .toString();
  }
}
