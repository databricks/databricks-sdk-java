// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ServerLogsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ServerLogsResponse {
  /** The most recent log lines of the model server processing invocation requests. */
  @JsonProperty("logs")
  private String logs;

  /**
   * <p>Setter for the field <code>logs</code>.</p>
   *
   * @param logs a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.serving.ServerLogsResponse} object
   */
  public ServerLogsResponse setLogs(String logs) {
    this.logs = logs;
    return this;
  }

  /**
   * <p>Getter for the field <code>logs</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getLogs() {
    return logs;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServerLogsResponse that = (ServerLogsResponse) o;
    return Objects.equals(logs, that.logs);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(logs);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ServerLogsResponse.class).add("logs", logs).toString();
  }
}
