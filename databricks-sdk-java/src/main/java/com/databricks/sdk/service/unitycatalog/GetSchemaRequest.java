// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

/** Get a schema */
public class GetSchemaRequest {
  /** Full name of the schema. */
  private String fullName;

  public GetSchemaRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }
}
