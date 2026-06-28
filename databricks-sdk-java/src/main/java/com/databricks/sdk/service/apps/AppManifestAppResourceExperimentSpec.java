// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AppManifestAppResourceExperimentSpec {
  /** */
  @JsonProperty("permission")
  private AppManifestAppResourceExperimentSpecExperimentPermission permission;

  public AppManifestAppResourceExperimentSpec setPermission(
      AppManifestAppResourceExperimentSpecExperimentPermission permission) {
    this.permission = permission;
    return this;
  }

  public AppManifestAppResourceExperimentSpecExperimentPermission getPermission() {
    return permission;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppManifestAppResourceExperimentSpec that = (AppManifestAppResourceExperimentSpec) o;
    return Objects.equals(permission, that.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission);
  }

  @Override
  public String toString() {
    return new ToStringer(AppManifestAppResourceExperimentSpec.class)
        .add("permission", permission)
        .toString();
  }
}
