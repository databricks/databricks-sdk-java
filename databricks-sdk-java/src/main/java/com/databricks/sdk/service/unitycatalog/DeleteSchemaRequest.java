// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

/** Delete a schema */
public class DeleteSchemaRequest {
  /** Full name of the schema. */
  private String fullName;

  public DeleteSchemaRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }
}
