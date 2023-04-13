// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Retrieve the most recent log lines associated with a given serving endpoint's served model */
public class LogsRequest {
  /** The name of the serving endpoint that the served model belongs to. This field is required. */
  private String name;

  /** The name of the served model that logs will be retrieved for. This field is required. */
  private String servedModelName;

  public LogsRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public LogsRequest setServedModelName(String servedModelName) {
    this.servedModelName = servedModelName;
    return this;
  }

  public String getServedModelName() {
    return servedModelName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogsRequest that = (LogsRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(servedModelName, that.servedModelName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, servedModelName);
  }

  @Override
  public String toString() {
    return new ToStringer(LogsRequest.class)
        .add("name", name)
        .add("servedModelName", servedModelName)
        .toString();
  }
}
