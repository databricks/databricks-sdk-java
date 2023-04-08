// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

/** Get user details */
public class GetUserRequest {
  /** Unique ID for a user in the Databricks Account. */
  private String id;

  public GetUserRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }
}
