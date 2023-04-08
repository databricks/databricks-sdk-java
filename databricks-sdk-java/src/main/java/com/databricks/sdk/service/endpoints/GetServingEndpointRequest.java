// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

/** Get a single serving endpoint */
public class GetServingEndpointRequest {
  /** The name of the serving endpoint. This field is required. */
  private String name;

  public GetServingEndpointRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }
}
