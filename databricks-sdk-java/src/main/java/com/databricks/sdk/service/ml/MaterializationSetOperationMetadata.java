// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Collection;
import java.util.Objects;

/**
 * Progress of a materialization set operation. Shared by create, update and delete, because
 * databricks.longrunning freezes a method's metadata type once it ships.
 */
@Generated
public class MaterializationSetOperationMetadata {
  /** Time at which the operation was requested. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Set by a DeleteMaterializationSet operation. */
  @JsonProperty("deletion_progress")
  private MaterializationSetDeletionProgress deletionProgress;

  /** Full names of the features the set materializes, one entry per feature. */
  @JsonProperty("feature_full_names")
  private Collection<String> featureFullNames;

  /** ID of the materialization set the operation targets. */
  @JsonProperty("materialization_set_id")
  private String materializationSetId;

  /** Current state of the operation. */
  @JsonProperty("state")
  private MaterializationSetOperationMetadataState state;

  /** Set by an UpdateMaterializationSet operation. */
  @JsonProperty("update_progress")
  private MaterializationSetUpdateProgress updateProgress;

  public MaterializationSetOperationMetadata setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public MaterializationSetOperationMetadata setDeletionProgress(
      MaterializationSetDeletionProgress deletionProgress) {
    this.deletionProgress = deletionProgress;
    return this;
  }

  public MaterializationSetDeletionProgress getDeletionProgress() {
    return deletionProgress;
  }

  public MaterializationSetOperationMetadata setFeatureFullNames(
      Collection<String> featureFullNames) {
    this.featureFullNames = featureFullNames;
    return this;
  }

  public Collection<String> getFeatureFullNames() {
    return featureFullNames;
  }

  public MaterializationSetOperationMetadata setMaterializationSetId(String materializationSetId) {
    this.materializationSetId = materializationSetId;
    return this;
  }

  public String getMaterializationSetId() {
    return materializationSetId;
  }

  public MaterializationSetOperationMetadata setState(
      MaterializationSetOperationMetadataState state) {
    this.state = state;
    return this;
  }

  public MaterializationSetOperationMetadataState getState() {
    return state;
  }

  public MaterializationSetOperationMetadata setUpdateProgress(
      MaterializationSetUpdateProgress updateProgress) {
    this.updateProgress = updateProgress;
    return this;
  }

  public MaterializationSetUpdateProgress getUpdateProgress() {
    return updateProgress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MaterializationSetOperationMetadata that = (MaterializationSetOperationMetadata) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(deletionProgress, that.deletionProgress)
        && Objects.equals(featureFullNames, that.featureFullNames)
        && Objects.equals(materializationSetId, that.materializationSetId)
        && Objects.equals(state, that.state)
        && Objects.equals(updateProgress, that.updateProgress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        deletionProgress,
        featureFullNames,
        materializationSetId,
        state,
        updateProgress);
  }

  @Override
  public String toString() {
    return new ToStringer(MaterializationSetOperationMetadata.class)
        .add("createTime", createTime)
        .add("deletionProgress", deletionProgress)
        .add("featureFullNames", featureFullNames)
        .add("materializationSetId", materializationSetId)
        .add("state", state)
        .add("updateProgress", updateProgress)
        .toString();
  }
}
