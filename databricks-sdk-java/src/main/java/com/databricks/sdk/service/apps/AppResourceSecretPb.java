// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AppResourceSecretPb {
  @JsonProperty("key")
  private String key;

  @JsonProperty("permission")
  private AppResourceSecretSecretPermission permission;

  @JsonProperty("scope")
  private String scope;

  public AppResourceSecretPb setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public AppResourceSecretPb setPermission(AppResourceSecretSecretPermission permission) {
    this.permission = permission;
    return this;
  }

  public AppResourceSecretSecretPermission getPermission() {
    return permission;
  }

  public AppResourceSecretPb setScope(String scope) {
    this.scope = scope;
    return this;
  }

  public String getScope() {
    return scope;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppResourceSecretPb that = (AppResourceSecretPb) o;
    return Objects.equals(key, that.key)
        && Objects.equals(permission, that.permission)
        && Objects.equals(scope, that.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, permission, scope);
  }

  @Override
  public String toString() {
    return new ToStringer(AppResourceSecretPb.class)
        .add("key", key)
        .add("permission", permission)
        .add("scope", scope)
        .toString();
  }
}
