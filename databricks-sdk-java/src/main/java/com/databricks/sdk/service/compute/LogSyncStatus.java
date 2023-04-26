// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>LogSyncStatus class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>lastAttempted</code>.</p>
   *
   * @param lastAttempted a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.LogSyncStatus} object
   */
  public LogSyncStatus setLastAttempted(Long lastAttempted) {
    this.lastAttempted = lastAttempted;
    return this;
  }

  /**
   * <p>Getter for the field <code>lastAttempted</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getLastAttempted() {
    return lastAttempted;
  }

  /**
   * <p>Setter for the field <code>lastException</code>.</p>
   *
   * @param lastException a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.LogSyncStatus} object
   */
  public LogSyncStatus setLastException(String lastException) {
    this.lastException = lastException;
    return this;
  }

  /**
   * <p>Getter for the field <code>lastException</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getLastException() {
    return lastException;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogSyncStatus that = (LogSyncStatus) o;
    return Objects.equals(lastAttempted, that.lastAttempted)
        && Objects.equals(lastException, that.lastException);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(lastAttempted, lastException);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(LogSyncStatus.class)
        .add("lastAttempted", lastAttempted)
        .add("lastException", lastException)
        .toString();
  }
}
