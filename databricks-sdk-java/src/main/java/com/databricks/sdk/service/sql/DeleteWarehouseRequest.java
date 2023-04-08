// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

/** Delete a warehouse */
public class DeleteWarehouseRequest {
  /** Required. Id of the SQL warehouse. */
  private String id;

  public DeleteWarehouseRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }
}
