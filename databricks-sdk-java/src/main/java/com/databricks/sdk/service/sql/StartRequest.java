// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

/** Start a warehouse */
public class StartRequest {
  /** Required. Id of the SQL warehouse. */
  private String id;

  public StartRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }
}
