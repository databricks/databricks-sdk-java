// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AppManifestAppResourceUcSecurableSpec {
  /** */
  @JsonProperty("permission")
  private AppManifestAppResourceUcSecurableSpecUcSecurablePermission permission;

  /** */
  @JsonProperty("securable_type")
  private AppManifestAppResourceUcSecurableSpecUcSecurableType securableType;

  public AppManifestAppResourceUcSecurableSpec setPermission(
      AppManifestAppResourceUcSecurableSpecUcSecurablePermission permission) {
    this.permission = permission;
    return this;
  }

  public AppManifestAppResourceUcSecurableSpecUcSecurablePermission getPermission() {
    return permission;
  }

  public AppManifestAppResourceUcSecurableSpec setSecurableType(
      AppManifestAppResourceUcSecurableSpecUcSecurableType securableType) {
    this.securableType = securableType;
    return this;
  }

  public AppManifestAppResourceUcSecurableSpecUcSecurableType getSecurableType() {
    return securableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppManifestAppResourceUcSecurableSpec that = (AppManifestAppResourceUcSecurableSpec) o;
    return Objects.equals(permission, that.permission)
        && Objects.equals(securableType, that.securableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, securableType);
  }

  @Override
  public String toString() {
    return new ToStringer(AppManifestAppResourceUcSecurableSpec.class)
        .add("permission", permission)
        .add("securableType", securableType)
        .toString();
  }
}
