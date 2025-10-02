// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateMonitorRequest {
  /** The monitor to create. */
  @JsonProperty("monitor")
  private Monitor monitor;

  public CreateMonitorRequest setMonitor(Monitor monitor) {
    this.monitor = monitor;
    return this;
  }

  public Monitor getMonitor() {
    return monitor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateMonitorRequest that = (CreateMonitorRequest) o;
    return Objects.equals(monitor, that.monitor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitor);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateMonitorRequest.class).add("monitor", monitor).toString();
  }
}
