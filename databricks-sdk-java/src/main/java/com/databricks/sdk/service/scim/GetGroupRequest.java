// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

/** Get group details */
public class GetGroupRequest {
  /** Unique ID for a group in the Databricks Account. */
  private String id;

  public GetGroupRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }
}
