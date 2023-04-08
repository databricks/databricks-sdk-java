// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class UpdatePermissions {
  /** Array of permissions change objects. */
  @JsonProperty("changes")
  private Collection<PermissionsChange> changes;

  /** Full name of securable. */
  private String fullName;

  /** Type of securable. */
  private SecurableType securableType;

  public UpdatePermissions setChanges(Collection<PermissionsChange> changes) {
    this.changes = changes;
    return this;
  }

  public Collection<PermissionsChange> getChanges() {
    return changes;
  }

  public UpdatePermissions setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public UpdatePermissions setSecurableType(SecurableType securableType) {
    this.securableType = securableType;
    return this;
  }

  public SecurableType getSecurableType() {
    return securableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdatePermissions that = (UpdatePermissions) o;
    return Objects.equals(changes, that.changes)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(securableType, that.securableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes, fullName, securableType);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdatePermissions.class)
        .add("changes", changes)
        .add("fullName", fullName)
        .add("securableType", securableType)
        .toString();
  }
}
