// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

/** Query a serving endpoint with provided model input. */
public class QueryRequest {
  /** The name of the serving endpoint. This field is required. */
  private String name;

  public QueryRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }
}
