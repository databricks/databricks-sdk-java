// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/** Failure details for an index or its latest ingestion update. */
@Generated
public class FailedStatus {
  /** Error code associated with the error message, when available. */
  @JsonProperty("error_code")
  private String errorCode;

  /** Error message, when available. */
  @JsonProperty("error_message")
  private String errorMessage;

  /**
   * [Standard endpoint] timestamp when the last processed commit was committed to the source table.
   * [Storage Optimized endpoint] timestamp when the last processed commit was processed by the
   * pipeline.
   */
  @JsonProperty("last_processed_commit_timestamp")
  private Timestamp lastProcessedCommitTimestamp;

  /** Last source Delta table version fully processed while the index is still queryable. */
  @JsonProperty("last_processed_commit_version")
  private Long lastProcessedCommitVersion;

  public FailedStatus setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public FailedStatus setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public FailedStatus setLastProcessedCommitTimestamp(Timestamp lastProcessedCommitTimestamp) {
    this.lastProcessedCommitTimestamp = lastProcessedCommitTimestamp;
    return this;
  }

  public Timestamp getLastProcessedCommitTimestamp() {
    return lastProcessedCommitTimestamp;
  }

  public FailedStatus setLastProcessedCommitVersion(Long lastProcessedCommitVersion) {
    this.lastProcessedCommitVersion = lastProcessedCommitVersion;
    return this;
  }

  public Long getLastProcessedCommitVersion() {
    return lastProcessedCommitVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FailedStatus that = (FailedStatus) o;
    return Objects.equals(errorCode, that.errorCode)
        && Objects.equals(errorMessage, that.errorMessage)
        && Objects.equals(lastProcessedCommitTimestamp, that.lastProcessedCommitTimestamp)
        && Objects.equals(lastProcessedCommitVersion, that.lastProcessedCommitVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        errorCode, errorMessage, lastProcessedCommitTimestamp, lastProcessedCommitVersion);
  }

  @Override
  public String toString() {
    return new ToStringer(FailedStatus.class)
        .add("errorCode", errorCode)
        .add("errorMessage", errorMessage)
        .add("lastProcessedCommitTimestamp", lastProcessedCommitTimestamp)
        .add("lastProcessedCommitVersion", lastProcessedCommitVersion)
        .toString();
  }
}
