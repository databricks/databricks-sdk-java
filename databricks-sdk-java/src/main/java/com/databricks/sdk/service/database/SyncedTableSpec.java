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
   * When true, enables accelerated sync mode for the initial data load. This significantly improves
   * performance for large tables. Requires workspace-level enablement.
   */
  @JsonProperty("accelerated_sync")
  private Boolean acceleratedSync;

  /**
   * If true, the synced table's logical database and schema resources in PG will be created if they
   * do not already exist. The request fails if this is false and the database or schema does not
   * exist.
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

  /**
   * The primary key columns are used to insert and update rows in the destination table. At least
   * one column is required. Rows whose primary key columns contain null values are not synced, and
   * the primary key cannot be changed after the table is created.
   */
  @JsonProperty("primary_key_columns")
  private Collection<String> primaryKeyColumns;

  /**
   * Specifies the scheduling policy of the underlying pipeline. With CONTINUOUS, the pipeline keeps
   * running and applies source changes as they happen. With TRIGGERED and SNAPSHOT, the pipeline
   * stops after the initial load and syncs again only when it is run (manually, on a schedule or
   * from a job); TRIGGERED applies source changes incrementally, while SNAPSHOT copies the full
   * source table on every run. CONTINUOUS and TRIGGERED require the source table to provide a
   * change data feed.
   */
  @JsonProperty("scheduling_policy")
  private SyncedTableSchedulingPolicy schedulingPolicy;

  /** Three-part (catalog, schema, table) name of the source Delta table. */
  @JsonProperty("source_table_full_name")
  private String sourceTableFullName;

  /**
   * The time series key deduplicates (tie-breaks) rows with the same primary key. When primary key
   * values can repeat in the source table, the synced table keeps only the row with the latest
   * value of this column for each primary key. The key cannot be changed after the table is
   * created.
   */
  @JsonProperty("timeseries_key")
  private String timeseriesKey;

  /**
   * Override the default Delta->PG type mapping for specific columns. A TypeOverride with
   * PG_SPECIFIC_TYPE_UNSPECIFIED is rejected; a valid pg_type must be set.
   */
  @JsonProperty("type_overrides")
  private Collection<SyncedTableSpecTypeOverride> typeOverrides;

  public SyncedTableSpec setAcceleratedSync(Boolean acceleratedSync) {
    this.acceleratedSync = acceleratedSync;
    return this;
  }

  public Boolean getAcceleratedSync() {
    return acceleratedSync;
  }

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

  public SyncedTableSpec setTypeOverrides(Collection<SyncedTableSpecTypeOverride> typeOverrides) {
    this.typeOverrides = typeOverrides;
    return this;
  }

  public Collection<SyncedTableSpecTypeOverride> getTypeOverrides() {
    return typeOverrides;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SyncedTableSpec that = (SyncedTableSpec) o;
    return Objects.equals(acceleratedSync, that.acceleratedSync)
        && Objects.equals(createDatabaseObjectsIfMissing, that.createDatabaseObjectsIfMissing)
        && Objects.equals(existingPipelineId, that.existingPipelineId)
        && Objects.equals(newPipelineSpec, that.newPipelineSpec)
        && Objects.equals(primaryKeyColumns, that.primaryKeyColumns)
        && Objects.equals(schedulingPolicy, that.schedulingPolicy)
        && Objects.equals(sourceTableFullName, that.sourceTableFullName)
        && Objects.equals(timeseriesKey, that.timeseriesKey)
        && Objects.equals(typeOverrides, that.typeOverrides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        acceleratedSync,
        createDatabaseObjectsIfMissing,
        existingPipelineId,
        newPipelineSpec,
        primaryKeyColumns,
        schedulingPolicy,
        sourceTableFullName,
        timeseriesKey,
        typeOverrides);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedTableSpec.class)
        .add("acceleratedSync", acceleratedSync)
        .add("createDatabaseObjectsIfMissing", createDatabaseObjectsIfMissing)
        .add("existingPipelineId", existingPipelineId)
        .add("newPipelineSpec", newPipelineSpec)
        .add("primaryKeyColumns", primaryKeyColumns)
        .add("schedulingPolicy", schedulingPolicy)
        .add("sourceTableFullName", sourceTableFullName)
        .add("timeseriesKey", timeseriesKey)
        .add("typeOverrides", typeOverrides)
        .toString();
  }
}
