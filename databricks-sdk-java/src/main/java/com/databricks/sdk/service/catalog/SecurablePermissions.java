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
  @JsonProperty("permissions")
  private Collection<String> permissions;

  /** The securable for which the access request destinations are being requested. */
  @JsonProperty("securable")
  private Securable securable;

  public SecurablePermissions setPermissions(Collection<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public Collection<String> getPermissions() {
    return permissions;
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
    return Objects.equals(permissions, that.permissions)
        && Objects.equals(securable, that.securable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions, securable);
  }

  @Override
  public String toString() {
    return new ToStringer(SecurablePermissions.class)
        .add("permissions", permissions)
        .add("securable", securable)
        .toString();
  }
}
