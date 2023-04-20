// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class LogSyncStatus {
  /**
   * The timestamp of last attempt. If the last attempt fails, `last_exception` will contain the
   * exception in the last attempt.
   */
  @JsonProperty("last_attempted")
  private Long lastAttempted;

  /**
   * The exception thrown in the last attempt, it would be null (omitted in the response) if there
   * is no exception in last attempted.
   */
  @JsonProperty("last_exception")
  private String lastException;

  public LogSyncStatus setLastAttempted(Long lastAttempted) {
    this.lastAttempted = lastAttempted;
    return this;
  }

  public Long getLastAttempted() {
    return lastAttempted;
  }

  public LogSyncStatus setLastException(String lastException) {
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
    LogSyncStatus that = (LogSyncStatus) o;
    return Objects.equals(lastAttempted, that.lastAttempted)
        && Objects.equals(lastException, that.lastException);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastAttempted, lastException);
  }

  @Override
  public String toString() {
    return new ToStringer(LogSyncStatus.class)
        .add("lastAttempted", lastAttempted)
        .add("lastException", lastException)
        .toString();
  }
}
