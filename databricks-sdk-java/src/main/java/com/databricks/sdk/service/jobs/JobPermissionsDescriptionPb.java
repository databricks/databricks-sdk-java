// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class JobPermissionsDescriptionPb {
  @JsonProperty("description")
  private String description;

  @JsonProperty("permission_level")
  private JobPermissionLevel permissionLevel;

  public JobPermissionsDescriptionPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public JobPermissionsDescriptionPb setPermissionLevel(JobPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public JobPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobPermissionsDescriptionPb that = (JobPermissionsDescriptionPb) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(JobPermissionsDescriptionPb.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }
}
