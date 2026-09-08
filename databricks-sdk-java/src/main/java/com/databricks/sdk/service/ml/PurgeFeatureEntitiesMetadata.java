// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Collection;
import java.util.Objects;

/** Progress and configuration for a feature entity purge. */
@Generated
public class PurgeFeatureEntitiesMetadata {
  /** Time at which the purge operation was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Fully qualified name of the Unity Catalog Delta table containing the entity keys to purge. */
  @JsonProperty("entities_table")
  private String entitiesTable;

  /** Version of the entities table used by the purge. */
  @JsonProperty("entities_table_version")
  private String entitiesTableVersion;

  /** Fully qualified names of the features targeted by the purge. */
  @JsonProperty("features")
  private Collection<String> features;

  /** ID of the job that executes this purge. */
  @JsonProperty("job_id")
  private Long jobId;

  /** Current state of the purge operation. */
  @JsonProperty("state")
  private PurgeFeatureEntitiesMetadataState state;

  public PurgeFeatureEntitiesMetadata setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public PurgeFeatureEntitiesMetadata setEntitiesTable(String entitiesTable) {
    this.entitiesTable = entitiesTable;
    return this;
  }

  public String getEntitiesTable() {
    return entitiesTable;
  }

  public PurgeFeatureEntitiesMetadata setEntitiesTableVersion(String entitiesTableVersion) {
    this.entitiesTableVersion = entitiesTableVersion;
    return this;
  }

  public String getEntitiesTableVersion() {
    return entitiesTableVersion;
  }

  public PurgeFeatureEntitiesMetadata setFeatures(Collection<String> features) {
    this.features = features;
    return this;
  }

  public Collection<String> getFeatures() {
    return features;
  }

  public PurgeFeatureEntitiesMetadata setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public PurgeFeatureEntitiesMetadata setState(PurgeFeatureEntitiesMetadataState state) {
    this.state = state;
    return this;
  }

  public PurgeFeatureEntitiesMetadataState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PurgeFeatureEntitiesMetadata that = (PurgeFeatureEntitiesMetadata) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(entitiesTable, that.entitiesTable)
        && Objects.equals(entitiesTableVersion, that.entitiesTableVersion)
        && Objects.equals(features, that.features)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, entitiesTable, entitiesTableVersion, features, jobId, state);
  }

  @Override
  public String toString() {
    return new ToStringer(PurgeFeatureEntitiesMetadata.class)
        .add("createTime", createTime)
        .add("entitiesTable", entitiesTable)
        .add("entitiesTableVersion", entitiesTableVersion)
        .add("features", features)
        .add("jobId", jobId)
        .add("state", state)
        .toString();
  }
}
