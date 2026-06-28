// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AppResourceJob {
  /** Id of the job to grant permission on. */
  @JsonProperty("id")
  private String id;

  /**
   * Permissions to grant on the Job. Supported permissions are: "CAN_MANAGE", "IS_OWNER",
   * "CAN_MANAGE_RUN", "CAN_VIEW".
   */
  @JsonProperty("permission")
  private AppResourceJobJobPermission permission;

  public AppResourceJob setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public AppResourceJob setPermission(AppResourceJobJobPermission permission) {
    this.permission = permission;
    return this;
  }

  public AppResourceJobJobPermission getPermission() {
    return permission;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppResourceJob that = (AppResourceJob) o;
    return Objects.equals(id, that.id) && Objects.equals(permission, that.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permission);
  }

  @Override
  public String toString() {
    return new ToStringer(AppResourceJob.class)
        .add("id", id)
        .add("permission", permission)
        .toString();
  }
}
