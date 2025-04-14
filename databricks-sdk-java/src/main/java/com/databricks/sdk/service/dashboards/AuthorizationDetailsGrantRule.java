// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AuthorizationDetailsGrantRule {
  /**
   * Permission sets for dashboard are defined in
   * iam-common/rbac-common/permission-sets/definitions/TreeStoreBasePermissionSets Ex:
   * `permissionSets/dashboard.runner`
   */
  @JsonProperty("permission_set")
  private String permissionSet;

  public AuthorizationDetailsGrantRule setPermissionSet(String permissionSet) {
    this.permissionSet = permissionSet;
    return this;
  }

  public String getPermissionSet() {
    return permissionSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AuthorizationDetailsGrantRule that = (AuthorizationDetailsGrantRule) o;
    return Objects.equals(permissionSet, that.permissionSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionSet);
  }

  @Override
  public String toString() {
    return new ToStringer(AuthorizationDetailsGrantRule.class)
        .add("permissionSet", permissionSet)
        .toString();
  }
}
