// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Objects;

/** Deploy-time HTTP health check configuration for an app deployment. */
@Generated
public class AppHealthCheck {
  /** HTTP path to probe, e.g. "/health" or "/api/status". */
  @JsonProperty("path")
  private String path;

  /**
   * Timeout to wait for the health check to pass before failing the deployment. If not set, a
   * default timeout is used.
   */
  @JsonProperty("timeout")
  private Duration timeout;

  public AppHealthCheck setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public AppHealthCheck setTimeout(Duration timeout) {
    this.timeout = timeout;
    return this;
  }

  public Duration getTimeout() {
    return timeout;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppHealthCheck that = (AppHealthCheck) o;
    return Objects.equals(path, that.path) && Objects.equals(timeout, that.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, timeout);
  }

  @Override
  public String toString() {
    return new ToStringer(AppHealthCheck.class)
        .add("path", path)
        .add("timeout", timeout)
        .toString();
  }
}
