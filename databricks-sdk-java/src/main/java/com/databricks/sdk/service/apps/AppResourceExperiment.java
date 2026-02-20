// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AppResourceExperiment {
  /** */
  @JsonProperty("experiment_id")
  private String experimentId;

  /** */
  @JsonProperty("permission")
  private AppResourceExperimentExperimentPermission permission;

  public AppResourceExperiment setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public AppResourceExperiment setPermission(AppResourceExperimentExperimentPermission permission) {
    this.permission = permission;
    return this;
  }

  public AppResourceExperimentExperimentPermission getPermission() {
    return permission;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppResourceExperiment that = (AppResourceExperiment) o;
    return Objects.equals(experimentId, that.experimentId)
        && Objects.equals(permission, that.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId, permission);
  }

  @Override
  public String toString() {
    return new ToStringer(AppResourceExperiment.class)
        .add("experimentId", experimentId)
        .add("permission", permission)
        .toString();
  }
}
