// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SecurablePermissions {
  /** List of requested Unity Catalog permissions. */
  @JsonProperty("permission")
  private Collection<String> permission;

  /** The securable for which the access request destinations are being requested. */
  @JsonProperty("securable")
  private Securable securable;

  public SecurablePermissions setPermission(Collection<String> permission) {
    this.permission = permission;
    return this;
  }

  public Collection<String> getPermission() {
    return permission;
  }

  public SecurablePermissions setSecurable(Securable securable) {
    this.securable = securable;
    return this;
  }

  public Securable getSecurable() {
    return securable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SecurablePermissions that = (SecurablePermissions) o;
    return Objects.equals(permission, that.permission) && Objects.equals(securable, that.securable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, securable);
  }

  @Override
  public String toString() {
    return new ToStringer(SecurablePermissions.class)
        .add("permission", permission)
        .add("securable", securable)
        .toString();
  }
}
