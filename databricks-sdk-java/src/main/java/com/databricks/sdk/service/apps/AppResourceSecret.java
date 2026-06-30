// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AppResourceSecret {
  /** Key of the secret to grant permission on. */
  @JsonProperty("key")
  private String key;

  /**
   * Permission to grant on the secret scope. For secrets, only one permission is allowed.
   * Permission must be one of: "READ", "WRITE", "MANAGE".
   */
  @JsonProperty("permission")
  private AppResourceSecretSecretPermission permission;

  /** Scope of the secret to grant permission on. */
  @JsonProperty("scope")
  private String scope;

  public AppResourceSecret setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public AppResourceSecret setPermission(AppResourceSecretSecretPermission permission) {
    this.permission = permission;
    return this;
  }

  public AppResourceSecretSecretPermission getPermission() {
    return permission;
  }

  public AppResourceSecret setScope(String scope) {
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
    AppResourceSecret that = (AppResourceSecret) o;
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
    return new ToStringer(AppResourceSecret.class)
        .add("key", key)
        .add("permission", permission)
        .add("scope", scope)
        .toString();
  }
}
