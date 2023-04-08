// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

/** Delete a group */
public class DeleteGroupRequest {
  /** Unique ID for a group in the Databricks Account. */
  private String id;

  public DeleteGroupRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }
}
