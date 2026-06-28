// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AppManifestAppResourceSecretSpec {
  /**
   * Permission to grant on the secret scope. For secrets, only one permission is allowed.
   * Permission must be one of: "READ", "WRITE", "MANAGE".
   */
  @JsonProperty("permission")
  private AppManifestAppResourceSecretSpecSecretPermission permission;

  public AppManifestAppResourceSecretSpec setPermission(
      AppManifestAppResourceSecretSpecSecretPermission permission) {
    this.permission = permission;
    return this;
  }

  public AppManifestAppResourceSecretSpecSecretPermission getPermission() {
    return permission;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppManifestAppResourceSecretSpec that = (AppManifestAppResourceSecretSpec) o;
    return Objects.equals(permission, that.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission);
  }

  @Override
  public String toString() {
    return new ToStringer(AppManifestAppResourceSecretSpec.class)
        .add("permission", permission)
        .toString();
  }
}
