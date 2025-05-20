// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AppResourceUcSecurable {
  /** */
  @JsonProperty("permission")
  private AppResourceUcSecurableUcSecurablePermission permission;

  /** */
  @JsonProperty("securable_full_name")
  private String securableFullName;

  /** */
  @JsonProperty("securable_type")
  private AppResourceUcSecurableUcSecurableType securableType;

  public AppResourceUcSecurable setPermission(
      AppResourceUcSecurableUcSecurablePermission permission) {
    this.permission = permission;
    return this;
  }

  public AppResourceUcSecurableUcSecurablePermission getPermission() {
    return permission;
  }

  public AppResourceUcSecurable setSecurableFullName(String securableFullName) {
    this.securableFullName = securableFullName;
    return this;
  }

  public String getSecurableFullName() {
    return securableFullName;
  }

  public AppResourceUcSecurable setSecurableType(
      AppResourceUcSecurableUcSecurableType securableType) {
    this.securableType = securableType;
    return this;
  }

  public AppResourceUcSecurableUcSecurableType getSecurableType() {
    return securableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppResourceUcSecurable that = (AppResourceUcSecurable) o;
    return Objects.equals(permission, that.permission)
        && Objects.equals(securableFullName, that.securableFullName)
        && Objects.equals(securableType, that.securableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, securableFullName, securableType);
  }

  @Override
  public String toString() {
    return new ToStringer(AppResourceUcSecurable.class)
        .add("permission", permission)
        .add("securableFullName", securableFullName)
        .add("securableType", securableType)
        .toString();
  }
}
