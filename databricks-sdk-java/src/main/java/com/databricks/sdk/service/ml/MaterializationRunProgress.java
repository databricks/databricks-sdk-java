// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Progress of a requested run, which may materialize multiple members of the set. */
@Generated
public class MaterializationRunProgress {
  /** The failure, including a failure to submit the run. Present when `state` is `FAILED`. */
  @JsonProperty("error")
  private DatabricksServiceExceptionWithDetailsProto error;

  /** IDs of the materialized features assigned to this run when the operation was created. */
  @JsonProperty("materialized_feature_ids")
  private Collection<String> materializedFeatureIds;

  /** Current state of the requested run. */
  @JsonProperty("state")
  private MaterializationRunProgressState state;

  public MaterializationRunProgress setError(DatabricksServiceExceptionWithDetailsProto error) {
    this.error = error;
    return this;
  }

  public DatabricksServiceExceptionWithDetailsProto getError() {
    return error;
  }

  public MaterializationRunProgress setMaterializedFeatureIds(
      Collection<String> materializedFeatureIds) {
    this.materializedFeatureIds = materializedFeatureIds;
    return this;
  }

  public Collection<String> getMaterializedFeatureIds() {
    return materializedFeatureIds;
  }

  public MaterializationRunProgress setState(MaterializationRunProgressState state) {
    this.state = state;
    return this;
  }

  public MaterializationRunProgressState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MaterializationRunProgress that = (MaterializationRunProgress) o;
    return Objects.equals(error, that.error)
        && Objects.equals(materializedFeatureIds, that.materializedFeatureIds)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, materializedFeatureIds, state);
  }

  @Override
  public String toString() {
    return new ToStringer(MaterializationRunProgress.class)
        .add("error", error)
        .add("materializedFeatureIds", materializedFeatureIds)
        .add("state", state)
        .toString();
  }
}
