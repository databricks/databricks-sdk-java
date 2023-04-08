// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

/** Get warehouse info */
public class GetWarehouseRequest {
  /** Required. Id of the SQL warehouse. */
  private String id;

  public GetWarehouseRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }
}
