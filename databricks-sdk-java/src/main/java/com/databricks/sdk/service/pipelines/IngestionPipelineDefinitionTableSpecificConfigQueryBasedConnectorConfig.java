// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Configurations that are only applicable for query-based ingestion connectors. */
@Generated
public class IngestionPipelineDefinitionTableSpecificConfigQueryBasedConnectorConfig {
  /**
   * The names of the monotonically increasing columns in the source table that are used to enable
   * the table to be read and ingested incrementally through structured streaming. The columns are
   * allowed to have repeated values but have to be non-decreasing. If the source data is merged
   * into the destination (e.g., using SCD Type 1 or Type 2), these columns will implicitly define
   * the `sequence_by` behavior. You can still explicitly set `sequence_by` to override this
   * default.
   */
  @JsonProperty("cursor_columns")
  private Collection<String> cursorColumns;

  /**
   * Specifies a SQL WHERE condition that specifies that the source row has been deleted. This is
   * sometimes referred to as "soft-deletes". For example: "Operation = 'DELETE'" or "is_deleted =
   * true". This field is orthogonal to `hard_deletion_sync_interval_in_seconds`, one for
   * soft-deletes and the other for hard-deletes. See also the
   * hard_deletion_sync_min_interval_in_seconds field for handling of "hard deletes" where the
   * source rows are physically removed from the table.
   */
  @JsonProperty("deletion_condition")
  private String deletionCondition;

  /**
   * Specifies the minimum interval (in seconds) between snapshots on primary keys for detecting and
   * synchronizing hard deletions—i.e., rows that have been physically removed from the source
   * table. This interval acts as a lower bound. If ingestion runs less frequently than this value,
   * hard deletion synchronization will align with the actual ingestion frequency instead of
   * happening more often. If not set, hard deletion synchronization via snapshots is disabled. This
   * field is mutable and can be updated without triggering a full snapshot.
   */
  @JsonProperty("hard_deletion_sync_min_interval_in_seconds")
  private Long hardDeletionSyncMinIntervalInSeconds;

  public IngestionPipelineDefinitionTableSpecificConfigQueryBasedConnectorConfig setCursorColumns(
      Collection<String> cursorColumns) {
    this.cursorColumns = cursorColumns;
    return this;
  }

  public Collection<String> getCursorColumns() {
    return cursorColumns;
  }

  public IngestionPipelineDefinitionTableSpecificConfigQueryBasedConnectorConfig
      setDeletionCondition(String deletionCondition) {
    this.deletionCondition = deletionCondition;
    return this;
  }

  public String getDeletionCondition() {
    return deletionCondition;
  }

  public IngestionPipelineDefinitionTableSpecificConfigQueryBasedConnectorConfig
      setHardDeletionSyncMinIntervalInSeconds(Long hardDeletionSyncMinIntervalInSeconds) {
    this.hardDeletionSyncMinIntervalInSeconds = hardDeletionSyncMinIntervalInSeconds;
    return this;
  }

  public Long getHardDeletionSyncMinIntervalInSeconds() {
    return hardDeletionSyncMinIntervalInSeconds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IngestionPipelineDefinitionTableSpecificConfigQueryBasedConnectorConfig that =
        (IngestionPipelineDefinitionTableSpecificConfigQueryBasedConnectorConfig) o;
    return Objects.equals(cursorColumns, that.cursorColumns)
        && Objects.equals(deletionCondition, that.deletionCondition)
        && Objects.equals(
            hardDeletionSyncMinIntervalInSeconds, that.hardDeletionSyncMinIntervalInSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorColumns, deletionCondition, hardDeletionSyncMinIntervalInSeconds);
  }

  @Override
  public String toString() {
    return new ToStringer(
            IngestionPipelineDefinitionTableSpecificConfigQueryBasedConnectorConfig.class)
        .add("cursorColumns", cursorColumns)
        .add("deletionCondition", deletionCondition)
        .add("hardDeletionSyncMinIntervalInSeconds", hardDeletionSyncMinIntervalInSeconds)
        .toString();
  }
}
