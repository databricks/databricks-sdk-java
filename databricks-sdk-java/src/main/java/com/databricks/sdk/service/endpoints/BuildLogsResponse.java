// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class BuildLogsResponse {
  /** The logs associated with building the served model's environment. */
  @JsonProperty("logs")
  private String logs;

  public BuildLogsResponse setLogs(String logs) {
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
    BuildLogsResponse that = (BuildLogsResponse) o;
    return Objects.equals(logs, that.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logs);
  }

  @Override
  public String toString() {
    return new ToStringer(BuildLogsResponse.class).add("logs", logs).toString();
  }
}
