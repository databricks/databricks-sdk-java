// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

/** Get permission levels */
public class GetPermissionLevels {
  /** <needs content> */
  private String requestObjectId;

  /** <needs content> */
  private String requestObjectType;

  public GetPermissionLevels setRequestObjectId(String requestObjectId) {
    this.requestObjectId = requestObjectId;
    return this;
  }

  public String getRequestObjectId() {
    return requestObjectId;
  }

  public GetPermissionLevels setRequestObjectType(String requestObjectType) {
    this.requestObjectType = requestObjectType;
    return this;
  }

  public String getRequestObjectType() {
    return requestObjectType;
  }
}
