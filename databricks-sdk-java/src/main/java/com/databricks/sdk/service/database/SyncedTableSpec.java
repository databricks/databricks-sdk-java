// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Specification of a synced database table. */
@Generated
public class SyncedTableSpec {
  /**
   * If true, the synced table's logical database and schema resources in PG will be created if they
   * do not already exist.
   */
  @JsonProperty("create_database_objects_if_missing")
  private Boolean createDatabaseObjectsIfMissing;

  /**
   * At most one of existing_pipeline_id and new_pipeline_spec should be defined.
   *
   * <p>If existing_pipeline_id is defined, the synced table will be bin packed into the existing
   * pipeline referenced. This avoids creating a new pipeline and allows sharing existing compute.
   * In this case, the scheduling_policy of this synced table must match the scheduling policy of
   * the existing pipeline.
   */
  @JsonProperty("existing_pipeline_id")
  private String existingPipelineId;

  /**
   * At most one of existing_pipeline_id and new_pipeline_spec should be defined.
   *
   * <p>If new_pipeline_spec is defined, a new pipeline is created for this synced table. The
   * location pointed to is used to store intermediate files (checkpoints, event logs etc). The
   * caller must have write permissions to create Delta tables in the specified catalog and schema.
   * Again, note this requires write permissions, whereas the source table only requires read
   * permissions.
   */
  @JsonProperty("new_pipeline_spec")
  private NewPipelineSpec newPipelineSpec;

  /** Primary Key columns to be used for data insert/update in the destination. */
  @JsonProperty("primary_key_columns")
  private Collection<String> primaryKeyColumns;

  /** Scheduling policy of the underlying pipeline. */
  @JsonProperty("scheduling_policy")
  private SyncedTableSchedulingPolicy schedulingPolicy;

  /** Three-part (catalog, schema, table) name of the source Delta table. */
  @JsonProperty("source_table_full_name")
  private String sourceTableFullName;

  /** Time series key to deduplicate (tie-break) rows with the same primary key. */
  @JsonProperty("timeseries_key")
  private String timeseriesKey;

  public SyncedTableSpec setCreateDatabaseObjectsIfMissing(Boolean createDatabaseObjectsIfMissing) {
    this.createDatabaseObjectsIfMissing = createDatabaseObjectsIfMissing;
    return this;
  }

  public Boolean getCreateDatabaseObjectsIfMissing() {
    return createDatabaseObjectsIfMissing;
  }

  public SyncedTableSpec setExistingPipelineId(String existingPipelineId) {
    this.existingPipelineId = existingPipelineId;
    return this;
  }

  public String getExistingPipelineId() {
    return existingPipelineId;
  }

  public SyncedTableSpec setNewPipelineSpec(NewPipelineSpec newPipelineSpec) {
    this.newPipelineSpec = newPipelineSpec;
    return this;
  }

  public NewPipelineSpec getNewPipelineSpec() {
    return newPipelineSpec;
  }

  public SyncedTableSpec setPrimaryKeyColumns(Collection<String> primaryKeyColumns) {
    this.primaryKeyColumns = primaryKeyColumns;
    return this;
  }

  public Collection<String> getPrimaryKeyColumns() {
    return primaryKeyColumns;
  }

  public SyncedTableSpec setSchedulingPolicy(SyncedTableSchedulingPolicy schedulingPolicy) {
    this.schedulingPolicy = schedulingPolicy;
    return this;
  }

  public SyncedTableSchedulingPolicy getSchedulingPolicy() {
    return schedulingPolicy;
  }

  public SyncedTableSpec setSourceTableFullName(String sourceTableFullName) {
    this.sourceTableFullName = sourceTableFullName;
    return this;
  }

  public String getSourceTableFullName() {
    return sourceTableFullName;
  }

  public SyncedTableSpec setTimeseriesKey(String timeseriesKey) {
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
    SyncedTableSpec that = (SyncedTableSpec) o;
    return Objects.equals(createDatabaseObjectsIfMissing, that.createDatabaseObjectsIfMissing)
        && Objects.equals(existingPipelineId, that.existingPipelineId)
        && Objects.equals(newPipelineSpec, that.newPipelineSpec)
        && Objects.equals(primaryKeyColumns, that.primaryKeyColumns)
        && Objects.equals(schedulingPolicy, that.schedulingPolicy)
        && Objects.equals(sourceTableFullName, that.sourceTableFullName)
        && Objects.equals(timeseriesKey, that.timeseriesKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createDatabaseObjectsIfMissing,
        existingPipelineId,
        newPipelineSpec,
        primaryKeyColumns,
        schedulingPolicy,
        sourceTableFullName,
        timeseriesKey);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedTableSpec.class)
        .add("createDatabaseObjectsIfMissing", createDatabaseObjectsIfMissing)
        .add("existingPipelineId", existingPipelineId)
        .add("newPipelineSpec", newPipelineSpec)
        .add("primaryKeyColumns", primaryKeyColumns)
        .add("schedulingPolicy", schedulingPolicy)
        .add("sourceTableFullName", sourceTableFullName)
        .add("timeseriesKey", timeseriesKey)
        .toString();
  }
}
