// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class VectorIndexStatus {
  /** Lifecycle and ingestion state. An online index can still have a failed update. */
  @JsonProperty("detailed_state")
  private IndexStatus detailedState;

  /** Failure details, when available, for OFFLINE_FAILED or ONLINE_PIPELINE_FAILED. */
  @JsonProperty("failed_status")
  private FailedStatus failedStatus;

  /** Index API Url to be used to perform operations on the index */
  @JsonProperty("index_url")
  private String indexUrl;

  /** Number of rows indexed */
  @JsonProperty("indexed_row_count")
  private Long indexedRowCount;

  /** Human-readable description of the current status. */
  @JsonProperty("message")
  private String message;

  /**
   * Whether the index can serve queries. This does not mean the latest update succeeded or that all
   * source-table changes have been indexed; check detailed_state for update failures.
   */
  @JsonProperty("ready")
  private Boolean ready;

  public VectorIndexStatus setDetailedState(IndexStatus detailedState) {
    this.detailedState = detailedState;
    return this;
  }

  public IndexStatus getDetailedState() {
    return detailedState;
  }

  public VectorIndexStatus setFailedStatus(FailedStatus failedStatus) {
    this.failedStatus = failedStatus;
    return this;
  }

  public FailedStatus getFailedStatus() {
    return failedStatus;
  }

  public VectorIndexStatus setIndexUrl(String indexUrl) {
    this.indexUrl = indexUrl;
    return this;
  }

  public String getIndexUrl() {
    return indexUrl;
  }

  public VectorIndexStatus setIndexedRowCount(Long indexedRowCount) {
    this.indexedRowCount = indexedRowCount;
    return this;
  }

  public Long getIndexedRowCount() {
    return indexedRowCount;
  }

  public VectorIndexStatus setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public VectorIndexStatus setReady(Boolean ready) {
    this.ready = ready;
    return this;
  }

  public Boolean getReady() {
    return ready;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VectorIndexStatus that = (VectorIndexStatus) o;
    return Objects.equals(detailedState, that.detailedState)
        && Objects.equals(failedStatus, that.failedStatus)
        && Objects.equals(indexUrl, that.indexUrl)
        && Objects.equals(indexedRowCount, that.indexedRowCount)
        && Objects.equals(message, that.message)
        && Objects.equals(ready, that.ready);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailedState, failedStatus, indexUrl, indexedRowCount, message, ready);
  }

  @Override
  public String toString() {
    return new ToStringer(VectorIndexStatus.class)
        .add("detailedState", detailedState)
        .add("failedStatus", failedStatus)
        .add("indexUrl", indexUrl)
        .add("indexedRowCount", indexedRowCount)
        .add("message", message)
        .add("ready", ready)
        .toString();
  }
}
