// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

/** Delete a share */
public class DeleteShareRequest {
  /** The name of the share. */
  private String name;

  public DeleteShareRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }
}
