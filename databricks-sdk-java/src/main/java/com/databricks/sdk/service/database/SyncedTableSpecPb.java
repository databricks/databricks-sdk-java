// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Specification of a synced database table. */
@Generated
class SyncedTableSpecPb {
  @JsonProperty("create_database_objects_if_missing")
  private Boolean createDatabaseObjectsIfMissing;

  @JsonProperty("new_pipeline_spec")
  private NewPipelineSpec newPipelineSpec;

  @JsonProperty("pipeline_id")
  private String pipelineId;

  @JsonProperty("primary_key_columns")
  private Collection<String> primaryKeyColumns;

  @JsonProperty("scheduling_policy")
  private SyncedTableSchedulingPolicy schedulingPolicy;

  @JsonProperty("source_table_full_name")
  private String sourceTableFullName;

  @JsonProperty("timeseries_key")
  private String timeseriesKey;

  public SyncedTableSpecPb setCreateDatabaseObjectsIfMissing(
      Boolean createDatabaseObjectsIfMissing) {
    this.createDatabaseObjectsIfMissing = createDatabaseObjectsIfMissing;
    return this;
  }

  public Boolean getCreateDatabaseObjectsIfMissing() {
    return createDatabaseObjectsIfMissing;
  }

  public SyncedTableSpecPb setNewPipelineSpec(NewPipelineSpec newPipelineSpec) {
    this.newPipelineSpec = newPipelineSpec;
    return this;
  }

  public NewPipelineSpec getNewPipelineSpec() {
    return newPipelineSpec;
  }

  public SyncedTableSpecPb setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public SyncedTableSpecPb setPrimaryKeyColumns(Collection<String> primaryKeyColumns) {
    this.primaryKeyColumns = primaryKeyColumns;
    return this;
  }

  public Collection<String> getPrimaryKeyColumns() {
    return primaryKeyColumns;
  }

  public SyncedTableSpecPb setSchedulingPolicy(SyncedTableSchedulingPolicy schedulingPolicy) {
    this.schedulingPolicy = schedulingPolicy;
    return this;
  }

  public SyncedTableSchedulingPolicy getSchedulingPolicy() {
    return schedulingPolicy;
  }

  public SyncedTableSpecPb setSourceTableFullName(String sourceTableFullName) {
    this.sourceTableFullName = sourceTableFullName;
    return this;
  }

  public String getSourceTableFullName() {
    return sourceTableFullName;
  }

  public SyncedTableSpecPb setTimeseriesKey(String timeseriesKey) {
    this.timeseriesKey = timeseriesKey;
    return this;
  }

  public String getTimeseriesKey() {
    return timeseriesKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SyncedTableSpecPb that = (SyncedTableSpecPb) o;
    return Objects.equals(createDatabaseObjectsIfMissing, that.createDatabaseObjectsIfMissing)
        && Objects.equals(newPipelineSpec, that.newPipelineSpec)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(primaryKeyColumns, that.primaryKeyColumns)
        && Objects.equals(schedulingPolicy, that.schedulingPolicy)
        && Objects.equals(sourceTableFullName, that.sourceTableFullName)
        && Objects.equals(timeseriesKey, that.timeseriesKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createDatabaseObjectsIfMissing,
        newPipelineSpec,
        pipelineId,
        primaryKeyColumns,
        schedulingPolicy,
        sourceTableFullName,
        timeseriesKey);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedTableSpecPb.class)
        .add("createDatabaseObjectsIfMissing", createDatabaseObjectsIfMissing)
        .add("newPipelineSpec", newPipelineSpec)
        .add("pipelineId", pipelineId)
        .add("primaryKeyColumns", primaryKeyColumns)
        .add("schedulingPolicy", schedulingPolicy)
        .add("sourceTableFullName", sourceTableFullName)
        .add("timeseriesKey", timeseriesKey)
        .toString();
  }
}
