// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetRecipientSharePermissionsResponse {
  /** An array of data share permissions for a recipient. */
  @JsonProperty("permissions_out")
  private java.util.List<ShareToPrivilegeAssignment> permissionsOut;

  public GetRecipientSharePermissionsResponse setPermissionsOut(
      java.util.List<ShareToPrivilegeAssignment> permissionsOut) {
    this.permissionsOut = permissionsOut;
    return this;
  }

  public java.util.List<ShareToPrivilegeAssignment> getPermissionsOut() {
    return permissionsOut;
  }
}
