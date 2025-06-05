// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The log delivery status */
@Generated
class LogSyncStatusPb {
  @JsonProperty("last_attempted")
  private Long lastAttempted;

  @JsonProperty("last_exception")
  private String lastException;

  public LogSyncStatusPb setLastAttempted(Long lastAttempted) {
    this.lastAttempted = lastAttempted;
    return this;
  }

  public Long getLastAttempted() {
    return lastAttempted;
  }

  public LogSyncStatusPb setLastException(String lastException) {
    this.lastException = lastException;
    return this;
  }

  public String getLastException() {
    return lastException;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogSyncStatusPb that = (LogSyncStatusPb) o;
    return Objects.equals(lastAttempted, that.lastAttempted)
        && Objects.equals(lastException, that.lastException);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastAttempted, lastException);
  }

  @Override
  public String toString() {
    return new ToStringer(LogSyncStatusPb.class)
        .add("lastAttempted", lastAttempted)
        .add("lastException", lastException)
        .toString();
  }
}
