// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class ServerLogsResponse {
  /** The most recent log lines of the model server processing invocation requests. */
  @JsonProperty("logs")
  private String logs;

  public ServerLogsResponse setLogs(String logs) {
    this.logs = logs;
    return this;
  }

  public String getLogs() {
    return logs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServerLogsResponse that = (ServerLogsResponse) o;
    return Objects.equals(logs, that.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logs);
  }

  @Override
  public String toString() {
    return new ToStringer(ServerLogsResponse.class).add("logs", logs).toString();
  }
}
