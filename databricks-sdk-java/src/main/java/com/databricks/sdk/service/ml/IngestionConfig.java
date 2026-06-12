// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Configuration for the Databricks-managed ingestion pipeline. Groups the ingestion destination
 * (required) and optional backfill source.
 */
@Generated
public class IngestionConfig {
  /**
   * The ID of the Databricks Job that performs the historical backfill of the ingestion Delta
   * table.
   */
  @JsonProperty("backfill_job_id")
  private Long backfillJobId;

  /**
   * A user-provided source for backfilling data. Historical data is used when creating a training
   * set from streaming features linked to this Stream. The backfill data stored in this location
   * will be copied into the ingestion table for offline querying and training. The schema for this
   * source must match exactly that of the key and payload schemas specified for this Stream.
   */
  @JsonProperty("backfill_source")
  private BackfillSource backfillSource;

  /**
   * Column paths used to identify duplicate rows during ingestion; only one row per distinct
   * combination of these values is kept. Use dot notation for nested fields (e.g. {@code
   * value.user_id}). Empty list means every column is compared.
   */
  @JsonProperty("deduplication_columns")
  private Collection<String> deduplicationColumns;

  /**
   * Destination for the Databricks-managed Delta table that holds an offline copy of the streaming
   * data for querying and training. This table contains both 1) forward-filled data from the Stream
   * and 2) backfilled data from the BackfillSource (if provided). This table is created and managed
   * by Databricks and is deleted when the Stream is deleted.
   */
  @JsonProperty("ingestion_destination")
  private IngestionDestination ingestionDestination;

  /** The ID of the Databricks Job that performs the forward-fill ingestion. */
  @JsonProperty("ingestion_job_id")
  private Long ingestionJobId;

  /**
   * The ID of the SDP pipeline that continuously copies new events from the streaming source into
   * the ingestion Delta table.
   */
  @JsonProperty("ingestion_pipeline_id")
  private String ingestionPipelineId;

  public IngestionConfig setBackfillJobId(Long backfillJobId) {
    this.backfillJobId = backfillJobId;
    return this;
  }

  public Long getBackfillJobId() {
    return backfillJobId;
  }

  public IngestionConfig setBackfillSource(BackfillSource backfillSource) {
    this.backfillSource = backfillSource;
    return this;
  }

  public BackfillSource getBackfillSource() {
    return backfillSource;
  }

  public IngestionConfig setDeduplicationColumns(Collection<String> deduplicationColumns) {
    this.deduplicationColumns = deduplicationColumns;
    return this;
  }

  public Collection<String> getDeduplicationColumns() {
    return deduplicationColumns;
  }

  public IngestionConfig setIngestionDestination(IngestionDestination ingestionDestination) {
    this.ingestionDestination = ingestionDestination;
    return this;
  }

  public IngestionDestination getIngestionDestination() {
    return ingestionDestination;
  }

  public IngestionConfig setIngestionJobId(Long ingestionJobId) {
    this.ingestionJobId = ingestionJobId;
    return this;
  }

  public Long getIngestionJobId() {
    return ingestionJobId;
  }

  public IngestionConfig setIngestionPipelineId(String ingestionPipelineId) {
    this.ingestionPipelineId = ingestionPipelineId;
    return this;
  }

  public String getIngestionPipelineId() {
    return ingestionPipelineId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IngestionConfig that = (IngestionConfig) o;
    return Objects.equals(backfillJobId, that.backfillJobId)
        && Objects.equals(backfillSource, that.backfillSource)
        && Objects.equals(deduplicationColumns, that.deduplicationColumns)
        && Objects.equals(ingestionDestination, that.ingestionDestination)
        && Objects.equals(ingestionJobId, that.ingestionJobId)
        && Objects.equals(ingestionPipelineId, that.ingestionPipelineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        backfillJobId,
        backfillSource,
        deduplicationColumns,
        ingestionDestination,
        ingestionJobId,
        ingestionPipelineId);
  }

  @Override
  public String toString() {
    return new ToStringer(IngestionConfig.class)
        .add("backfillJobId", backfillJobId)
        .add("backfillSource", backfillSource)
        .add("deduplicationColumns", deduplicationColumns)
        .add("ingestionDestination", ingestionDestination)
        .add("ingestionJobId", ingestionJobId)
        .add("ingestionPipelineId", ingestionPipelineId)
        .toString();
  }
}
