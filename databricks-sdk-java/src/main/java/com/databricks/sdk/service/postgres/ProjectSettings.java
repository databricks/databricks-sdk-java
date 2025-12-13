// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ProjectSettings {
  /**
   * Sets wal_level=logical for all compute endpoints in this project. All active endpoints will be
   * suspended. Once enabled, logical replication cannot be disabled.
   */
  @JsonProperty("enable_logical_replication")
  private Boolean enableLogicalReplication;

  public ProjectSettings setEnableLogicalReplication(Boolean enableLogicalReplication) {
    this.enableLogicalReplication = enableLogicalReplication;
    return this;
  }

  public Boolean getEnableLogicalReplication() {
    return enableLogicalReplication;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProjectSettings that = (ProjectSettings) o;
    return Objects.equals(enableLogicalReplication, that.enableLogicalReplication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableLogicalReplication);
  }

  @Override
  public String toString() {
    return new ToStringer(ProjectSettings.class)
        .add("enableLogicalReplication", enableLogicalReplication)
        .toString();
  }
}
