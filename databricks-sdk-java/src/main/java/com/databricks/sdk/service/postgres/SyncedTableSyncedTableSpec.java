// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SyncedTableSyncedTableSpec {
  /**
   * The full resource name the branch associated with the table.
   *
   * <p>Format: "projects/{project_id}/branches/{branch_id}".
   */
  @JsonProperty("branch")
  private String branch;

  /**
   * If true, the synced table's logical database and schema resources in PG will be created if they
   * do not already exist. The request will fail if this is false and the database/schema do not
   * exist.
   *
   * <p>Defaults to true if omitted.
   */
  @JsonProperty("create_database_objects_if_missing")
  private Boolean createDatabaseObjectsIfMissing;

  /**
   * ID of an existing pipeline to bin-pack this synced table into. At most one of
   * existing_pipeline_id and new_pipeline_spec should be defined.
   *
   * <p>The pipeline used for the synced table is returned via the top level pipeline_id attribute.
   */
  @JsonProperty("existing_pipeline_id")
  private String existingPipelineId;

  /**
   * Specification for creating a new pipeline. At most one of existing_pipeline_id and
   * new_pipeline_spec should be defined.
   *
   * <p>The pipeline used for the synced table is returned via the top level pipeline_id attribute.
   */
  @JsonProperty("new_pipeline_spec")
  private NewPipelineSpec newPipelineSpec;

  /**
   * The Postgres database name where the synced table will be created in.
   *
   * <p>If this synced table is created inside a Lakebase Catalog, this attribute can be omitted on
   * creation and is inferred from the postgres_database associated with the Lakebase Catalog. If
   * specified when inside a Lakebase Catalog, the value must match.
   *
   * <p>A value must be specified when creating a synced table inside a Standard Catalog.
   */
  @JsonProperty("postgres_database")
  private String postgresDatabase;

  /** Primary Key columns to be used for data insert/update in the destination. */
  @JsonProperty("primary_key_columns")
  private Collection<String> primaryKeyColumns;

  /** Scheduling policy of the underlying pipeline. */
  @JsonProperty("scheduling_policy")
  private SyncedTableSyncedTableSpecSyncedTableSchedulingPolicy schedulingPolicy;

  /**
   * Three-part (catalog, schema, table) name of the source Delta table.
   *
   * <p>For the corresponding destination table, use any of the two:
   *
   * <p>* synced_table_id used at the creation of the SyncedTable * "name" consisting of
   * "synced_tables/" prefix and the full name of the destination table.
   */
  @JsonProperty("source_table_full_name")
  private String sourceTableFullName;

  /** Time series key to deduplicate (tie-break) rows with the same primary key. */
  @JsonProperty("timeseries_key")
  private String timeseriesKey;

  public SyncedTableSyncedTableSpec setBranch(String branch) {
    this.branch = branch;
    return this;
  }

  public String getBranch() {
    return branch;
  }

  public SyncedTableSyncedTableSpec setCreateDatabaseObjectsIfMissing(
      Boolean createDatabaseObjectsIfMissing) {
    this.createDatabaseObjectsIfMissing = createDatabaseObjectsIfMissing;
    return this;
  }

  public Boolean getCreateDatabaseObjectsIfMissing() {
    return createDatabaseObjectsIfMissing;
  }

  public SyncedTableSyncedTableSpec setExistingPipelineId(String existingPipelineId) {
    this.existingPipelineId = existingPipelineId;
    return this;
  }

  public String getExistingPipelineId() {
    return existingPipelineId;
  }

  public SyncedTableSyncedTableSpec setNewPipelineSpec(NewPipelineSpec newPipelineSpec) {
    this.newPipelineSpec = newPipelineSpec;
    return this;
  }

  public NewPipelineSpec getNewPipelineSpec() {
    return newPipelineSpec;
  }

  public SyncedTableSyncedTableSpec setPostgresDatabase(String postgresDatabase) {
    this.postgresDatabase = postgresDatabase;
    return this;
  }

  public String getPostgresDatabase() {
    return postgresDatabase;
  }

  public SyncedTableSyncedTableSpec setPrimaryKeyColumns(Collection<String> primaryKeyColumns) {
    this.primaryKeyColumns = primaryKeyColumns;
    return this;
  }

  public Collection<String> getPrimaryKeyColumns() {
    return primaryKeyColumns;
  }

  public SyncedTableSyncedTableSpec setSchedulingPolicy(
      SyncedTableSyncedTableSpecSyncedTableSchedulingPolicy schedulingPolicy) {
    this.schedulingPolicy = schedulingPolicy;
    return this;
  }

  public SyncedTableSyncedTableSpecSyncedTableSchedulingPolicy getSchedulingPolicy() {
    return schedulingPolicy;
  }

  public SyncedTableSyncedTableSpec setSourceTableFullName(String sourceTableFullName) {
    this.sourceTableFullName = sourceTableFullName;
    return this;
  }

  public String getSourceTableFullName() {
    return sourceTableFullName;
  }

  public SyncedTableSyncedTableSpec setTimeseriesKey(String timeseriesKey) {
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
    SyncedTableSyncedTableSpec that = (SyncedTableSyncedTableSpec) o;
    return Objects.equals(branch, that.branch)
        && Objects.equals(createDatabaseObjectsIfMissing, that.createDatabaseObjectsIfMissing)
        && Objects.equals(existingPipelineId, that.existingPipelineId)
        && Objects.equals(newPipelineSpec, that.newPipelineSpec)
        && Objects.equals(postgresDatabase, that.postgresDatabase)
        && Objects.equals(primaryKeyColumns, that.primaryKeyColumns)
        && Objects.equals(schedulingPolicy, that.schedulingPolicy)
        && Objects.equals(sourceTableFullName, that.sourceTableFullName)
        && Objects.equals(timeseriesKey, that.timeseriesKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        branch,
        createDatabaseObjectsIfMissing,
        existingPipelineId,
        newPipelineSpec,
        postgresDatabase,
        primaryKeyColumns,
        schedulingPolicy,
        sourceTableFullName,
        timeseriesKey);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedTableSyncedTableSpec.class)
        .add("branch", branch)
        .add("createDatabaseObjectsIfMissing", createDatabaseObjectsIfMissing)
        .add("existingPipelineId", existingPipelineId)
        .add("newPipelineSpec", newPipelineSpec)
        .add("postgresDatabase", postgresDatabase)
        .add("primaryKeyColumns", primaryKeyColumns)
        .add("schedulingPolicy", schedulingPolicy)
        .add("sourceTableFullName", sourceTableFullName)
        .add("timeseriesKey", timeseriesKey)
        .toString();
  }
}
