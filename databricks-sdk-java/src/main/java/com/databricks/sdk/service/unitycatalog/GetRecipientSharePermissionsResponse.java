// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class GetRecipientSharePermissionsResponse {
  /** An array of data share permissions for a recipient. */
  @JsonProperty("permissions_out")
  private Collection<ShareToPrivilegeAssignment> permissionsOut;

  public GetRecipientSharePermissionsResponse setPermissionsOut(
      Collection<ShareToPrivilegeAssignment> permissionsOut) {
    this.permissionsOut = permissionsOut;
    return this;
  }

  public Collection<ShareToPrivilegeAssignment> getPermissionsOut() {
    return permissionsOut;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRecipientSharePermissionsResponse that = (GetRecipientSharePermissionsResponse) o;
    return Objects.equals(permissionsOut, that.permissionsOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionsOut);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRecipientSharePermissionsResponse.class)
        .add("permissionsOut", permissionsOut)
        .toString();
  }
}
