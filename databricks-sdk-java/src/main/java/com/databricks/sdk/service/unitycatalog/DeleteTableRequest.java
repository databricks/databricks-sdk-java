// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

/** Delete a table */
public class DeleteTableRequest {
  /** Full name of the table. */
  private String fullName;

  public DeleteTableRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }
}
