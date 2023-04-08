// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

/** Stop a warehouse */
public class StopRequest {
  /** Required. Id of the SQL warehouse. */
  private String id;

  public StopRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }
}
