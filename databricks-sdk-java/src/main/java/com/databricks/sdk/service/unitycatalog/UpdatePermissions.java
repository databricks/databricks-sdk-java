// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdatePermissions {
  /** Array of permissions change objects. */
  @JsonProperty("changes")
  private java.util.List<PermissionsChange> changes;

  /** Full name of securable. */
  private String fullName;

  /** Type of securable. */
  private SecurableType securableType;

  public UpdatePermissions setChanges(java.util.List<PermissionsChange> changes) {
    this.changes = changes;
    return this;
  }

  public java.util.List<PermissionsChange> getChanges() {
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
}
