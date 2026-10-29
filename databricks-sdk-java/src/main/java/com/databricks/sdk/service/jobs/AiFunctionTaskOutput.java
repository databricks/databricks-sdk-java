// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Objects;

/** The result of an AI function task run. Also reported mid-run, so the counts can be partial. */
@Generated
public class AiFunctionTaskOutput {
  /**
   * Coarse estimate of the time left to run the function over the inputs, from the throughput so
   * far. Covers that work only, not the merge into the output table that follows it.
   */
  @JsonProperty("estimated_time_remaining")
  private Duration estimatedTimeRemaining;

  /**
   * Inputs permanently failed so far. Each lands in the output table as an error row, and does not
   * on its own fail the run.
   */
  @JsonProperty("failed_row_count")
  private Long failedRowCount;

  /**
   * The table the run writes its results to. Reported even when `output.table` is unset and the
   * name is generated, so a client can read the table.
   */
  @JsonProperty("output_table")
  private QualifiedName outputTable;

  /** Inputs with a result so far. Reported per batch, so it can lag mid-run. */
  @JsonProperty("succeeded_row_count")
  private Long succeededRowCount;

  /**
   * Inputs to process: rows for a Delta table source, files for a volume source. Stays well inside
   * 2^53, so a JavaScript client can hold it exactly.
   */
  @JsonProperty("total_row_count")
  private Long totalRowCount;

  public AiFunctionTaskOutput setEstimatedTimeRemaining(Duration estimatedTimeRemaining) {
    this.estimatedTimeRemaining = estimatedTimeRemaining;
    return this;
  }

  public Duration getEstimatedTimeRemaining() {
    return estimatedTimeRemaining;
  }

  public AiFunctionTaskOutput setFailedRowCount(Long failedRowCount) {
    this.failedRowCount = failedRowCount;
    return this;
  }

  public Long getFailedRowCount() {
    return failedRowCount;
  }

  public AiFunctionTaskOutput setOutputTable(QualifiedName outputTable) {
    this.outputTable = outputTable;
    return this;
  }

  public QualifiedName getOutputTable() {
    return outputTable;
  }

  public AiFunctionTaskOutput setSucceededRowCount(Long succeededRowCount) {
    this.succeededRowCount = succeededRowCount;
    return this;
  }

  public Long getSucceededRowCount() {
    return succeededRowCount;
  }

  public AiFunctionTaskOutput setTotalRowCount(Long totalRowCount) {
    this.totalRowCount = totalRowCount;
    return this;
  }

  public Long getTotalRowCount() {
    return totalRowCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiFunctionTaskOutput that = (AiFunctionTaskOutput) o;
    return Objects.equals(estimatedTimeRemaining, that.estimatedTimeRemaining)
        && Objects.equals(failedRowCount, that.failedRowCount)
        && Objects.equals(outputTable, that.outputTable)
        && Objects.equals(succeededRowCount, that.succeededRowCount)
        && Objects.equals(totalRowCount, that.totalRowCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        estimatedTimeRemaining, failedRowCount, outputTable, succeededRowCount, totalRowCount);
  }

  @Override
  public String toString() {
    return new ToStringer(AiFunctionTaskOutput.class)
        .add("estimatedTimeRemaining", estimatedTimeRemaining)
        .add("failedRowCount", failedRowCount)
        .add("outputTable", outputTable)
        .add("succeededRowCount", succeededRowCount)
        .add("totalRowCount", totalRowCount)
        .toString();
  }
}
